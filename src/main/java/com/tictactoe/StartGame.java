package com.tictactoe;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;
import com.tictactoe.computer.ComputerMove;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;
import com.tictactoe.user.UserMove;

public class StartGame {

    CreateBoard3x3 createBoard3X3 = new CreateBoard3x3();
    DrawBoard3x3 drawBoard3x3 = new DrawBoard3x3();
    UserGetName userGetName = new UserGetName();
    CheckLine checkLine = new CheckLine();
    UserMove userMove = new UserMove();
    ComputerMove computerMove = new ComputerMove();
    LanguageText text;

    int count = 0;

    public void run() {
        userGetName.getName();
        createBoard3X3.declarationEmptyBoard();
        drawBoard3x3.drawBoard(createBoard3X3);
        text = userGetName.getText();
        if (userGetName.getSecondUserName().isEmpty()) {
            userGetName.setSecondUserName(text.computer());
            runPvE();
        } else {
            runPvP();
        }
    }

    public void runPvP() {
        while (!checkLine.isEndGame()) {
            userMove.moveGamerUserOne(userGetName, createBoard3X3, drawBoard3x3, checkLine);
            count++;
            if (checkLine.isEndGame()) {
                break;
            }
            if (count == 9) {
                break;
            }
            userMove.moveGamerUserTwo(userGetName, createBoard3X3, drawBoard3x3, checkLine);
            count++;
        }
        text = userGetName.getText();
        if (!checkLine.isEndGame()) {
            System.out.println("\n   " + text.draw());
        }
    }

    public void runPvE() {
        while (!checkLine.isEndGame()) {
            userMove.moveGamerUserOne(userGetName, createBoard3X3, drawBoard3x3, checkLine);
            count++;
            if (checkLine.isEndGame()) {
                break;
            }
            if (count == 9) {
                break;
            }
            System.out.println("\n");
            computerMove.moveComputer(userGetName, createBoard3X3, drawBoard3x3, checkLine);
            count++;
        }
        text = userGetName.getText();
        if (!checkLine.isEndGame()) {
            System.out.println("\n   " + text.draw());
        }
    }
}
