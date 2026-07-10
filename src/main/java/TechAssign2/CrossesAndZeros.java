package TechAssign2;

import java.util.Random;
import java.util.Scanner;

public class CrossesAndZeros {
    private static final char EMPTY = '.';
    private static final char USER_SYMBOL = 'X';
    private static final char AI_SYMBOL = 'O';
    private static final int SIZE = 3;
    private static final char[][] board = new char[SIZE][SIZE];

    public static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellFree(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            return false;
        }
        return board[row][col] == EMPTY;
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        return board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void userMove() {
        Scanner scanner = new Scanner(System.in);
        boolean validMove = false;

        while (!validMove) {
            System.out.print("Введите строку (0-2): ");
            int row = scanner.nextInt();

            System.out.print("Введите столбец (0-2): ");
            int col = scanner.nextInt();

            if (!isCellFree(row, col)) {
                System.out.println("Ошибка: клетка занята или не существует! Попробуйте снова.");
                continue;
            }

            board[row][col] = USER_SYMBOL;
            validMove = true;
        }
    }

    public static void aiMove() {
        Random random = new Random();
        int row, col;

        System.out.println("Ход искусственного интеллекта");
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (!isCellFree(row, col));

        board[row][col] = AI_SYMBOL;
    }

    public static boolean playGame() {
        initBoard();

        Random random = new Random();
        boolean isUserTurn = random.nextBoolean();

        System.out.println("\n=== НАЧАЛО ИГРЫ ===");
        System.out.println("Первым ходит: " + (isUserTurn ? "Пользователь (X)" : "Искусственный интеллект (O)"));
        printBoard();

        while (true) {
            if (isUserTurn) {
                userMove();
                printBoard();

                if (checkWin(USER_SYMBOL)) {
                    System.out.println("ПОБЕДИЛ ПОЛЬЗОВАТЕЛЬ!");
                    return true;
                }
            } else {
                aiMove();
                printBoard();

                if (checkWin(AI_SYMBOL)) {
                    System.out.println("ПОБЕДИЛ ИСКУССТВЕННЫЙ ИНТЕЛЛЕКТ!");
                    return false;
                }
            }

            if (isBoardFull()) {
                System.out.println("НИЧЬЯ!");
                return false;
            }

            isUserTurn = !isUserTurn;
        }
    }
}