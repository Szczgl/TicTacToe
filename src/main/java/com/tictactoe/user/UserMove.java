package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;

public class UserMove {


    UserChoice userChoice = new UserChoice();


    public void moveGamerUserOne(UserGetName userGetName, CreateBoard3x3 createBoard3x3, DrawBoard3x3 drawBoard3x3, CheckLine checkLine) {
        System.out.print("\n" + userGetName.getFirstUserName() + " podaj współrzędne pierwsza liczba poziomo →, druga pionowo ↓ (np 11 lub 23): ");
        userChoice.choiceX(createBoard3x3);
        checkLine.checkLineAll(createBoard3x3, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }

    public void moveGamerUserTwo(UserGetName userGetName, CreateBoard3x3 createBoard3x3, DrawBoard3x3 drawBoard3x3, CheckLine checkLine) {
        System.out.print("\n" + userGetName.getSecondUserName() + " podaj współrzędne pierwsza liczba poziomo →, druga pionowo ↓ (np 11 lub 23): ");
        userChoice.choiceO(createBoard3x3);
        checkLine.checkLineAll(createBoard3x3, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }
}
