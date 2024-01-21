package com.tictactoe.typeOfGame;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;

import java.util.Scanner;

public class Choice3x3Or10x10 {
    Scanner scanner = new Scanner(System.in);
    LanguageText text;


    public void choiceTypeOfGame(UserGetName userGetName, CreateBoard createBoard) {
        text = userGetName.getText();
        System.out.println("1 - 3x3");
        System.out.println("2 - 10x10\n");
        text.typeOfGame();
        String gameChoose = scanner.nextLine();
        switch (gameChoose) {
            case "1" :
                createBoard.setBoardSize(3);
                break;
            case "2" :
                createBoard.setBoardSize(10);
                break;
            default:
                text.badChoice();
                choiceTypeOfGame(userGetName, createBoard);
        }
        System.out.println();
    }
}
