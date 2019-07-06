package com;

import org.apache.commons.lang3.StringUtils;

public class Runner {
    public static void main(String[] args) {
        printName("Sergey");
    }

    private static void printName(String name) {
        System.out.println("Name : " + StringUtils.upperCase(name));
    }
}
