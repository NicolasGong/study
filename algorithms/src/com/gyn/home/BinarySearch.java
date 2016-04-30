package com.gyn.home;

/**
 * 二分查找
 * <p>
 * Created by gongyining on 2016/4/30.
 */
public class BinarySearch {
    /**
     * 二分查找时传入的数组必须有序
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,5,6,9,10,13};
        int index = rank(10,numbers);
        System.out.println(index);
        System.out.println(numbers[index]);
    }
}
