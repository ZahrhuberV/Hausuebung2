package com.company;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Welt");
        list.add("!");
        for (String s: list) {
            System.out.println(s);
        }

        list.forEach((String s) -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
