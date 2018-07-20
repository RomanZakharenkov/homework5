package com.itacademy.zakharenkov.task2;

import java.util.Scanner;

/*
 * Created by Roman Zakharenkov on 19.07.2018.
 *
 * It-academy.
 * Lesson 5. Homework 5.
 * Task 2.
 *
 * Написать программу, преобразующую строку, содержащую число в
    римском формате, в число в арабском формате.
    Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
    идёт перед большим.
 */
public class Task2 {

    public static void main(String[] args) {
        String inputRomanNumber = inputRomanNumber();
        int arabicNumber = translateRomanToArabic(inputRomanNumber.toUpperCase());
        System.out.println("Число в арабском формате: " + arabicNumber);
    }

    public static int translateRomanToArabic(String romanNumber) {
        int[] value = getNumberCoding(romanNumber);
        int resultNumber = value[value.length - 1];
        for (int i = value.length - 2; i >= 0; i--) {
            if (value[i] < value[i + 1]) {
                resultNumber -= value[i];
            } else {
                resultNumber += value[i];
            }
        }
        return resultNumber;
    }

    public static int[] getNumberCoding(String romanNumber) {
        int[] value = new int[romanNumber.length()];
        for (int i = 0; i < value.length; i++) {
            switch (romanNumber.charAt(i)) {
                case 'M':
                    value[i] = 1000;
                    break;
                case 'D':
                    value[i] = 500;
                    break;
                case 'C':
                    value[i] = 100;
                    break;
                case 'L':
                    value[i] = 50;
                    break;
                case 'X':
                    value[i] = 10;
                    break;
                case 'V':
                    value[i] = 5;
                    break;
                case 'I':
                    value[i] = 1;
                    break;
                default:
                    value[i] = 0;
            }
        }
        return value;
    }

    public static String inputRomanNumber() {
        System.out.println("Введите число в римском формате:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
