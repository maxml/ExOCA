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
 * <p>
 * Question 9: How do you find duplicates in an array if there is more than one duplicate? +
 * Question 10: What is difference between Singly Linked List and Doubly Linked List data structure? +
 * Question 11: Write Java program to print Fibonacci series? +
 * Question 12: Write Java program to check if a number is a palindrome or not? +
 * Question 13: What is binary search tree? +
 * Question 14: Write a Java program to implement Stack in Java. +
 * Question 15: How to reverse linked list using recursion and iteration?
 * <p>
 * treeset, graph, hashset, hashmap
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

        int[] array = new int[10000];
//        Arrays.fill(array, new Random().nextInt(100));
        for (int i = 0; i < 10000; i++) {
            array[i] = new Random().nextInt(100);
        }

//        Arrays.toString(array);
//        System.out.println(isAnyDuplicates(array));
//        System.out.println(isAnyDuplicates2(Arrays.stream(array).boxed().toArray(Integer[]::new)));

//        System.out.println(Arrays.toString(getAllDuplicate(Arrays.stream(array).boxed().toArray(Integer[]::new))));

//        Integer[] inputInt = Arrays.stream(array).boxed().toArray(Integer[]::new);
//        long time = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getAllDuplicate3(inputInt)));
//        System.out.println(System.currentTimeMillis() - time);
//
//        time = System.currentTimeMillis();
//        System.out.println(getAllNumbersCount(inputInt));
//        System.out.println(System.currentTimeMillis() - time);

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

//        printFibonacci(35);
//        printFibonacciRecursion(135);


        long time = System.currentTimeMillis();
        System.out.println(isPalindrome(22));
        System.out.println(isPalindrome(232));
        System.out.println(isPalindrome(12325));
        System.out.println(isPalindrome(12312));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(121111121));

        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        System.out.println(isPalindrome2(22));
        System.out.println(isPalindrome2(232));
        System.out.println(isPalindrome2(12325));
        System.out.println(isPalindrome2(12312));
        System.out.println(isPalindrome2(12321));
        System.out.println(isPalindrome2(1221));
        System.out.println(isPalindrome2(121111121));
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println(isPalindrome3(22));
        System.out.println(isPalindrome3(232));
        System.out.println(isPalindrome3(12325));
        System.out.println(isPalindrome3(12312));
        System.out.println(isPalindrome3(12321));
        System.out.println(isPalindrome3(1221));
        System.out.println(isPalindrome3(121111121));
        System.out.println(System.currentTimeMillis() - time);
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

    private static Integer[] getAllDuplicate(Integer[] array) {
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Set<Integer> res = new HashSet<>();

        int index = 0;
        int size = array.length;
        while (index != size) {
            int value = list.get(index);
            if (list.indexOf(value) != list.lastIndexOf(value)) {
                int temp = list.indexOf(value);
                list.remove(temp);

                temp = list.lastIndexOf(value);
                list.remove(temp);

                size -= 2;

                while (list.contains(value)) {
                    temp = list.lastIndexOf(value);
                    list.remove(temp);
                    size--;
                }
                res.add(value);
            } else {
                list.remove(new Integer(value));
                size--;
            }
        }
        return res.toArray(new Integer[res.size()]);
    }

    private static Integer[] getAllDuplicate2(Integer[] array) {
        Set<Integer> buff = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            boolean temp = buff.add(array[i]);
            if (!temp) {
                res.add(array[i]);
            }
        }
        return res.toArray(new Integer[res.size()]);
    }

    private static Integer[] getAllDuplicate3(Integer[] array) {
        Set<Integer> buff = new HashSet<>(), res = new HashSet<>();
        for (Integer val : array) {
            if (!buff.add(val)) {
                res.add(val);
            }
        }
        return res.toArray(new Integer[res.size()]);
    }

    private static HashMap<Integer, Integer> getAllNumbersCount(Integer[] array) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for (Integer val : array) {
            res.put(val, res.getOrDefault(val, 0) + 1);
        }
        return res;
    }

    /*
     * 1 1 2 3 5 8 13 21 34
     */
    private static void printFibonacci(int index) {
        int prev = 1, current = 1;
        System.out.println(prev);
        System.out.println(current);
        for (int i = 2; i < index; i++) {
            int temp = prev + current;
            System.out.println(temp);

            prev = current;
            current = temp;
        }
    }

    private static void printFibonacciRecursion(int index) {
        int prev = 1, current = 1;
        System.out.println(prev);
        System.out.println(current);

        for (int i = 2; i < index; i++) {
            System.out.println(getFib(i));
        }
    }

    private static int getFib(int index) {
        if (index == 1 || index == 0) {
            return 1;
        }
        return getFib(index - 1) + getFib(index - 2);
    }

    private static ArrayList<Integer> values = new ArrayList<>();

    private static int getFibbonachiOptimise(int index) {
        if (index == 1 || index == 0) {
            return 1;
        }
        return getFib(index - 1) + getFib(index - 2);
    }

    private static boolean isPalindrome(int number) {
        String temp = Integer.toString(number);
        int division = temp.length() % 2;
        String firstPart = new StringBuilder(temp.substring(temp.length() / 2 + division,
                temp.length())).reverse().toString();
        String secondPart = temp.substring(0, temp.length() / 2);
        return firstPart.contains(secondPart);
    }

    private static boolean isPalindrome3(int number) {
        char[] temp = Integer.toString(number).toCharArray();
        for (int i = 0; i < temp.length / 2; i++) {
            if (temp[i] != temp[temp.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome2(int number) {
        int length = Integer.toString(number).length();
        int[] numbers = new int[length];
        int temp = number;
        for (int i = 0; i < length; i++) {
            numbers[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < length / 2; i++) {
            if (numbers[i] != numbers[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
