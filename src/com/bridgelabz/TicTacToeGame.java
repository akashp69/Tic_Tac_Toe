package com.bridgelabz;

public class TicTacToeGame {
    /*
    *This is static Method Used for create empty  tic-tac-toe board
    */
    public static void gameBoard() {

        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            System.out.print(board[i] + " ");
        }
    }

    /**
     *This is Main Method is Used for calling the static method gameBoard
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Tic-Tac-Toe Game");
        gameBoard();
    }
}
