import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void chooseAmountOfPlayers(int option) {
        Scanner scan = new Scanner(System.in);
        if (option == 1) {
            playGameForPlayer1();
        }
        if (option == 2) {
            playGameForPlayer1();
            playGameForPlayer2();
        }
        while (option > 2 || option < 1) {
            System.out.println("Enter a valid input.");
            option = scan.nextInt();
        }

    }

    public static void playGameForPlayer2() {

    }

    public static void playGameForPlayer1() {
        Random rnd = new Random();
        int rd1 = rnd.nextInt(9);
        int rd2 = rnd.nextInt(9);
        int rd3 = rnd.nextInt(9);
        int rd4 = rnd.nextInt(9);
        while (rd1 == rd2 || rd1 == rd3 || rd1 == rd4 || rd2 == rd3 || rd2 == rd4 || rd3 == rd4) {
            if (rd1 == rd2 || rd2 == rd3 || rd3 == rd4) {
                rd2 = rnd.nextInt(9);
            }
            if (rd1 == rd3 || rd2 == rd3 || rd3 == rd4) {
                rd3 = rnd.nextInt(9);
            }
            if (rd1 == rd4 || rd2 == rd4 || rd3 == rd4) {
                rd4 = rnd.nextInt(9);
            }
        }
        System.out.println("Guess the number!");
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n > 9999 || n < 999) {
            System.out.println("Enter a four-digit number!");
            n = scan.nextInt();
        }

        while (n / 1000 == (n / 100) % 10 || n / 1000 == (n / 10) % 10 || n / 1000 == n % 10 || (n / 100) % 10 == (n / 10) % 10 || (n / 100) % 10 == n % 10 || (n / 10) % 10 == n % 10) {
            System.out.println("Enter a number with different digits!");
            n = scan.nextInt();

        }
        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;
        int[] digitsArr = new int[]{d1, d2, d3, d4};
        int[] randomDigitsArr = {rd1, rd2, rd3, rd4};
        int cows = 0;
        int bulls = 0;
        for (int i = 0; i < digitsArr.length; i++) {
            if (digitsArr[i] == randomDigitsArr[i]) {
                bulls++;
            }
        }
        for (int i = 0; i < digitsArr.length; i++) {
            if (digitsArr[i] == rd1 || digitsArr[i] == rd2 || digitsArr[i] == rd3 || digitsArr[i] == rd4) {
                cows++;
            }
        }
        System.out.println("Cows: " + cows);
        System.out.println("Bulls: " + bulls);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the game Cows and Bulls!");
        System.out.println("-----------------------------------");
        System.out.println("Instructions: You will have to guess a four-digit number, each digit being different.\nIf your entered number contains a digit that is in the number you have to guess, you have a cow.\nIf that digit is also in the same position in the number you have to guess, you have a bull.");
        System.out.println("-----------------------------------");
        System.out.println("How many people are playing?");
        System.out.println("Single player - press [1]");
        System.out.println("Two players - press [2]");
        int option = scan.nextInt();
        chooseAmountOfPlayers(option);
        playGameForPlayer1();
    }
}