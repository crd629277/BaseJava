package com.leetcode;

/**
 * Created by chenwinfred on 17/7/2.
 *
 * https://leetcode.com/problems/move-zeroes/#/description
 */
public class MoveZeros {

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();

        int[] nums = {0, 1, 0, 3, 12}; // excepted {1, 3, 12, 0, 0}
        moveZeros.moveZeroes(nums);

        for (int value : nums) {
            System.out.println(value);
        }

    }


    // 把非0数字往前移，后面补0
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int value : nums) {
            if (value != 0) {
                nums[insertPos++] = value;
            }
        }

        for (int k=insertPos; k<nums.length; k++) {
            nums[k] = 0;
        }
    }
}
