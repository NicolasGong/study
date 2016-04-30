package com.gyn.home;

import java.util.*;

/**
 * 这才是正确的删除办法
 *
 * Created by gongyining on 2016/4/30.
 */
public class RightRemoveDemo {
    private Map<String, String> map = null;
    private List<String> list = null;

    public RightRemoveDemo() {
        map = new HashMap<>();
        map.put("aaa", "111");
        map.put("bbb", "222");
        map.put("ccc", "333");
        map.put("ddd", "444");
        list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
    }

    public Map<String, String> getMap() {
        return map;
    }

    public List<String> getList() {
        return list;
    }

    public static void main(String[] args) {
        RightRemoveDemo demo = new RightRemoveDemo();
        Iterator<Map.Entry<String, String>> mapIterator = demo.getMap().entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String,String> ety = mapIterator.next();
            if (ety.getKey().equals("bbb")) {
                mapIterator.remove();
            }
        }
        System.out.println(demo.getMap().toString());
        Iterator<String> listIterator = demo.getList().iterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (next.equals("aaa")) {
                listIterator.remove();
            }
        }
        System.out.println(demo.getList().toString());
    }
}
