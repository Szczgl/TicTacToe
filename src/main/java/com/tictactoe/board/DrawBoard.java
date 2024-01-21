package com.tictactoe.board;

public class DrawBoard {

    public void drawBoard(CreateBoard createBoard) {
        for (int i = 0; i < createBoard.getBoardSize(); i++) {
            System.out.print("   " + i);
        }
        System.out.println();
        for (int i = 0; i < createBoard.getBoardSize(); i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < createBoard.getBoardSize(); j++) {
                System.out.print(createBoard.getBoard()[i][j]);
                if (j < createBoard.getBoardSize() - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < createBoard.getBoardSize() - 1 ) {
                System.out.print("  ");
                for (int j = 0; j < createBoard.getBoardSize(); j++) {
                    System.out.print("---");
                    if (j < createBoard.getBoardSize() - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }

    public void drawBoardEnd(CreateBoard createBoard) {
        for (int i = 0; i < createBoard.getBoardSize(); i++) {
            System.out.print(" ");
            for (int j = 0; j < createBoard.getBoardSize(); j++) {
                System.out.print(createBoard.getBoard()[i][j]);
                if (j < createBoard.getBoardSize() - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < createBoard.getBoardSize() - 1 ) {
                for (int j = 0; j < createBoard.getBoardSize(); j++) {
                    System.out.print("---");
                    if (j < createBoard.getBoardSize() - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }
}
