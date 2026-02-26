package org.example.javafxgame2048.logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {
    private static final int BOARD_SIZE = 4;
    private int[][] board;
    private Random random;

    public Board() {
        this.random = new Random();
        this.board = new int[4][4];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j]=0;
            }
        }
        generateRandomTile();
        generateRandomTile();
    }
    public void play(){
        System.out.println("Welcome to 2048!");
        System.out.println("Use 'W', 'A', 'S', 'D' to move the tiles. Enter 'Q' to quit.");
        System.out.println();
        Scanner in = new Scanner(System.in);
        String input = "";
        while(!input.equals("Q")){
            input = in.next().toUpperCase();
            switch (input) {
                case "W":
                    moveUp();
                    break;
                case "A":
                    moveLeft();
                    break;
                case "S":
                    moveDown();
                    break;
                case "D":
                    moveRight();
                    break;
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
            display();
            System.out.println();
            System.out.println();
            if(hasWon()){
                System.out.println("Congrats! You won!");
                break;
            }
        }
    }

    private boolean hasWon() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if(board[row][col]==2048){
                    return true;
                }
            }
        }
        return false;
    }

    public void display() {
        System.out.println("-----------------------------");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.printf("| %-4d ", board[i][j]);
            }
            System.out.println("|");
            System.out.println("-----------------------------");
        }
    }

    public void moveUp() {
        System.out.println("moveUp...");
        for (int col = 0; col < BOARD_SIZE; col++) {
            for (int row = 0; row < BOARD_SIZE - 1; row++) {
                if (board[row][col] == 0) {
                    for (int i = row + 1; i < BOARD_SIZE; i++) {
                        if (board[i][col] != 0) {
                            board[row][col] = board[i][col];
                            board[i][col] = 0;
                            break;
                        }
                    }
                } else {
                    for (int i = row + 1; i < BOARD_SIZE; i++) {
                        if (board[i][col] != 0) {
                            if (board[i][col] == board[row][col]) {
                                board[row][col] *= 2;
                                board[i][col] = 0;
                            }
                            break;
                        }
                    }
                }
            }
        }
        generateRandomTile();
    }
    public void moveLeft(){
        System.out.println("moveLeft...");
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if(board[row][col]==0){
                    for (int i = col+1; i < BOARD_SIZE; i++) {
                        if(board[row][i]!=0){
                            board[row][col]=board[row][i];
                            board[row][i]=0;
                            break;
                        }
                    }
                }
                else{
                    for (int i = col+1; i < BOARD_SIZE; i++) {
                        if(board[row][i]!=0){
                            if(board[row][i] == board[row][col]) {
                                board[row][col] *= 2;
                                board[row][i] = 0;
                            }
                            break;
                        }
                    }
                }
            }
        }
        generateRandomTile();
    }
    public void moveRight(){
        System.out.println("moveRight...");
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = BOARD_SIZE -1; col >= 0; col--) {
                if(board[row][col]==0){
                    for (int i = col-1; i >= 0 ; i--) {
                        if(board[row][i] != 0){
                            board[row][col] = board[row][i];
                            board[row][i] = 0;
                            break;
                        }
                    }
                }
                else {
                    for (int i = col-1; i >= 0 ; i--) {
                        if(board[row][i] != 0){
                            if(board[row][i]==board[row][col]){
                                board[row][col]*=2;
                                board[row][i]=0;
                            }
                            break;
                        }
                    }
                }
            }
        }
        generateRandomTile();
    }
    public void moveDown(){
        System.out.println("moveDown...");
        for (int col = 0; col < BOARD_SIZE; col++) {
            for (int row = BOARD_SIZE -1; row >= 0; row--) {
                if(board[row][col]==0){
                    for (int i = row-1; i >= 0; i--) {
                        if(board[i][col]!=0){
                            board[row][col] = board[i][col];
                            board[i][col]=0;
                            break;
                        }
                    }
                }
                else {
                    for (int i = row-1; i >= 0; i--) {
                        if(board[i][col]!=0){
                            if(board[i][col]==board[row][col]){
                                board[row][col] *=2;
                                board[i][col]=0;
                            }
                            break;
                        }
                    }
                }
            }
        }
        generateRandomTile();
    }
    private void generateRandomTile(){
        ArrayList<Integer[]> empty = emptyCells();
        if (empty.isEmpty()) {
            System.out.println("Game Over! You Lose!");
            System.exit(0);
        }
        Integer[] index = empty.get(random.nextInt(empty.size()));
        board[index[0]][index[1]] = (random.nextInt(2) + 1) * 2;
    }
    private ArrayList<Integer[]> emptyCells(){
        ArrayList<Integer[]> empty= new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if(board[i][j]==0){
                    empty.add(new Integer[]{i,j});
                }
            }
        }
        return empty;
    }

    public int[][] getBoard() {
        return board;
    }
}
