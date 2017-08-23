package com.leetcode;

/**
 * Created by chenwinfred on 11/13/16.
 */
public class BestTimeToSellStock {
    public static void main(String[] args) {
        BestTimeToSellStock o = new BestTimeToSellStock();

        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println(o.maxProfit(prices));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(o.maxProfit(prices2));

        int[] prices3 = {2, 1, 4};
        System.out.println(o.maxProfit(prices3));

        int[] prices4 = {0, 6, -3, 7};
        System.out.println(o.maxProfit(prices4));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {
            // 循环记录当前最小值
            minNum = prices[i] < minNum ? prices[i] : minNum;

            // 用当前值减去最小值，则得到当前的差值
            int curProfit = prices[i] - minNum;

            // 历史最大差值跟当前值比较
            maxProfit = curProfit > maxProfit ? curProfit : maxProfit;
        }
        if (maxProfit < 0) maxProfit = 0;
        return maxProfit;
    }

    // 求一个int数组中连续子串的最大值
//    public int maxProfit(int[] prices) {
//        int cur = 0, max = 0;
//
//        for (int i=0; i<prices.length; i++) {
//            cur = Math.max(cur+prices[i], prices[i]);
//            max = Math.max(cur, max);
//        }
//
//        return max;
//    }



    // solution 1 - Time Limit Exceeded
    public int maxProfit3(int[] prices) {
        int result = 0;
        for (int i=0; i<prices.length-1; i++) {
            int diff = getDiff(prices, i);
            result = diff > result ? diff : result;
        }
        return result;

    }

    private int getDiff(int[] prices, int pos) {
        int min=prices[0], max=prices[pos+1];
        for(int i=0; i<=pos; i++) {
            min = prices[i] < min ? prices[i] : min;
        }

        for (int j=pos+1; j<prices.length; j++) {
            max = prices[j] > max ? prices[j] : max;
        }
        return max - min;
    }

}
