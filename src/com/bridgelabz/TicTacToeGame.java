package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    /**
    *using Static Variables for players
    */
    static char board[] = new char[10];
    static char playerLetter;
    static char computerLetter;

    /**
     * This is Static Method is used for create tic-tac-toe game board using array 1-9
     */
    public static void gameBoard() {

        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
    /**
     * This is Static Method is used for chose a letter for player
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
     * This is Static Method is used for Showing the empty tic-tac-toe game board
     */

    public static void toDisplayBoard() {

        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
    /**
     * This is Static Method is used for Make a move on the tic-tac-toe game board
     */

    public static void toMakeAMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your number between 1 to 9 ");
        int position = scanner.nextInt();
        if (position <= 9 && position >= 1) {
            board[position] = playerLetter;
            toDisplayBoard();
            toMakeAMove();
        } else if (board[position] != ' ') {
            System.err.println("You already choose");
            toMakeAMove();
        } else {
            System.err.println("Enter location between 1 to 9");
            toDisplayBoard();
            toMakeAMove();
        }
    }
    /**
     * This is Static Method is used for to decide who plays first
     */
    public static void Toss() {

        int Toss = (int) Math.floor(Math.random() * 10) % 2+1;
        switch (Toss) {
            case 1:
                System.out.println("You Won the Toss Play First");
                gameBoard();
                chooseLetter();
                toDisplayBoard();
                toMakeAMove();
                break;
            default:
                System.out.println("Opponent Won The Toss");
                gameBoard();
                chooseLetter();
                toDisplayBoard();
                toMakeAMove();
        }
    }
    /**
     *This is Main Method is Used for calling the static methods
     */
    public static void main(String[] args) {
        System.out.println("-----Welcome To Tic-Tac-Toe Game-----");

        System.out.println("Toss a Coin for choose who play first-------");
        Toss();


    }
}
