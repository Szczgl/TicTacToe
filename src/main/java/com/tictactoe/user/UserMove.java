package com.tictactoe.user;

import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;

public class UserMove {


    UserChoice userChoice = new UserChoice();
    DrawBoard3x3 drawBoard3x3 = new DrawBoard3x3();
    UserGetName userGetName = new UserGetName();
    CheckLine checkLine = new CheckLine();

//    public UserMove(UserChoice userChoice, DrawBoard3x3 drawBoard3x3, UserGetName userGetName, CheckLine checkLine) {
//        this.userChoice = userChoice;
//        this.drawBoard3x3 = drawBoard3x3;
//        this.userGetName = userGetName;
//        this.checkLine = checkLine;
//    }

    public void moveGamerUserOne() {
        System.out.print("\n" + userGetName.getFirstUserName() + " podaj współrzędne pierwsza liczba poziomo →, druga pionowo ↓ (np 11 lub 23): ");
        userChoice.choiceX();
        drawBoard3x3.drawBoard();
        checkLine.checkLineAll();
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard();
        } else {
            drawBoard3x3.drawBoardEnd();
        }
    }

    public void moveGamerUserTwo() {
        System.out.print("\n" + userGetName.getSecondUserName() + " podaj współrzędne pierwsza liczba pionowo, druga poziomo (np 11 lub 23): ");
        userChoice.choiceO();
        drawBoard3x3.drawBoard();
        checkLine.checkLineAll();
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard();
        } else {
            drawBoard3x3.drawBoardEnd();
        }
    }
}
