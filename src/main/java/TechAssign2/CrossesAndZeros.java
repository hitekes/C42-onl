package TechAssign2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossesAndZeros {
    private static char[][] board = new char[3][3];
    private static final char EMPTY = '.';
    private static final char p1 = 'X';
    private static final char p2 = 'O';
    private static final int SIZE = 3;


    public static void main(String[] args) {
        initBoard();
        random();
        fillBoard();
        game();

    }

    public static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println();
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
                System.out.print(" " + board[i][j]);
            }

        }
    }

    public static int random() {
        int random = (int) (Math.random() * 3);
        System.out.println(random);
        return random;
    }

    public static void fillBoard() {
        int i = random();
        int j = random();
        if (board[i][j] != p2 && board[i][j] != p1) {
            board[i][j] = p1;
        } else fillBoard();


    }

    public static void inputUser() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        board[a][b] = p2;
    }

    public static void game() {
        boolean flag = true;
        int count = 9;
        while (count != 0) {
            fillBoard();
            count--;
            inputUser();
            count--;
            System.out.println(Arrays.deepToString(board));

        }

    }

}
