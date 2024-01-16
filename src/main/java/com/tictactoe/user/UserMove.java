package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.board.DrawBoard3x3;
import com.tictactoe.check.CheckLine;
import com.tictactoe.language.LanguageSelection;
import com.tictactoe.language.LanguageText;

public class UserMove {


    UserChoice userChoice = new UserChoice();
    LanguageText text;

    public void moveGamerUserOne(UserGetName userGetName, CreateBoard3x3 createBoard3x3, DrawBoard3x3 drawBoard3x3, CheckLine checkLine) {
        text = userGetName.getText();
        System.out.print("\n" + userGetName.getFirstUserName() + text.fieldSelection());
        userChoice.choiceX(createBoard3x3, userGetName);
        checkLine.checkLineAll(createBoard3x3, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }

    public void moveGamerUserTwo(UserGetName userGetName, CreateBoard3x3 createBoard3x3, DrawBoard3x3 drawBoard3x3, CheckLine checkLine) {
        text = userGetName.getText();
        System.out.print("\n" + userGetName.getSecondUserName() + text.fieldSelection());
        userChoice.choiceO(createBoard3x3, userGetName);
        checkLine.checkLineAll(createBoard3x3, userGetName);
        if (!checkLine.isEndGame()) {
            drawBoard3x3.drawBoard(createBoard3x3);
        } else {
            drawBoard3x3.drawBoardEnd(createBoard3x3);
        }
    }
}
