package com.tictactoe.board;

public class DrawBoard3x3 {


    public void drawBoard(CreateBoard3x3 createBoard3x3) {
        System.out.println("   1   2   3 " );
        System.out.println("1  " + createBoard3x3.getBoard()[0][0] + " | " + createBoard3x3.getBoard()[0][1] + " | " + createBoard3x3.getBoard()[0][2]);
        System.out.println("  ---+---+---");
        System.out.println("2  " + createBoard3x3.getBoard()[1][0] + " | " + createBoard3x3.getBoard()[1][1] + " | " + createBoard3x3.getBoard()[1][2]);
        System.out.println("  ---+---+---");
        System.out.println("3  " + createBoard3x3.getBoard()[2][0] + " | " + createBoard3x3.getBoard()[2][1] + " | " + createBoard3x3.getBoard()[2][2]);

    }

    public void drawBoardEnd(CreateBoard3x3 createBoard3x3) {
        System.out.println(" " + createBoard3x3.getBoard()[0][0] + " | " + createBoard3x3.getBoard()[0][1] + " | " + createBoard3x3.getBoard()[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + createBoard3x3.getBoard()[1][0] + " | " + createBoard3x3.getBoard()[1][1] + " | " + createBoard3x3.getBoard()[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + createBoard3x3.getBoard()[2][0] + " | " + createBoard3x3.getBoard()[2][1] + " | " + createBoard3x3.getBoard()[2][2]);
    }
}
