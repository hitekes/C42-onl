package Homework5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Random random = new Random();
        int rows = random.nextInt(10) + 2;
        int cols = random.nextInt(10) + 2;
        int[][] array = new int[rows][cols];
        System.out.println("Размер массива: " + rows + "x" + cols);

        fillArray(array,rows,cols);
        addNumber(array,rows,cols);
        sumOfNumbers(array);

        System.out.println("---------------------------------------------");
        System.out.println("Задание 2:");
        creatingChessboard();
    }

    public static void fillArray(int[][] array, int rows, int cols) {
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + "\t"); //
            }
            System.out.println();
        }

    }

    public static void addNumber(int[][] array, int rows, int cols){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число для добавления: ");
        int addNumber = input.nextInt();
        System.out.println("Полученный массив: ");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                array[i][j] += addNumber;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void sumOfNumbers(int[][] array){
        int sum = 0;
        for (int[] i : array) {

            for (int a : i) {
                sum += a;
            }

        }
        System.out.println("---------------------------------------------");
        System.out.println("Сумма чисел равна: " + sum);
    }
    public static void creatingChessboard(){
        String[][] chessboard = new String[8][8];
        for (String[] row : chessboard) {
            Arrays.fill(row, "B");
        }
        for (int i = 0; i < chessboard.length; i+=2) {
            for (int j = 0; j < chessboard.length; j+=2) {
                chessboard[i][j] = "W";

            }
        }
        for (int i = 1; i < chessboard.length; i+=2) {
            for (int j = 1; j < chessboard.length; j+=2) {
                chessboard[i][j] = "W";

            }
        }

        for (String[] row : chessboard) {
            for (String col : row) {
                System.out.print(col + "\t"); //
            }
            System.out.println();
        }
    }
}