package com.gyn.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 标准输入流
 * <p>
 * Created by gongyining on 2016/4/30.
 */
public class StdIn {

    public static char charIn() {
        char read = '0';
        System.out.println("输入字符：");
        try {
            read = (char) System.in.read();
        }catch(Exception e){
            e.printStackTrace();
        }
        return read;
    }

    public static String lineIn() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = null;
        System.out.print("输入数据：");
        try {
            read = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return read;
    }

    public static void main(String[] args) {
        while (true) {
            String str = lineIn();
            System.out.println(str);
//            char c = charIn();
//            System.out.println(c);
        }
    }
}
