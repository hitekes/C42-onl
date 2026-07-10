package TechAssign2;

import java.util.Scanner;

import static TechAssign2.CrossesAndZeros.playGame;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("=== ИГРА КРЕСТИКИ-НОЛИКИ ===");
        System.out.println("Пользователь играет за 'X', ИИ играет за 'O'");

        while (playAgain) {
            playGame();

            System.out.print("\nХотите сыграть еще? (да/нет): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            playAgain = answer.equals("да");
        }

        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }
}

