package com.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customstring customstring= new Customstring("Jayasree j");
//        System.out.println(customstring.concat("A"));
//        System.out.println(customstring.charAt(2));
//        System.out.println(customstring.equals("Jayasrea"));
//        boolean result = customstring.endswith("sree");
//        System.out.println(result);
//        System.out.println(customstring.indexof("jaya"));
//        System.out.println(customstring.isEmpty());
//        System.out.println(customstring.replace('e','i'));
//        System.out.println(customstring.toLowerCase());
//        System.out.println(customstring.toUppercase());
//        System.out.println(customstring.substring(0,2));
//        System.out.println(customstring.contains("Java"));
//        System.out.println(customstring.trim(  "jaya  abc"));
//        System.out.println(customstring.replaceAll("abc"));
//        System.out.println(customstring.startsWith("j"));
        String[] result=customstring.split(" ");
        System.out.println(Arrays.toString(result));
//        System.out.println(customstring.compareTo("aA"));
//        System.out.println(customstring.compareToIgnorance("bb"));
    }
}
