package com.tictactoe.typeOfGame;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.board.DrawBoard;
import com.tictactoe.check.CheckLine;
import com.tictactoe.computer.ComputerMove;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;
import com.tictactoe.user.UserMove;

public class GamePvE {

    CheckLine checkLine = new CheckLine();
    UserMove userMove = new UserMove();
    ComputerMove computerMove = new ComputerMove();
    LanguageText text;
    int count = 0;

    public void runPvE(UserGetName userGetName, CreateBoard createBoard, DrawBoard drawBoard) {
        while (!checkLine.isEndGame()) {
            userMove.moveGamerUserOne(userGetName, createBoard, drawBoard, checkLine);
            count++;
            if (checkLine.isEndGame()) {
                break;
            }
            if (count == 9) {
                break;
            }
            System.out.println("\n");
            computerMove.moveComputer(userGetName, createBoard, drawBoard, checkLine);
            count++;
        }
        text = userGetName.getText();
        if (!checkLine.isEndGame()) {
            System.out.println("\n   " + text.draw());
        }
    }
}
