package com.maxml.multithreading;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] Args) {
        getUserProcessors();

        threadCost();

        // wait/notify
//        CountDownLatch
    }

    private static void threadCost() {
        long time = System.currentTimeMillis();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    System.out.println(i);
                }
                long diff = System.currentTimeMillis() - time;
                System.out.println("Available time = " + diff);
                System.out.println(LocalTime.ofNanoOfDay(diff));
                System.out.println(LocalTime.ofSecondOfDay(diff));
            }
        }).start();
    }

    private static void getUserProcessors() {
        System.out.println("Available processors = " + Runtime.getRuntime().availableProcessors());
    }
}
