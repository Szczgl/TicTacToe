package com.tictactoe;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;
import com.tictactoe.user.UserGetName;
import com.tictactoe.user.UserMove;

public class StartGame {

    CreateBoard3x3 createBoard3X3 = new CreateBoard3x3();
    DrawBoard3x3 drawBoard3x3 = new DrawBoard3x3();
    UserGetName userGetName = new UserGetName();
    CheckLine checkLine = new CheckLine();
    UserMove userMove = new UserMove();

    public void run() {
        userGetName.getName();
        createBoard3X3.declarationEmptyBoard();
        drawBoard3x3.drawBoard(createBoard3X3);
        while (!checkLine.isEndGame()) {
            userMove.moveGamerUserOne(userGetName, createBoard3X3, drawBoard3x3, checkLine);
            if (checkLine.isEndGame()) {
                break;
            }
            userMove.moveGamerUserTwo(userGetName, createBoard3X3, drawBoard3x3, checkLine);
        }
    }
}
