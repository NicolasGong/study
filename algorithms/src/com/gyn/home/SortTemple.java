package com.gyn.home;

/**
 * 排序算法作为算法的基础的基础大多都是像如下模板一样
 * <p>
 * Created by gongyining on 2016/5/1.
 */
public class SortTemple {
    /**
     * 算法的代码主要是在这里
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
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
        String[] a = {"aaa", "bbb", "zzz", "fff", "www"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
