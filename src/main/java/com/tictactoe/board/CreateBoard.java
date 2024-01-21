package com.tictactoe.board;

public class CreateBoard {
    private int boardSize = 3;
    private String[][] board = new String[boardSize][boardSize];

    public int getBoardSize() {
        return boardSize;
    }

    public String[][] getBoard() {
        return board;
    }

    public void declarationEmptyBoard() {
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = " ";
            }
        }
    }

    public String setBoard(int i, int j, String value) {
            return board[i][j] = value;
    }
}
