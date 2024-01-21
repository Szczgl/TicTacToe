package com.tictactoe;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.board.DrawBoard;
import com.tictactoe.language.LanguageText;
import com.tictactoe.typeOfGame.Choice3x3Or10x10;
import com.tictactoe.typeOfGame.GamePvE;
import com.tictactoe.typeOfGame.GamePvP;
import com.tictactoe.user.UserGetName;

public class StartGame {

    CreateBoard createBoard = new CreateBoard();
    DrawBoard drawBoard = new DrawBoard();
    UserGetName userGetName = new UserGetName();
    Choice3x3Or10x10 choice3x3Or10x10 = new Choice3x3Or10x10();

    GamePvE gamePvE = new GamePvE();
    GamePvP gamePvP = new GamePvP();

    LanguageText text;



    public void run() {
        userGetName.getName();
        choice3x3Or10x10.choiceTypeOfGame(userGetName, createBoard);
        createBoard.declarationEmptyBoard();
        drawBoard.drawBoard(createBoard);
        text = userGetName.getText();
        if (userGetName.getSecondUserName().isEmpty()) {
            userGetName.setSecondUserName(text.computer());
            gamePvE.runPvE(userGetName, createBoard, drawBoard);
        } else {
            gamePvP.runPvP(userGetName, createBoard, drawBoard);
        }
    }




}
