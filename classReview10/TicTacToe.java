package com.syntax.classReview10;
import java.util.Scanner;
public class TicTacToe {
    // An 2D array to hold the values for our values
    static char[][] ticTacToeBoard;
    //an char to hold x or o to represent the signs
    static char currentPlayerSign;


    public static void main(String[] args) {
        //init the board with a 3*3 array
        ticTacToeBoard = new char[3][3];
        //initiating the sign with x first player will have this sign
        currentPlayerSign = 'x';
        //fill the board with numbers from 1 -9
        initializeBoard();
        //displaying the board to user
        displayBoardToUser();
        System.out.println("Welcome to TicTacToe by Anushka");
        Scanner scanner = new Scanner(System.in);
        int column;
        int row;
        //keep on looping unless and until we have a winner or a Tie
        while (true) {
            System.out.println("Player 1 'x' Please select the location column number 1-3 and row number 1-3 to place your mark");
            //taking the input for row and column for player one
            row = scanner.nextInt();
            column = scanner.nextInt();
            //checking if input is valid should not be a number greater then 3
            if (row > 3 || column > 3) {
                System.out.println("Invalid input please select column number 1-3 and row number 1-3 ");
                //if wrong input we continue asking for the i input
                continue;
            }
            //checking if the location is already occupied
            if(ticTacToeBoard[row-1][column-1]=='x'||ticTacToeBoard[row-1][column-1]=='o'){
                System.out.println("Invalid input this location is already marked");
                continue;
                //if location is already occupied we keep on asking for the correct in put

            }



            //placing the marker on the board in the 2D array after this call
            //a location in our 2D array will be reserved

            placeMark(row - 1, column - 1);
            //method to display the contents of the 2D array after this method
            //updated board will be displayed on the console
            displayBoardToUser();
            //method to change the location
            changePlayer();
            if (checkForWin()) {
                System.out.println("We have a winner Player 1");
                break;
            }
            if (isBoardFull()) {
                System.out.println("No Winner we have a Tie");
                break;
            }
            System.out.println("Player 2 'o' Please select the location column number and row number to place your mark");

            while (true){
                row = scanner.nextInt();
                column = scanner.nextInt();
                if (row > 3 || column > 3) {
                    System.out.println("Invalid input please select column number 1-3 and row number 1-3 ");
                    continue;
                }
                if(ticTacToeBoard[row-1][column-1]=='x'||ticTacToeBoard[row-1][column-1]=='o'){
                    System.out.println("Invalid input this location is already marked");
                    continue;
                }
                break;
            }


            placeMark(row - 1, column - 1);
            displayBoardToUser();
            changePlayer();
            if (checkForWin()) {
                System.out.println("We have a winner Player 2");
                break;
            }
            if (isBoardFull()) {
                System.out.println("No Winner we have a Tie");
                break;
            }


        }

    }


    // Set/Reset the board back to all empty values.
    public static void initializeBoard() {

        // Loop through rows
        char counter = '1';
        for (int i = 0; i < 3; i++) {

            // Loop through columns
            for (int j = 0; j < 3; j++) {
                ticTacToeBoard[i][j] = counter;
                counter++;
            }
        }
    }


    // Print the current board (may be replaced by GUI implementation later)
    public static void displayBoardToUser() {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(ticTacToeBoard[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    // Loop through all cells of the board and if one is found to be empty (contains number 1 -9) then return false.
    // Otherwise the board is full.
    public static boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(ticTacToeBoard[i][j] == 'x' || ticTacToeBoard[i][j] == 'o')) {
                    isFull = false;
                }
            }
        }

        return isFull;
    }


    // Returns true if there is a win, false otherwise.
    // This calls our other win check functions to check the entire board.
    public static boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }


    // Loop through rows and see if any are winners.
    private static boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(ticTacToeBoard[i][0], ticTacToeBoard[i][1], ticTacToeBoard[i][2])) {
                return true;
            }
        }
        return false;
    }


    // Loop through columns and see if any are winners.
    private static boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(ticTacToeBoard[0][i], ticTacToeBoard[1][i], ticTacToeBoard[2][i])) {
                return true;
            }
        }
        return false;
    }


    // Check the two diagonals to see if either is a win. Return true if either wins.
    private static boolean checkDiagonalsForWin() {
        return ((checkRowCol(ticTacToeBoard[0][0], ticTacToeBoard[1][1], ticTacToeBoard[2][2])) || (checkRowCol(ticTacToeBoard[0][2], ticTacToeBoard[1][1], ticTacToeBoard[2][0])));
    }


    // Check to see if all three values are the same (and not empty) indicating a win.
    private static boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 == 'x' || c1 == 'o') && (c1 == c2) && (c2 == c3));
    }


    // Change player marks back and forth.
    public static void changePlayer() {
        if (currentPlayerSign == 'x') {
            currentPlayerSign = 'o';
        } else {
            currentPlayerSign = 'x';
        }
    }


    // Places a mark at the cell specified by row and col with the mark of the current player.
    public static boolean placeMark(int row, int col) {

        // Make sure that row and column are in bounds of the board.
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (!(ticTacToeBoard[row][col] == 'x' || ticTacToeBoard[row][col] == 'o')) {
                    ticTacToeBoard[row][col] = currentPlayerSign;
                    return true;
                }
            }
        }

        return false;
    }
}
