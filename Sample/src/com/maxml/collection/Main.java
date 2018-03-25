package com.maxml.collection;

import java.util.*;

/**
 * Question 1: How to find middle element of linked list in one pass? +*
 * Question 2: How to find if linked list has a loop ? +
 * Question 3: How to find 3rd element from end in a linked list in one pass? +
 * Question 4: In an integer array, there is 1 to 100 number, out of one is duplicate, how to find? +
 * Question 6: How to reverse String in Java? +
 * Question 7: Write a Java program to sort an array using Bubble Sort algorithm? +
 * Question 8: What is the difference between Stack and Queue data structure? +
 * Question 9: How do you find duplicates in an array if there is more than one duplicate?
 * Question 10: What is difference between Singly Linked List and Doubly Linked List data structure?
 * Question 11: Write Java program to print Fibonacci series ?
 * Question 12: Write Java program to check if a number is a palindrome or not?
 * Question 13: What is binary search tree?
 * Question 14: How to reverse linked list using recursion and iteration?
 * Question 15: Write a Java program to implement Stack in Java?
 */
public class Main {

    public static void main(String[] Args) {
        // 1
        LinkedList<String> input = new LinkedList<>();
        input.add("first");
        input.add("second");
        input.add("third");
        input.add("four");
        input.add("fifth");
//        System.out.println(calculateMiddleElement(input));

//        System.out.println(ifCyclic(input));

//        System.out.println(calculateNeededFromEnd2(input, 3));
//        System.out.println(input);

        int[] array = new int[100];
        Arrays.fill(array, new Random().nextInt(100));
//        Arrays.toString(array);
//        System.out.println(isAnyDuplicates(array));
        System.out.println(isAnyDuplicates2(Arrays.stream(array).boxed().toArray(Integer[]::new)));
    }

    private static String calculateMiddleElement(LinkedList<String> input) {
        return input.get(input.size() / 2);
    }

    private static boolean ifCyclic(LinkedList<String> input) {
        int size = input.size();
        int counter = 0;

        Iterator<String> iterator = input.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            counter++;

            System.out.println("index =" + counter + ", str =" + temp);
            if (counter > size) {
                return true;
            }
        }
        return false;
    }

    private static String calculateNeededFromEnd(LinkedList<String> input, int neededIndex) {
        if (input.isEmpty() && input.size() < neededIndex && neededIndex > 0) {
            return null;
        }
        int temp = input.size() - neededIndex;
        List<String> buff = input.subList(temp, temp + 1);
        System.out.println(buff);
        return buff.get(0);
    }

    private static String calculateNeededFromEnd2(LinkedList<String> input, int neededIndex) {
        if (input.isEmpty() && input.size() < neededIndex && neededIndex > 0) {
            return null;
        }
        LinkedList<String> temp = new LinkedList<>(input);
        for (int i = 0; i < neededIndex - 1; i++) {
            temp.pollLast();
        }
        return temp.pollLast();
    }

    // Created by Nazar
    private static boolean isAnyDuplicates(int[] array) {
        Set temp = new HashSet(Arrays.asList(array));
        return array.length != temp.size();
    }

    private static boolean isAnyDuplicates2(Integer[] array) {
        List<Integer> list = Arrays.asList(array);

        int index = 0;
        while (index < array.length) {
            int value = array[index];
            if (list.indexOf(value) != list.lastIndexOf(value)) {
                return true;
            }
            index++;
        }
        return false;
    }

    private static boolean isAnyDuplicates3(Integer[] array) {
        List<Integer> list = Arrays.asList(array);

        int index = 0;
        while (index < array.length) {
            if (list.contains(array[index]) && list.contains(array[array.length - index]))
                return true;
            index++;
        }
        return false;
    }

    private static Integer[] getAllDuplicateIndexes(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        ArrayList<Integer> res = new ArrayList<>();

        int index = 0;
        while (index < array.length) {
            int value = array[index];
            if (list.indexOf(value) != list.lastIndexOf(value)) {
                int temp = list.indexOf(value);
                res.add(list.indexOf(value));
                list.remove(temp);

                temp = list.lastIndexOf(value);
                res.add(list.lastIndexOf(value));
                list.remove(temp);

                while (list.contains(value)) {
                    temp = list.lastIndexOf(value);
                    res.add(list.lastIndexOf(value));
                    list.remove(temp);
                }
            } else {
                list.remove(value);
            }
            index++;
        }
        return (Integer[]) res.toArray();
    }
}
