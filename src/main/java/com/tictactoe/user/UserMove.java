package com.tictactoe.user;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.board.DrawBoard;
import com.tictactoe.check.CheckLine;
import com.tictactoe.language.LanguageText;

public class UserMove {


    UserChoice userChoice = new UserChoice();
    LanguageText text;

    public void moveGamerUserOne(UserGetName userGetName, CreateBoard createBoard, DrawBoard drawBoard, CheckLine checkLine) {
        text = userGetName.getText();
        System.out.print("\n" + userGetName.getFirstUserName() + text.fieldSelectionRow());
        userChoice.choiceX(createBoard, userGetName);
        checkLine.checkLineAll(createBoard, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard.drawBoard(createBoard);
        } else {
            drawBoard.drawBoardEnd(createBoard);
        }
    }

    public void moveGamerUserTwo(UserGetName userGetName, CreateBoard createBoard, DrawBoard drawBoard, CheckLine checkLine) {
        text = userGetName.getText();
        System.out.print("\n" + userGetName.getSecondUserName() + text.fieldSelectionRow());
        userChoice.choiceO(createBoard, userGetName);
        checkLine.checkLineAll(createBoard, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard.drawBoard(createBoard);
        } else {
            drawBoard.drawBoardEnd(createBoard);
        }
    }
}
