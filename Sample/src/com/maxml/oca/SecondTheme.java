package com.maxml.oca;

import java.io.File;

public class SecondTheme {

    public static void main(String[] args) {
//        exIncrement();

//        exOperators();

//        exOrder();

//        exNested();

//        exBreakLabels();

//        exContinue();

//        exEquality();

        exIncrement();
    }

    private static void exNumericPromotions() {
        short x = 10;
        short y = 3;
//        short z = x / y;
//        System.out.println(x / y);
    }

    private static void exOperators() {
        System.out.println(11 / 3);
        System.out.println(11 % 3);

//        System.out.println(-true);
//        System.out.println(!0);
//        boolean z = !0;

        boolean a = true;
        boolean b = false;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(3 ^ 3);
    }

    private static void exEquality() {
        File file1 = new File("1");
        File file2 = new File("1");
        File file3 = file2;
        System.out.println(file1 == file2);
        System.out.println(file1 == file3);
        System.out.println(file2 == file3);
    }

    private static void exOrder() {
        System.out.println(2 * 5 + 3 * 4 - 8);
        System.out.println(2 * ((5 + 3) * 4 - 8));
    }

    private static void exIncrement() {
//        int counter = 1;
//        System.out.println(counter); // 1 2 2 2 1
//        System.out.println(++counter);
//        System.out.println(counter);
//        System.out.println(counter--);
//        System.out.println(counter);
//
//        int y = 4;
//        System.out.println(3 + 2 * --y); // 9
//        System.out.println(3 + 2 * y++); // 9
//        System.out.println(y);

//        int x = 3;
//        int z = ++x + x++ + ++x * 5 / x-- + ++x;
//        System.out.println(x); // 4
//        System.out.println(z); // 9 10

        for (int i = 0; i < 10; ) {
            i = i++;
            System.out.println("Hello " + i);
        }
    }

    private static void exCasting() {
//        int temp1 = 9f;
//        long temp2 = 11111111111111111l;
//        long temp3 = 222222222222222222;
//        short temp4 = (short) 333333333;
//        int temp5 = (short) 1.0;

        long temp7 = 5;
//        long temp6 = (temp7 = 3);
        System.out.println(temp7);
//        System.out.println(temp6);

        byte a = 40, b = 50;
//        byte sum = (byte) a + b;
//        System.out.println(sum);
    }

    private static void exCompound() {
        long x = 10;
        int y = 5;
//        y = y * x;
//        y *= x;
    }

    private static void exIf() {
//        int x = 0;
//        if (x) {
//
//        }
//        if (x = 5) {
//
//        }
    }

    private static void exTernary() {
        int y = 0;
//        System.out.println((y > 5) ? 21 : "Horse");
//        int animal = (y > 5) ? 21 : "Horse";

        int x = 5;
//        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }

    private static void exSwitch() {
//        boolean temp = true;
//        char temp = 'c';
//        int temp = 3;
//        long temp = 3;
//        String temp = "";
//        Object temp = new Object();

//        switch (temp) {
//
//        }

        int buff = 0;
        switch (buff) {
            case 0:
                System.out.println("first");
            default:
                System.out.println("second");
            case 1:
                System.out.println("third");
                break;
        }


        String firstname = "";
        String lastName = "";
        final String thirdName = "";
        switch (firstname) {
//            case "Test":
//            case lastName:
//            case thirdName:
//            case 5:
//            case 'c':
//            case Weekday.SUNDAY:
//            case Weekday.TUESDAY.name():
//            case Weekday.TUESDAY.toString():
        }

        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
//            case a:
//            case d:
        }
    }

    enum Weekday {
        SUNDAY, TUESDAY
    }

    private static void exWhile() {
        int x = 0;
        int y = 9;
        while (x < 10) {
            y++;
        }
    }

    private static void exFor() {
//        int y = 0;
//        for (long x = 0, z = 4, y = 3; x < 5 && z > 5; x++, y++) {
//        }
//        for (long x = 0, int z = 4; x < 5 && z > 5; x++, y++) {
//        }
//        System.out.println(x);
    }

    private static void exForeach() {
//        String names = "Lisd";
//        for (String s : names) {
//            System.out.println(s);
//        }
    }

    private static void exNested() {
        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
            System.out.println(x + '\t');
        }
    }

    private static void exBreakLabels() {
        int[][] arrayOfInts = {{1, 13, 5},
                {1, 2, 5},
                {2, 7, 2}};
        int searchValue = 2;

        int positionX = -1;
        int positionY = -1;

        OUTER_LOOP:
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break OUTER_LOOP;
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println(searchValue + " found at: " +
                    "(" + positionX + "," + positionY + ")");
        }
    }

    private static void exContinue() {
        for (int a = 1; a <= 4; a++) {
            OUTER_LOOP:
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') {
                    continue OUTER_LOOP;
                }
                System.out.println(" " + a + x);
            }
        }
    }

    private static void exWhile2() {
        int x = 0;
        while (x++ < 10) {
        }
        System.out.println(x);
    }
}
