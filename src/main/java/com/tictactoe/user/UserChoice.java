package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.language.LanguageText;

import java.util.Scanner;

public class UserChoice {

    private int firstNumberI;
    private int secondNumberJ;

    Scanner scanner = new Scanner(System.in);
    LanguageText text;

    public void userInput(UserGetName userGetName) {
        int userChoice;
        text = userGetName.getText();
        if (scanner.hasNextInt()) {
            userChoice = scanner.nextInt();
            firstNumberI = (userChoice / 10) - 1;
            secondNumberJ = (userChoice % 10) - 1;
        } else {
            text.incorrectCoordinates();
            scanner.next();
            userInput(userGetName);
        }
    }


    public void choiceX(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        text = userGetName.getText();
        userInput(userGetName);
        if (firstNumberI >= 0 && firstNumberI < createBoard3x3.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard3x3.getBoardSize()) {
            if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
                text.fieldOccupied();
                choiceX(createBoard3x3, userGetName);
            } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "X");
            }
        } else {
            text.incorrectCoordinates();
            choiceX(createBoard3x3,userGetName);
        }
    }

    public void choiceO(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        text = userGetName.getText();
        userInput(userGetName);
        if (firstNumberI >= 0 && firstNumberI < createBoard3x3.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard3x3.getBoardSize()) {
            if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
                text.fieldOccupied();
                choiceO(createBoard3x3, userGetName);
            } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "O");
            }
        } else {
            text.incorrectCoordinates();
            choiceO(createBoard3x3,userGetName);
        }
    }
}
