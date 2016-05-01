package com.gyn.home;

/**
 * 选择排序
 * <p>
 * Created by gongyining on 2016/5/1.
 */
public class Selection {
    /**
     * 选择排序简单方便，但不善于利用数组的初始状态，即使是一个有序的数组性能也并不会提升多少。
     * @param a
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 7, 6, 9, 3};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
