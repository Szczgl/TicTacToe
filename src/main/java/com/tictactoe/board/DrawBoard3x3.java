package com.tictactoe.board;

import com.tictactoe.user.UserChoice;

public class DrawBoard3x3 {

    UserChoice userChoice = new UserChoice();

//    public DrawBoard3x3(UserChoice userChoice) {
//        this.userChoice = userChoice;
//    }

//    public void setUserChoice(UserChoice userChoice) {
//        this.userChoice = userChoice;
//    }



    public void drawBoard() {
        System.out.println("   1 | 2 | 3 \n" );
        System.out.println("1  " + userChoice.getBoard()[0][0] + " | " + userChoice.getBoard()[0][1] + " | " + userChoice.getBoard()[0][2]);
        System.out.println("  ---+---+---");
        System.out.println("2  " + userChoice.getBoard()[1][0] + " | " + userChoice.getBoard()[1][1] + " | " + userChoice.getBoard()[1][2]);
        System.out.println("  ---+---+---");
        System.out.println("3  " + userChoice.getBoard()[2][0] + " | " + userChoice.getBoard()[2][1] + " | " + userChoice.getBoard()[2][2]);

    }

    public void drawBoardEnd() {
        System.out.println(" " + userChoice.getBoard()[0][0] + " | " + userChoice.getBoard()[0][1] + " | " + userChoice.getBoard()[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + userChoice.getBoard()[1][0] + " | " + userChoice.getBoard()[1][1] + " | " + userChoice.getBoard()[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + userChoice.getBoard()[2][0] + " | " + userChoice.getBoard()[2][1] + " | " + userChoice.getBoard()[2][2]);
    }
}
