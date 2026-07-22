package Homework11.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        findTheLongestAndShortest();
        sortInAscendingOrder();
        findShorterThenAverage();
        findWordFromDifferentCharacters();
        getWordWithDuplicatedLetters();
    }

    public static String[] inputStrings() {
        String[] strings = new String[3];
        System.out.println("Введите первую строку:");
        strings[0] = input.nextLine();

        System.out.println("Введите вторую строку:");
        strings[1] = input.nextLine();

        System.out.println("Введите третью строку:");
        strings[2] = input.nextLine();

        return strings;
    }

    public static void findTheLongestAndShortest() {
        String[] strings = inputStrings();
        String longest = strings[0];
        String shortest = strings[0];

        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        System.out.println("\n=== Задание 1 ===");
        System.out.println("Самая длинная строка: \"" + longest + "\"");
        System.out.println("Ее длина: " + longest.length());
        System.out.println("Самая короткая строка: \"" + shortest + "\"");
        System.out.println("Ее длина: " + shortest.length());
    }

    public static void sortInAscendingOrder() {
        String[] strings = inputStrings();
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        System.out.println("\n=== Задание 2 ===");
        System.out.println("Строки в порядке возрастания: ");
        System.out.println(Arrays.toString(strings));
    }

    public static void findShorterThenAverage() {
        String[] strings = inputStrings();
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        int average = totalLength / strings.length;
        System.out.println("\n=== Задание 3 ===");
        System.out.println("Средняя длина: " + average);
        System.out.println("Строки короче средней:");

        boolean found = false;
        for (String str : strings) {
            if (str.length() < average) {
                System.out.println(str + " - длина: " + str.length());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет строк короче средней длины");
        }
    }

    public static void findWordFromDifferentCharacters() {
        String[] strings = inputStrings();
        String result = null;
        for (String str : strings) {
            if (hasAllUniqueChars(str)) {
                result = str;
                break;
            }
        }
        System.out.println("\n=== Задание 4 ===");
        if (result != null) {
            System.out.println("Первое слово с уникальными символами: \"" + result + "\"");
        } else {
            System.out.println("Строк с уникальными символами не найдено");
        }
    }

    public static boolean hasAllUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void getWordWithDuplicatedLetters() {
        System.out.print("Введите строку: ");
        String string = input.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            result.append(ch).append(ch);
        }
        System.out.println("\n=== Задание 5 ===");
        System.out.println("Результат: " + result);
    }
}
