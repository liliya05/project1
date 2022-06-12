import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void playGame(int n) {
    }

    public static void chooseAmountOfPlayers(int option) {
        Scanner scan = new Scanner(System.in);
        if (option == 1) {
            generateNForPlayer1();
        }
        if (option == 2) {
            generateNForPlayer1();
            generateNForPlayer2();
        }
        while (option > 2 || option < 1) {
            System.out.println("Enter a valid input.");
            option = scan.nextInt();
        }

    }

    public static void generateNForPlayer2() {
        Random rnd = new Random();
        int dg1 = rnd.nextInt(9);
        int dg2 = rnd.nextInt(9);
        int dg3 = rnd.nextInt(9);
        int dg4 = rnd.nextInt(9);
        while (dg1 == dg2 || dg1 == dg3 || dg1 == dg4 || dg2 == dg3 || dg2 == dg4 || dg3 == dg4) {
            if (dg1 == dg2 || dg2 == dg3 || dg3 == dg4) {
                dg2 = rnd.nextInt();
            }
            if (dg1 == dg3 || dg2 == dg3 || dg3 == dg4) {
                dg3 = rnd.nextInt();
            }
            if (dg1 == dg4 || dg2 == dg4 || dg3 == dg4) {
                dg4 = rnd.nextInt();
            }
        }
    }

    public static void generateNForPlayer1() {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int dg1 = rnd.nextInt(9);
        int dg2 = rnd.nextInt(9);
        int dg3 = rnd.nextInt(9);
        int dg4 = rnd.nextInt(9);
        while (dg1 == dg2 || dg1 == dg3 || dg1 == dg4 || dg2 == dg3 || dg2 == dg4 || dg3 == dg4) {
            if (dg1 == dg2 || dg2 == dg3 || dg3 == dg4) {
                dg2 = rnd.nextInt();
            }
            if (dg1 == dg3 || dg2 == dg3 || dg3 == dg4) {
                dg3 = rnd.nextInt();
            }
            if (dg1 == dg4 || dg2 == dg4 || dg3 == dg4) {
                dg4 = rnd.nextInt();
            }
        }
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
    }
}