package com.tictactoe;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;
import com.tictactoe.user.UserChoice;
import com.tictactoe.user.UserGetName;
import com.tictactoe.user.UserMove;

public class StartGame {

    CreateBoard3x3 createBoard3X3 = new CreateBoard3x3();
    DrawBoard3x3 drawBoard3x3 = new DrawBoard3x3();
    UserGetName userGetName = new UserGetName();
    CheckLine checkLine;
    UserMove userMove;
    CreateBoard3x3 createBoard3x3;




    public void run() {

        userGetName.getName();
        createBoard3X3.declarationEmptyBoard();
        drawBoard3x3.drawBoard(createBoard3x3);
//        for (int i = 1; i < 10; i++) {
//            userMove.moveGamerUserOne();
//            if (checkLine.isEndGame()) {
//                //scanner.close();
//                break;
//            }
//            userMove.moveGamerUserTwo();
//            if (checkLine.isEndGame()) {
//                //scanner.close();
//                break;
//            }
//        }
    }
}
