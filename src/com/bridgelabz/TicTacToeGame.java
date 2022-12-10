package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    /**
    *Using the static variables for chose the player
    */
    static char board[] = new char[10];
    static char playerLetter;
    static char computerLetter;
    /**
     *This is static method is used for create the empty tic-tac-toe game board using array
     */

    public static void gameBoard() {

        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
    /**
     *This is static method is used for chose the letter for player
     */
    public static void chooseLetter() {
        System.out.println("\nChoose your Letter X or O");
        Scanner scanner = new Scanner(System.in);
        playerLetter = scanner.next().toUpperCase().charAt(0);
        if (playerLetter == 'X') {
            System.out.println(playerLetter);
        } else {
            System.out.println(computerLetter == 'O');
        }
    }
    /**
     *This is static method is used for Showing empty tic-tac-toe game board
     */
    public static void toDisplayBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
    /**
     *This is static method is used for take a move on empty space
     */
    public static void toMakeAMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your number between 1 to 9 ");
        int position = scanner.nextInt();
        if (position <= 9 && position >= 1) {
            board[position] = playerLetter;
            toDisplayBoard();
            checkFreeSpace();
            decideWinner();
            toMakeAMove();

        } else if (board[position] != ' ') {
            System.err.println("You already choose");
            toMakeAMove();
        } else {
            System.err.println("Enter location between 1 to 9");
            toMakeAMove();
        }
    }
    /**
     *This is static method is used for to decide who plays first
     */
    public static void Toss() {
        int Toss = (int) Math.floor(Math.random() * 10) % 2 + 1;
        switch (Toss) {
            case 1:
                System.out.println("You Won the Toss Play First");
                break;
            default:
                System.out.println("Opponent Won The Toss");
        }
    }
    /**
     *This is static method is used for check a free space is available for  a move
     */
    public static void checkFreeSpace() {
        boolean spaceAvailable = false;
        int freeSpace = 0;
        for (int i = 1; i < board.length; i++) {
            if ((board[i] == ' ')) {
                spaceAvailable = true;
                freeSpace++;
            }
        }
        if (spaceAvailable == false) {
            System.err.println("Board is full");
            System.exit(0);
        } else {
            System.out.println("You have " + freeSpace + " moves left");
        }
    }
    /**
     *This is static method is used for check letters filled vertical and horizontal for win
     */
    public static void decideWinner() {

        if ((board[1] == playerLetter && board[2] == playerLetter && board[3] == playerLetter) ||
                (board[4] == playerLetter && board[5] == playerLetter && board[6] == playerLetter) ||
                (board[7] == playerLetter && board[8] == playerLetter && board[9] == playerLetter) ||
                (board[1] == playerLetter && board[5] == playerLetter && board[9] == playerLetter) ||
                (board[3] == playerLetter && board[5] == playerLetter && board[7] == playerLetter) ||
                (board[1] == playerLetter && board[4] == playerLetter && board[7] == playerLetter) ||
                (board[2] == playerLetter && board[5] == playerLetter && board[7] == playerLetter) ||
                (board[3] == playerLetter && board[6] == playerLetter && board[9] == playerLetter)) {
            toDisplayBoard();
            System.out.println("YOU WON THE GAME");
            System.exit(0);
        }

    }
    /**
     *This is Main method is used for Calling the static methods
     */
    public static void main(String[] args) {
        System.out.println("-----Welcome To Tic-Tac-Toe Game-----");
        System.out.println("Toss a Coin for chose who play first-------");
        Toss();
        gameBoard();
        chooseLetter();
        toDisplayBoard();
        toMakeAMove();
    }
}

