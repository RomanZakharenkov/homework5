package com.itacademy.zakharenkov.task1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/*
 * Created by Roman Zakharenkov on 19.07.2018.
 *
 * It-academy.
 * Lesson 5. Homework 5.
 * Task 1.
 *
 * Проверить, является ли введённая строка палиндромом, т.е. читается
    одинаково в обоих направлениях
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String line = scanner.nextLine();

        if (isPalindrome(line)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    public static boolean isPalindrome(String line) {
        StringBuilder reverse = new StringBuilder(line.trim()).reverse();
        return line.trim().equalsIgnoreCase(reverse.toString());
    }
}
