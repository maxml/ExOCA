package com.maxml.oca;

public class ThirdTheme {

    public static void main(String[] Args) {
        System.out.println("Hello");

        exValueOf();
    }

    private static void exValueOf() {
        String buff = "a";
        try {
            System.out.println(Integer.valueOf(buff));
        } catch (NumberFormatException ex) {
            
        }
    }
}
