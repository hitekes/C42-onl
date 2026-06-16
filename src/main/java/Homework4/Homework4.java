package Homework4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Homework4 {
    private static int[] numbers;

    public static void main(String[] args){
        createArrayNames();
        completeTask1();
        completeTask2();
        completeTask3();
        completeTask4();
        completeTask5();
        completeTask6();
        completeTaskBonus();
    }
    public static void createArrayNames(){
        int numbersCounter;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Сколько чисел ввести? ");

            if ((numbersCounter = input.nextInt()) > 0) break;
            System.out.println("Вы ввели неверное значение");
        } while (true);

        numbers = new int[numbersCounter];
        System.out.println("Выберите способ заполнения массива:\n" + "1 - Вручную\n" + "2 - Случайные значения" );
        int fillArray = input.nextInt();

        switch (fillArray){
            case 1:
                enterManually();
                break;
            case 2:
                enterRandom();
                break;
            default:
                break;

        }
    }
    public static void enterManually() {
        Scanner input = new Scanner(System.in);

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Введите следующее число " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

    }
    public static void enterRandom(){
        Random input = new Random();
        for (int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextInt(100);
        }

    }
    public static void completeTask1(){
        System.out.println("--------------------------------");
        System.out.println("Задание 1");
        System.out.println("Вывод элементов от начала:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Вывод элементов с конца:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
    public static void completeTask2(){
        System.out.println("\n--------------------------------");
        System.out.println("Задание 2");
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);

    }
    public static void completeTask3(){
        System.out.println("--------------------------------");
        System.out.println("Задание 3");
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального значения: " + minIndex);
        System.out.println("Индекс максимального значения: " + maxIndex);
    }

    public static void completeTask4(){
        System.out.println("--------------------------------");
        System.out.println("Задание 4");

        int zeroNumbers = 0;
        for (int number : numbers) {
            if (number == 0) {
                zeroNumbers++;
            }
        }
        if (zeroNumbers == 0) {
            System.out.println("Нулевых элементов нет");
        } else System.out.println("Количество нулевых элементов: " + zeroNumbers);
    }

    public static void completeTask5(){
        System.out.println("--------------------------------");
        System.out.println("Задание 5");

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Результат: " + Arrays.toString(numbers));
    }

    public static void completeTask6() {
        System.out.println("--------------------------------");
        System.out.println("Задание 6");

        boolean isIncreasing = true;
        if (numbers == null || numbers.length < 2) {
            isIncreasing = true;
        } else {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] <= numbers[i - 1]) {
                    isIncreasing = false;
                    break;
                }
            }
        }
        if (isIncreasing) {
            System.out.println("Массив возрастающей последовательности");
            System.out.println("   " + Arrays.toString(numbers));
        } else {
            System.out.println("Массив НЕ возрастающей последовательности");
            System.out.println("   " + Arrays.toString(numbers));

        }
    }

    public static void completeTaskBonus(){
        System.out.println("--------------------------------");
        System.out.println("Задание *");

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        int[] result = plusOne(numbers);
        System.out.println("Результат +1:    " + Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}
