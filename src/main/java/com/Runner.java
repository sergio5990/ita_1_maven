package com;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        printName("Sergey");
    }

    static void printName(String name) {
        System.out.println("Name : " + StringUtils.upperCase(name));
    }

    static List<String> splitTest(String test){
        if (test == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(test.split(","));
    }
}
