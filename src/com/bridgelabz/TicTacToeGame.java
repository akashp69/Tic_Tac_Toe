package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
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
     *This is Main Method is Used for calling the static method gameBoard
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Tic-Tac-Toe Game");
        gameBoard();
        chooseLetter();
    }
}
