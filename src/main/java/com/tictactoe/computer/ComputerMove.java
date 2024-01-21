package com.tictactoe.computer;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.board.DrawBoard;
import com.tictactoe.check.CheckLine;
import com.tictactoe.user.UserGetName;

public class ComputerMove {

    ComputerChoice computerChoice = new ComputerChoice();

    public void moveComputer(UserGetName userGetName, CreateBoard createBoard, DrawBoard drawBoard, CheckLine checkLine) {
        computerChoice.choiceComputerAlgorithm(createBoard);
        checkLine.checkLineAll(createBoard, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard.drawBoard(createBoard);
        } else {
            drawBoard.drawBoardEnd(createBoard);
        }
    }
}
