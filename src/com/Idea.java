package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @date 2021/4/10 - 19:09
 */
public class Idea {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sss");
        list.add("sss");
        list.add("sss");
        list.add("sss");
        list.add("sss");
        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
}
