package Wisielec;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gracz1, podaj słowo do odgadnięcia: ");
        String wordToGuess = scanner.nextLine().toLowerCase();

        char[] guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord[i] = '_';
        }

        int mistakes = 0;
        boolean wordGuessed = false;

        while (mistakes < 6 && !wordGuessed) {
            System.out.print("Zgadnij słowo: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Gracz2, podaj literę: ");
            char guessedLetter = scanner.nextLine().toLowerCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guessedLetter) {
                    guessedWord[i] = guessedLetter;
                    found = true;
                }
            }

            if (!found) {
                mistakes++;
                HangmanDisplay.displayHangman(mistakes);
            }

            wordGuessed = true;
            for (char c : guessedWord) {
                if (c == '_') {
                    wordGuessed = false;
                    break;
                }
            }
        }

        if (wordGuessed) {
            System.out.println("Gratulacje! Odgadłeś słowo: " + wordToGuess);
        } else {
            System.out.println("Niestety, przegrałeś. Słowo do odgadnięcia to: " + wordToGuess);
        }

        scanner.close();
    }
}
