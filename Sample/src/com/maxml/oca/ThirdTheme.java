package com.maxml.oca;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * String: length(), charAt(exception), indexOf(-1), substring(exception: start > end, end > length()), toLowerCase(), toUpperCase()
 * equals(), equalsIgnoreCase(), startWith(boolean), endWith(), contains(), replace(), trim()
 * <p>
 * StringBuilder: append(), insert(), delete(), deleteCharAt(), reverse(), toString()
 * <p>
 * Sorting: Numbers sort before letters and uppercase sorts before lowercase
 * <p>
 * ArrayList: add(), remove(), set(), isEmpty(), size(), clear(), contains(), equals()
 */
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

        exSubstring();

//        exCasting();
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

    private static void exEquallityStringBuilder() {
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
            upTo = upTo.plus(period);
        }
    }

    private static void exCarefulTimePeriod() {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period2 = Period.ofMonths(1);
        System.out.println(date.plus(period2));
        System.out.println(dateTime.plus(period2));
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

    private static void exArrays() {
//        int[] numbers;
//        int numbers2[], numbers3 [];
//        int [] numbers4, []numbers5;

//        int [] numbers6, numbers7;
//        numbers7 = 5;

//        int d[][];
//        int[] d2[], d3[], d4[][];

        int[] numbers2 = new int[6];
//        System.out.println(numbers2.equals(null));

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//        objects[0] = new StringBuilder();

//        int[][] args = new int[3][];

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));
    }

    private static void exStringBuilder() {
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

        StringBuilder temp1 = new StringBuilder("abc");
        StringBuilder temp2 = new StringBuilder("abc");
        System.out.println(temp1.equals(temp2));
        System.out.println(temp1 == temp2);

//        StringBuilder temp = "rumble";
//        temp.append(4).deleteCharAt(3).delete(3, temp.length() - 1);
    }

    private static void exStringPool() {
        String name = "JVMKnowing";
        String name2 = new String("no for JVM");

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z);
    }

    private static void exReplace() {
        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

//        System.out.println(new String("abc").replace('a', "A"));
    }

    private static void exImmutable() {
        String s = "abc";
        s.toLowerCase();
        System.out.println(s);

//        String s1 = "1";
//        String s2 = s1.concat("2");
//        s2.concat("3");
//        System.out.println(s2);
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

        e += e + 3;
        System.out.println(e);
    }

    private static void exValueOf() {
        String buff = "a";
        System.out.println(Integer.valueOf(buff));
    }

    private static void exWrongEquals() {
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
//        if (s1 == s2)
//            System.out.print("1");
//        if (s1.equals(s2))
//            System.out.print("2");
    }

    private static void exAutoboxing() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt("4"));
        list.add(Integer.valueOf("4"));
        list.add(7);
    }

    private static void exSubstring() {
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));

        System.out.println("123".substring(1, 1));
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        String s = "";
//        s += 'c' + false;
        System.out.println("");
    }

    private static void exCasting() {
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder();
        objects[0] = new StringBuilder();


        List<Integer> list2 = new ArrayList<>();
//        list2.add(null);
//        System.out.println(list2.get(0));

        List<String> temp = new ArrayList<>();
        temp.add("hawk");
        temp.add("robin");
        System.out.println(temp.toArray().length);
        String[] stringArray = temp.toArray(new String[0]);
        System.out.println(stringArray.length);

        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        list.set(1, "test");
        array[0] = "new";
        for (String b : array) System.out.print(b + " ");
//        list.remove(1);
    }
}
