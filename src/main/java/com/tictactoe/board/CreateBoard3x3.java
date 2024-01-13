package com.tictactoe.board;

public class CreateBoard3x3 {
    private int boardSize = 3;
    private String[][] board = new String[boardSize][boardSize];

    public void declarationEmptyBoard() {
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = " ";
            }
        }
    }
    public int getBoardSize() {
        return boardSize;
    }

    public String[][] getBoard() {
        return board;
    }
}
