package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    static char board[] = new char[10];
    static char playerLetter;
    static char computerLetter;
    /*
    *This is static Method Used for create empty  tic-tac-toe board
    */
    public static void gameBoard() {

        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            System.out.print(board[i] + " ");
        }
    }
    /*
     * This Is static method is used for chose the letter
     */
    public static void chooseLetter() {

        System.out.println("\nChoose your Letter Either X or O");
        Scanner scanner = new Scanner(System.in);
        playerLetter = scanner.next().toUpperCase().charAt(0);
        if (playerLetter == 'X'){
            System.out.println(playerLetter);
        }
        else {
            System.out.println( computerLetter==0);
        }
    }

    /**
     * This is method is using for display the board of tic-tac-toe game
     */
    public static void toDisplayBoard() {

        System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
        System.out.println("------");
        System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
        System.out.println("------");
        System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
    }

    /**
     *This is Main Method is Used for calling the static method gameBoard
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Tic-Tac-Toe Game");
        gameBoard();
        chooseLetter();
        toDisplayBoard();
    }
}
