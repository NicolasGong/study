package com.gyn.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 将屏蔽的代码放开结果就不一样了，你知道为什么吗？
 *
 * Created by gongyining on 2016/4/24.
 */
public class RemoveDemo {
    private Map<String, String> map = null;
    private Map<String, String> map2 = null;

    private List<String> list = null;
    private List<String> list2 = null;

    public RemoveDemo() {
        map = new HashMap<>();
        map.put("aaa", "111");
        map.put("bbb", "222");
        map.put("ccc", "333");
        map2 = new HashMap<>();
        map2.put("aaa","111");
        map2.put("bbb","222");
        map2.put("ccc","333");
        map2.put("ddd","444");
        list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");
    }

    public Map<String, String> getMap2() {
        return map2;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public List<String> getList() {
        return list;
    }

    public List<String> getList2() {
        return list2;
    }

    public static void main(String[] args) {
        RemoveDemo demo = new RemoveDemo();
        for (Map.Entry<String, String> ety : demo.getMap().entrySet()) {
            String key = ety.getKey();
            if (key.equals("bbb")) {
                demo.getMap().remove(key);
            }
        }
        System.out.println(demo.getMap().toString());
//        for (Map.Entry<String, String> ety : demo.getMap2().entrySet()) {
//            String key = ety.getKey();
//            if (key.equals("bbb")) {
//                demo.getMap2().remove(key);
//            }
//        }
//        System.out.println(demo.getMap2().toString());
        for (String str : demo.getList()) {
            if (str.equals("bbb")) {
                demo.getList().remove(str);
            }
        }
        System.out.println(demo.getList().toString());
//        for (String str : demo.getList2()) {
//            if (str.equals("bbb")) {
//                demo.getList2().remove(str);
//            }
//        }
//        System.out.println(demo.getList2().toString());
    }
}
