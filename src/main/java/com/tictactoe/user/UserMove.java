package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;

public class UserMove {


    UserChoice userChoice;
    DrawBoard3x3 drawBoard3x3;
    UserGetName userGetName;
    CheckLine checkLine;
    CreateBoard3x3 createBoard3x3;


    public void moveGamerUserOne() {
        System.out.print("\n" + userGetName.getFirstUserName() + " podaj współrzędne pierwsza liczba poziomo →, druga pionowo ↓ (np 11 lub 23): ");
        userChoice.choiceX();
        drawBoard3x3.drawBoard(createBoard3x3);
        checkLine.checkLineAll();
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }

    public void moveGamerUserTwo() {
        System.out.print("\n" + userGetName.getSecondUserName() + " podaj współrzędne pierwsza liczba pionowo, druga poziomo (np 11 lub 23): ");
        userChoice.choiceO();
        drawBoard3x3.drawBoard(createBoard3x3);
        checkLine.checkLineAll();
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }
}
