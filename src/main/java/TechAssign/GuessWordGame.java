package TechAssign;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessWordGame {

    private static final String[] WORDS = {
            "джава", "компьютер", "алгоритм", "переменная", "цикл",
            "массив", "функция", "класс", "объект", "метод",
            "наследование", "полиморфизм", "инкапсуляция", "ритм", "интерфейс",
            "программа", "мышь", "собака", "кошка", "генератор"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            String secretWord = WORDS[random.nextInt(WORDS.length)];
            playGame(scanner, secretWord);
            playAgain = askToPlayAgain(scanner);
        }

        scanner.close();
    }

    public static void playGame(Scanner scanner, String secretWord) {
        char[] guessedWord = new char[secretWord.length()];
        Arrays.fill(guessedWord, '_');

        int attempts = 5;
        boolean wordGuessed = false;

        System.out.println("=========================================");
        System.out.println("     Добро пожаловать в игру 'Угадай слово'");
        System.out.println("=========================================");
        System.out.println("У вас есть " + attempts + " попыток, чтобы угадать слово");
        System.out.println("Вы можете вводить целиком слово или одну букву");
        System.out.println("-----------------------------------------");

        while (attempts > 0 && !wordGuessed) {
            System.out.print("Слово: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("Осталось попыток: " + attempts);
            System.out.print("Введите слово или букву: ");

            String input = getUserInput(scanner);

            if (input.length() == 1) {
                attempts = processLetter(input.charAt(0), secretWord, guessedWord, attempts);
            } else {
                attempts = processWord(input, secretWord, attempts);
            }

            if (new String(guessedWord).equals(secretWord)) {
                wordGuessed = true;
            }
        }
        printGameResult(wordGuessed, secretWord);
    }

   public static String getUserInput(Scanner scanner) {
        String input = scanner.nextLine().trim().toLowerCase();

        while (input.isEmpty()) {
            System.out.print("Пожалуйста, введите букву или слово: ");
            input = scanner.nextLine().trim().toLowerCase();
        }

        return input;
    }

    private static int processLetter(char letter, String secretWord, char[] guessedWord, int attempts) {
        if (!Character.isLetter(letter)) {
            System.out.println("Пожалуйста, введите букву");
            return attempts;
        }

        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter && guessedWord[i] == '_') {
                guessedWord[i] = letter;
                found = true;
            }
        }

        if (found) {
            System.out.println("Правильно! Буква '" + letter + "' есть в слове");
        } else {
            attempts--;
            System.out.println("Неправильно! Буквы '" + letter + "' нет в слове");
        }

        return attempts;
    }

    private static int processWord(String input, String secretWord, int attempts) {
        if (input.equals(secretWord)) {
            for (int i = 0; i < secretWord.length(); i++) {}
            return attempts;
        } else {
            attempts--;
            System.out.println("Неправильно! Это не загаданное слово");
            return attempts;
        }
    }

    private static void printGameResult(boolean wordGuessed, String secretWord) {
        if (wordGuessed) {
            System.out.println("\nПОЗДРАВЛЯЕМ! Вы угадали слово: " + secretWord + "!");
            System.out.println("Вы победили!");
        } else {
            System.out.println("\nК сожалению, вы проиграли.");
            System.out.println("Загаданное слово было: " + secretWord);
        }
    }

    private static boolean askToPlayAgain(Scanner scanner) {
        System.out.println("\nХотите начать заново? (да/нет)");

        while (true) {
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("да")) {
                return true;
            } else if (answer.equals("нет")) {
                System.out.println("До свидания!");
                return false;
            } else {
                System.out.print("Пожалуйста, ответьте 'да' или 'нет': ");
            }
        }
    }
}