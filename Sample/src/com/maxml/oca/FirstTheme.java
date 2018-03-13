package com.maxml.oca;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class FirstTheme {

    private static void read(Files files) {
        Paths.get("name");
    }

    private String first = "rdg";
//    private String second = first;

    public void Main() {
        System.out.println("There is a constructor!");
    }

//    {
//        System.out.println("WTF?");
//    }

    public static void main(String[] args) throws IOException {
//        exset();

//        System.out.println(4 % 3);

        exgoto();
        exgoto2();
        exgoto3();

//        /*
//         * /*edfvs*/
//         */
//        int o7;

//        getExFile();
//        exHashMap();

//        exStringNullEmpty();
//        exOperations();
//        exClearList();

//        exGson();
//        exPrimitiveCasting();

//        exGreatLess();

//        exClearList();
//        exOperations();
//        exset();
    }

    // import java.nio.*;

    // import java.util.*;
    // import java.sql.*;

    // import java.util.*;
    // import java.sql.Date;

    // import java.util.Date;
    // import java.sql.Date;

    private static void exGreatLess() {
        int x = 0;
        while (++x < 5) {
            x += 1;
        }
        String message = x > 5 ? "Great" : "Less";
        System.out.println(message + "," + x);
    }

    private static void exPrimitiveCasting() {
//        byte namePets = 5;
//        float value1 = 102;
//        float value2 = (int) 102;
//        float value3 = 102f * 0.0;
//        float value4 = 102f * (short) 0.0;
//        float value5 = 102f * (boolean) 0;

//        int next = 1231231223;
//        long max = 1234555342234234234l;
//        System.out.println(100_000_009);
//        int temp = 0x00CAF;
//        int temp2 = 077;
//        System.out.println(0b11);

//        System.out.println(_100);
//        System.out.println(10_0_);
//        System.out.println(100.0_0);
//        System.out.println(100_.0_0);
//        System.out.println(100._0_0_);
    }

    private static void exDeclaring() {
//        int value = null;

//        String s1, s2;
//        String s3 = "no", s4 = "yes";
//        int i1, i2, i3 = 0;

//        int i1, double i2;
    }

    private static void exIdentifiers() {
//        String str, str2, #str3, $str4, @str5, %str6, &str7, _str8, __str9, 123sert, Const,
//          assert, do, native, strictfp, transient, try,
//          str$10, 3DPointClass, hello_eow, A$B;
    }

    private static void exLocalVariables(boolean check) {
//        int x, y = 10;
//        int z = x + y;
//        System.out.println(z);

//        int answer;
//        int branch;
//        if (check) {
//            branch = 1;
//            answer = 1;
//        } else {
//            answer = 2;
//        }
//        System.out.println(answer);
//        System.out.println(branch);
    }

    private static void exScope() {
        if (true) {
            int value = 30;
        }
//        System.out.println(value);

        // local, instance, class
    }

    private static void exGson() {
        String str = "{\n" +
                "   \"DiagnosticResult\": {\n" +
                "      \"captivePortalTest\": {\n" +
                "         \"result\": \"OPEN\",\n" +
                "         \"time\": \"2018-01-26T11:47:01+0200\",\n" +
                "         \"url\": \"http://connectivitycheck.gstatic.com/generate_204\"\n" +
                "      },\n" +
                "      \"illegalCharacters\"\": {\n" +
                "         \"octal\": \" 2 \",\n" +
                "         \"t_symbol\": \"\t\",\n" +
                "         \"n_symbol\": \"\n" +
                "\",\n" +
                "         \"quote\": \" \" \",\n" +
                "         \"double_backslash\": \" \\ \",\n" +
                "         \"double_slash\": \" // \",\n" +
                "         \"single_quotes\": \" ' \",\n" +
                "         \"unicode\": \" 2 \",\n" +
                "         \"r_symbol\": \"\n" +
                "\"\n" +
                "      }\n" +
                "   }\n" +
                "}";
        JsonObject obj = new Gson().fromJson(str, JsonObject.class);
        System.out.println(obj.toString());
    }

    private static void exClearList() {
        ArrayList list = new ArrayList();
        list.add("first");
        list.add("second");
        list.add("third");

        list.subList(1, list.size()).clear();
        System.out.println(new String("sdf").substring(0, 3));

        System.out.println(list.toString());
    }

    private static void exOperations() {
        boolean first = false;
        boolean second = true;
        boolean third = true;

        System.out.println(first && second || third);
    }

    private static void exStringNullEmpty() {
        String str = null;
        if (str.isEmpty()) {
            System.out.println("dfbjkl");
        }
    }

    private static void exHashMap() {
        HashMap<String, String> map = new HashMap();
        map.put("1", "2");
        map.put("1", "3");
        System.out.println(map.toString());
    }

    private static void getExFile() throws IOException {
        File file = new File("tmpFile.tmp");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(new byte[]{1, 2, 3});
        outputStream.close();
    }

    private static void exset() {
        ArrayList<? super Number> list = new ArrayList<>();
        list.add(new Integer(6));
        list.add(9.);
        list.set(1, 8);
        System.out.println(list.toString());
        System.out.println(new Integer(3).toString());
    }

    private static void exgoto() {
        int i = 0, x = 0;
        INNER:
        do {
            i++;
            if (i > 3) break INNER;
            x++;
        } while (i < 30);
        System.out.println(x + ", " + i);
    }

    private static void exgoto2() {
        int i = 0, x = 0;
        INNER:
        while (i < 30) {
            i++;
            if (i > 3) continue INNER;
            x++;
        }
        System.out.println(x + ", " + i);
    }

    private static void exgoto3() {
        int i = 0, x = 0;
        while (i < 30) {
            x++;
            if (i > 3) break;
            i++;
        }
        System.out.println(x + ", " + i);
    }
}

// javac Second.java
//public class Second {
//
//    public static void main(String... args) {
//        System.out.print("0=" + args[0]);
//        System.out.println("1=" + args[2]);
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//    }
//}
