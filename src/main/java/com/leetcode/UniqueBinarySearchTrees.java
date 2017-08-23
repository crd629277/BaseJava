package com.leetcode;

/**
 * Created by chenwinfred on 11/22/16.
 *
 * https://leetcode.com/problems/unique-binary-search-trees/
 *
 */
public class UniqueBinarySearchTrees {

    public static void main(String[] args) {
        UniqueBinarySearchTrees o = new UniqueBinarySearchTrees();

        System.out.println(o.numTrees(3)); // 5
        System.out.println(o.numTrees(4)); // 14
    }

    // G(n) = F(1,n) + F(j, n) + ... + F(n, n)   - j为根元素
    // F(j, n) = G(j-1) * G(n-j)
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;

        // 有i个元素，j为根，左边有j-1个元素，右边有i-j个元素
        for (int i=2; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                G[i] += G[j-1] * G[i-j];
            }
        }
        return G[n];
    }
}
