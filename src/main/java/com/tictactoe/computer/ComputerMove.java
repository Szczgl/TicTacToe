package com.tictactoe.computer;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;
import com.tictactoe.user.UserGetName;

public class ComputerMove {

    ComputerChoice computerChoice = new ComputerChoice();

    public void moveComputer(UserGetName userGetName, CreateBoard3x3 createBoard3x3, DrawBoard3x3 drawBoard3x3, CheckLine checkLine) {
        computerChoice.choiceComputerAlgorithm(createBoard3x3);
        checkLine.checkLineAll(createBoard3x3, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }
}
