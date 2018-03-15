package com.maxml.oca;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class ThirdTheme {

    public static void main(String[] Args) {
//        exValueOf();

//        exSecondTest();

//        exConcatenation();

//        exImmutable();

//        exStringPool();

//        exStringBuilder();

//        exArrays();

//        exNewTimePackage();

//        exTimePeriod();

//        exISOFormatter();

//        exParsingDateTime();

//        exEquallityStringBuilder();

//        try {
//            exException();
//        } catch (Exception ex) {
//        } catch (OpenException e) {
//            System.out.println("sdfsd");
//        } catch (CloseException e) {
//            System.out.println("asdfvsd");
//        }

//        C obj = exExtends();
//        System.out.println(obj.toString());
//        System.out.println(obj instanceof C);
//        System.out.println(obj instanceof A);

//        try {
//            exAutoCloseable2();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        exError();

        exFailClose();
    }

    public static void exEquallityStringBuilder() {
        StringBuilder str1 = new StringBuilder("qwe");
        StringBuilder str2 = new StringBuilder("qwe");
        StringBuilder str3 = str2;
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str1));
        System.out.println(str2.equals(str3));
    }

    private static void exParsingDateTime() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);
        System.out.println(time);
    }

    private static void exISOFormatter() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));

        DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(dateTime.format(mediumDateTime));
        System.out.println(date.format(mediumDateTime));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));
    }

    private static void exTimePeriod() {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("new: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

    private static void exCarefulTimePeriod() {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period2 = Period.ofMonths(1);
        System.out.println(date.plus(period2)); // 2015-02-20
        System.out.println(dateTime.plus(period2)); // 2015-02-20T06:15
        System.out.println(time.plus(period2));
    }

    private static void exPeriodWeekYear() {
        Period everyYearAndAWeek = Period.of(1, 0, 7);

        Period wrong = Period.ofYears(1).ofWeeks(1);

        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(1);

        LocalDate.now().plus(wrong);
        System.out.println(LocalDate.now().plus(wrong).plus(wrong2));
    }

    private static void exNewTimePackage() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        LocalTime time3 = LocalTime.of(6, 15, 30, 200);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);

        LocalDate.of(2015, Month.JANUARY, 32); // throw DateTimeException

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);
    }

    public static void exArrays() {
//        int [] numbers;
//        int [] numbers2, numbers3;
//        int [] numbers4, []numbers5;

        int[] numbers = new int[6];
//        System.out.println(numbers.equals(null));

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//        objects[0] = new StringBuilder();

//        int[][] args = new int[3][];
    }

    public static void exStringBuilder() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);
    }

    private static void exStringPool() {
        String name = "JVMKnowing";
        String name2 = new String("no for JVM");

        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z);
    }

    private static void exReplace() {
        //        System.out.println(new String("abc").replace('a', "A"));
    }

    private static void exImmutable() {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }

    private static void exConcatenation() {
        System.out.println("1" + "2");
        System.out.println(1 + 2 + "c");
        System.out.println("c" + 1 + 2);

        int d = 3;
        String e = "d";
        char h = 'h';
        System.out.println(h + 3 + d);
        System.out.println(1 + 2 + d + e);
        System.out.println(1 + 2 + d + h);

        //        e += e + 3;
        System.out.println(e);
    }

    private static void exSecondTest() {
        long x = 10;
        int y = 2 * (short) x;

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(14);
        for (int i : list) {
            System.out.println(i + ", ");
            continue;
        }

        int a = 5;
        int b = a * 5 - a++;
        System.out.println(b);

        final char c = 'A', d = 'E';
        char gra = 'B';
        switch (gra) {
            case c:
                break;
            case d:
                break;
        }
    }

    private static void exValueOf() {
        String buff = "a";
        System.out.println(Integer.valueOf(buff));
    }

    private static class OpenException extends Exception {
    }

    private static class CloseException extends Exception {
    }

    // https://docs.oracle.com/javase/8/docs/technotes/guides/language/catch-multiple.html
    private static void exException() throws OpenException, CloseException {
        // more precise rethrow
        boolean flag = true;
        try {
            if (flag) {
                throw new OpenException();
            } else {
                throw new CloseException();
            }
        } catch (Exception e) {
            throw e;
        }

//        try {
//            throw new Error();
//        } catch (Throwable e) {
//            throw e;
//        }
    }

    private static class A extends C {
        @Override
        public String toString() {
            return "A";
        }
    }

    private static class B extends C {
        @Override
        public String toString() {
            return "B";
        }
    }

    private static class C {
        @Override
        public String toString() {
            return "C";
        }
    }

    private static C exExtends() {
        boolean flag = true;
        if (flag) {
            return new A();
        } else {
            return new B();
        }
    }

    private static void exError() {
        try {
            throw new RuntimeException();
        } catch (Error e) {

        }

        try {
//            if (tr ue) {
            throw new Error();
//            } else {
//                throw new Error();
//            }
        } finally {
            System.out.println("sdf");
        }
//        System.out.println("sdfdv");

    }


    private static void exError2() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (Error e) {
            System.out.println("1");
        } finally {
            System.out.println("3");
        }
//        System.out.println("2");
    }

    private static class D implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("asv");
        }
    }

    private static void exAutoCloseable() {
        try (D d = new D()) {
            System.out.println("sdf");
            throw new OpenException();
        } catch (Exception e) {
//            d.close();
            System.out.println("yguk");
        } finally {
            System.out.println("asdf");
        }
        System.out.println("iyl");
    }

    private static void exAutoCloseable2() throws Exception {
        D dext = new D();
        try (D d = dext) {
            System.out.println("sdf");
            throw new OpenException();
        } catch (Exception e) {
            dext.close();
            System.out.println("yguk");
        }
    }

    private static class Y {
        public Y() {
            throw new RuntimeException();
        }
    }

    private static void exFailInit() {
        int x;
        if (true) {
            x = 1;
        }
//        System.out.println(x);

        Y y;
        try {
            y = new Y();
        } catch (Exception ex) {

        }
//        System.out.println(y);
    }

    private static class FailClose implements AutoCloseable {
        public FailClose() throws Exception {
            System.out.println("start");
            throw new CloseException();
        }

        @Override
        public void close() throws Exception {
            System.out.println("close");
            throw new OpenException();
        }
    }

    private static void exFailClose() {
        try (FailClose fc = new FailClose(); FailClose fc2 = new FailClose()) {
            System.out.println("body");
            throw new Exception("dfdfd");
        } catch (OpenException e) {
            System.out.println("open exception");
        } catch (CloseException e) {
            System.out.println("close exception");
        } catch (Exception e) {
            System.out.println("catch exception");
        }
    }
}
