package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenwinfred on 11/22/16.
 *
 * https://leetcode.com/problems/unique-binary-search-trees-ii/
 *
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}


public class UniqueBinarySearchTrees2 {

    public static void main(String[] args) {
        UniqueBinarySearchTrees2 o = new UniqueBinarySearchTrees2();


    }


    // G(n) = F(1,n) + F(j, n) + ... + F(n, n)   其中j为根元素
    // F(j, n) = G(j-1) * G(n-j)
    public List<TreeNode> numTrees(int n) {
        List<TreeNode>[] G = new List[n+1];
        G[0] = new ArrayList<TreeNode>();
        if (n==0) return G[0];
        G[0].add(null);

        G[1] = new ArrayList<TreeNode>();
        G[1].add(new TreeNode(1)); // 只有一个节点的时候

        // 有i个元素，j为根，左边有j-1个元素，右边有i-j个元素
        for (int i=2; i<=n; i++) {
            G[i] = new ArrayList<TreeNode>();
            for (int j=1; j<=i; j++) {
                for (TreeNode nodeL : G[j-1]) {
                    for (TreeNode nodeR : G[i-j]) {
                        TreeNode node = new TreeNode(j);
                        node.left = nodeL;
                        node.right = clone(nodeR, j);
                        G[i].add(node);
                    }
                }
            }
        }
        return G[n];
    }

    private static TreeNode clone(TreeNode n, int offset) {
        if (n == null) {
            return null;
        }
        TreeNode node = new TreeNode(n.val + offset);
        node.left = clone(n.left, offset);
        node.right = clone(n.right, offset);
        return node;
    }

}
