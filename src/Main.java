import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void playGameForTwo() {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int pl1Rnd1 = rnd.nextInt(9) + 1;
        int pl1Rnd2 = rnd.nextInt(9);
        int pl1Rnd3 = rnd.nextInt(9);
        int pl1Rnd4 = rnd.nextInt(9);
        while (pl1Rnd1 == pl1Rnd2 || pl1Rnd1 == pl1Rnd3 || pl1Rnd1 == pl1Rnd4 || pl1Rnd2 == pl1Rnd3 || pl1Rnd2 == pl1Rnd4 || pl1Rnd3 == pl1Rnd4) {
            if (pl1Rnd1 == pl1Rnd2 || pl1Rnd2 == pl1Rnd3 || pl1Rnd3 == pl1Rnd4) {
                pl1Rnd2 = rnd.nextInt(9);
            }
            if (pl1Rnd1 == pl1Rnd3 || pl1Rnd2 == pl1Rnd3 || pl1Rnd3 == pl1Rnd4) {
                pl1Rnd3 = rnd.nextInt(9);
            }
            if (pl1Rnd1 == pl1Rnd4 || pl1Rnd2 == pl1Rnd4 || pl1Rnd3 == pl1Rnd4) {
                pl1Rnd4 = rnd.nextInt(9);
            }
        }
        int[] pl1RndArr = {pl1Rnd1, pl1Rnd2, pl1Rnd3, pl1Rnd4};
        for (int i = 0; i < pl1RndArr.length; i++) {
            System.out.print(pl1RndArr[i]);
        }
        System.out.println();

        Random rnd2 = new Random();
        int pl2Rnd1 = rnd2.nextInt(9) + 1;
        int pl2Rnd2 = rnd2.nextInt(9);
        int pl2Rnd3 = rnd2.nextInt(9);
        int pl2Rnd4 = rnd2.nextInt(9);
        while (pl2Rnd1 == pl2Rnd2 || pl2Rnd1 == pl2Rnd3 || pl2Rnd1 == pl2Rnd4 || pl2Rnd2 == pl2Rnd3 || pl2Rnd2 == pl2Rnd4 || pl2Rnd3 == pl2Rnd4) {
            if (pl2Rnd1 == pl2Rnd2 || pl2Rnd2 == pl2Rnd3 || pl2Rnd3 == pl2Rnd4) {
                pl2Rnd2 = rnd2.nextInt(9);
            }
            if (pl2Rnd1 == pl2Rnd3 || pl2Rnd2 == pl2Rnd3 || pl2Rnd3 == pl2Rnd4) {
                pl2Rnd3 = rnd2.nextInt(9);
            }
            if (pl2Rnd1 == pl2Rnd4 || pl2Rnd2 == pl2Rnd4 || pl2Rnd3 == pl2Rnd4) {
                pl2Rnd4 = rnd2.nextInt(9);
            }
        }
        int[] pl2RndArr = {pl2Rnd1, pl2Rnd2, pl2Rnd3, pl2Rnd4};
        for (int i = 0; i < pl2RndArr.length; i++) {
            System.out.print(pl2RndArr[i]);
        }
        System.out.println();

        System.out.println("Enter name for Player 1:");
        String player1Name = scan.next();
        System.out.println("Enter name for Player 2:");
        String player2Name = scan.next();
        System.out.println("Whoever guesses their number first wins!");

        System.out.println(player1Name + "'s turn");
        int n = scan.nextInt();
        int n2 = 0;
        while (n > 9999 || n < 999 || n / 1000 == (n / 100) % 10 || n / 1000 == (n / 10) % 10 ||
                n / 1000 == n % 10 || (n / 100) % 10 == (n / 10) % 10 || (n / 100) % 10 == n % 10 || (n / 10) % 10 == n % 10) {
            System.out.println("Enter a four-digit number with different digits!");
            n = scan.nextInt();
        }
        if (n / 1000 == pl1Rnd1 && (n / 100) % 10 == pl1Rnd2 && (n / 10) % 10 == pl1Rnd3 && n % 10 == pl1Rnd4) {
            System.out.println(player1Name + " wins! " + pl1Rnd1 + "" + pl1Rnd2 + "" + pl1Rnd3 + "" + pl1Rnd4 + " is the correct number!");
            System.exit(0);
        }

        while (n / 1000 != pl1Rnd1 || (n / 100) % 10 != pl1Rnd2 || (n / 10) % 10 != pl1Rnd3 || n % 10 != pl1Rnd4
                && n2 / 1000 != pl2Rnd1 || (n2 / 100) % 10 != pl2Rnd2 || (n2 / 10) % 10 != pl2Rnd3 || n2 % 10 != pl2Rnd4) {


            if (n / 1000 != pl1Rnd1 || (n / 100) % 10 != pl1Rnd2 || (n / 10) % 10 != pl1Rnd3 || n % 10 != pl1Rnd4) {
                int[] pl1DigitsArr = {n / 1000, (n / 100) % 10, (n / 10) % 10, n % 10};
                int cows = 0;
                int bulls = 0;
                for (int i = 0; i < pl1DigitsArr.length; i++) {
                    if (pl1DigitsArr[i] == pl1Rnd1 || pl1DigitsArr[i] == pl1Rnd2 || pl1DigitsArr[i] == pl1Rnd3 || pl1DigitsArr[i] == pl1Rnd4) {
                        cows++;
                    }
                    if (pl1DigitsArr[i] == pl1RndArr[i]) {
                        bulls++;
                        cows--;
                    }
                }
                System.out.println("Cows: " + cows);
                System.out.println("Bulls: " + bulls);
                System.out.println(player2Name + "'s turn");
                n2 = scan.nextInt();
            }

            while (n2 > 9999 || n2 < 999 || n2 / 1000 == (n2 / 100) % 10 || n2 / 1000 == (n2 / 10) % 10 || n2 / 1000 == n2 % 10 ||
                    (n2 / 100) % 10 == (n2 / 10) % 10 || (n2 / 100) % 10 == n2 % 10 || (n2 / 10) % 10 == n2 % 10) {
                System.out.println("Enter a four-digit number with different digits!");
                n2 = scan.nextInt();
            }
            if (n2 / 1000 == pl2Rnd1 && (n2 / 100) % 10 == pl2Rnd2 && (n2 / 10) % 10 == pl2Rnd3 && n2 % 10 == pl2Rnd4) {
                System.out.println(player2Name + " wins! " + pl2Rnd1 + "" + pl2Rnd2 + "" + pl2Rnd3 + "" + pl2Rnd4 + " is the correct number!");
                break;
            }

            if (n2 / 1000 != pl2Rnd1 || (n2 / 100) % 10 != pl2Rnd2 || (n2 / 10) % 10 != pl2Rnd3 || n2 % 10 != pl2Rnd4) {
                int[] pl2DigitsArr = {n2 / 1000, (n2 / 100) % 10, (n2 / 10) % 10, n2 % 10};
                int cows2 = 0;
                int bulls2 = 0;
                for (int i = 0; i < pl2DigitsArr.length; i++) {
                    if (pl2DigitsArr[i] == pl2Rnd1 || pl2DigitsArr[i] == pl2Rnd2 || pl2DigitsArr[i] == pl2Rnd3 || pl2DigitsArr[i] == pl2Rnd4) {
                        cows2++;
                    }
                    if (pl2DigitsArr[i] == pl2RndArr[i]) {
                        bulls2++;
                        cows2--;
                    }
                }
                System.out.println("Cows: " + cows2);
                System.out.println("Bulls: " + bulls2);
                System.out.println(player1Name + "'s turn");
                n = scan.nextInt();
            }
            if (n / 1000 == pl1Rnd1 && (n / 100) % 10 == pl1Rnd2 && (n / 10) % 10 == pl1Rnd3 && n % 10 == pl1Rnd4) {
                System.out.println(player1Name + " wins! " + +pl1Rnd1 + "" + pl1Rnd2 + "" + pl1Rnd3 + "" + pl1Rnd4 + " is the correct number!");
                break;
            }
            while (n > 9999 || n < 999 || n / 1000 == (n / 100) % 10 || n / 1000 == (n / 10) % 10 || n / 1000 == n % 10
                    || (n / 100) % 10 == (n / 10) % 10 || (n / 100) % 10 == n % 10 || (n / 10) % 10 == n % 10) {
                System.out.println("Enter a four-digit number with different digits!");
                n = scan.nextInt();
            }
        }
    }

    public static void playGameForOne() {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int rd1 = rnd.nextInt(9) + 1;
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
        int[] rndDigitsArr = {rd1, rd2, rd3, rd4};

        System.out.println("Guess the number!");
        int n = 0;
        while (n > 9999 || n < 999 || n / 1000 == (n / 100) % 10 || n / 1000 == (n / 10) % 10 || n / 1000 == n % 10 || (n / 100) % 10 == (n / 10) % 10 || (n / 100) % 10 == n % 10 || (n / 10) % 10 == n % 10) {
            System.out.println("Enter a four-digit number with different digits!");
            n = scan.nextInt();
        }
        if (n / 1000 == rd1 && (n / 100) % 10 == rd2 && (n / 10) % 10 == rd3 && n % 10 == rd4) {
            System.out.println("You win! " + rd1 + "" + rd2 + "" + rd3 + "" + rd4 + " is the correct number!");
        }
        while (n / 1000 != rd1 || (n / 100) % 10 != rd2 || (n / 10) % 10 != rd3 || n % 10 != rd4) {
            int[] digitsArr = {n / 1000, (n / 100) % 10, (n / 10) % 10, n % 10};
            int cows = 0;
            int bulls = 0;
            for (int i = 0; i < digitsArr.length; i++) {
                if (digitsArr[i] == rd1 || digitsArr[i] == rd2 || digitsArr[i] == rd3 || digitsArr[i] == rd4) {
                    cows++;
                }
                if (digitsArr[i] == rndDigitsArr[i]) {
                    bulls++;
                    cows--;
                }
            }
            System.out.println("Cows: " + cows);
            System.out.println("Bulls: " + bulls);
            System.out.println("Try again!");
            n = scan.nextInt();
            if (n / 1000 == rd1 && (n / 100) % 10 == rd2 && (n / 10) % 10 == rd3 && n % 10 == rd4) {
                System.out.println("You win! " + rd1 + "" + rd2 + "" + rd3 + "" + rd4 + " is the correct number!");
            }
            while (n > 9999 || n < 999 || n / 1000 == (n / 100) % 10 || n / 1000 == (n / 10) % 10 || n / 1000 == n % 10 || (n / 100) % 10 == (n / 10) % 10 || (n / 100) % 10 == n % 10 || (n / 10) % 10 == n % 10) {
                System.out.println("Enter a four-digit number with different digits!");
                n = scan.nextInt();
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

        while (option > 2 || option < 1) {
            System.out.println("Enter a valid input.");
            option = scan.nextInt();
        }
        if (option == 1) {
            playGameForOne();
        }
        if (option == 2) {
            playGameForTwo();
        }
    }
}