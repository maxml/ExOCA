package com.maxml.oca;

public class InitOrder {

    //    {
//        System.out.println(name);
//    }
    private String name;

    {
        System.out.println("setting fields");
    }

    public InitOrder() {
        System.out.println("Setting constructor");
        System.out.println("Name=" + name);
        name = "Tiny";
    }

    public static void main(String[] Args) {
        InitOrder order = new InitOrder();
        System.out.println(order.name);
        System.out.println(order.name3);
        System.out.println(order.name4);
    }

    private Integer name2 = new Integer(3);
    private Integer name3 = name2;

    {
        name2 = new Integer(4);
        System.out.println("Name = " + name);
        name3 = null;
    }

    Integer name4 = name2;
}
