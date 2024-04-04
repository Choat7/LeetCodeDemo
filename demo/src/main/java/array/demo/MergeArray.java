package array.demo;

import java.util.Arrays;
import java.util.Collections;

/**
 * 合并两个有序数组
 */
public class MergeArray {

    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     *
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     *
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
     * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 数组1的最后一个有效值的下标
        int index1 = m - 1;
        // 数组2的最后一个值的下标
        int index2 = n - 1;
        // 数组1的最后一个值的下标
        int tail = m + n -1;
        // 循环中的临时当前变量
        int cur;
        while (index1 >= 0 || index2 >= 0) {
            // 如果m-1等于-1，说明m是0，则直接将数组2的值合并到数组1中
            if (index1 == -1) {
                cur = nums2[index2--];
                // 如果n - 1等于-1，说明n是0，则直接将数组1的值合并到数组1中
            } else if (index2 == -1) {
                cur = nums1[index1--];
                // 从两个数组的最后一个元素开始比较，取出最大值
            } else if (nums2[index2] > nums1[index1]) {
                cur = nums2[index2--];
            } else {
                cur = nums1[index1--];
            }
            // 逆序思路，将当前值从后往前放
            nums1[tail--] = cur;
        }
    }
}
