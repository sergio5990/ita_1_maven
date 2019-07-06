package com;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Runner {
    private static final Pattern COMPILE = Pattern.compile(",");

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
        return Arrays.asList(COMPILE.split(test, -1));
    }
}
