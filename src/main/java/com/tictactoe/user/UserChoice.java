package com.tictactoe.user;

import com.tictactoe.board.CreateBoard;
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
            firstNumberI = (userChoice / 10 - 1);
            secondNumberJ = (userChoice % 10 - 1);
        } else {
            text.incorrectCoordinates();
            scanner.next();
            userInput(userGetName);
        }
    }


    public void choiceX(CreateBoard createBoard, UserGetName userGetName) {
        text = userGetName.getText();
        userInput(userGetName);
        if (firstNumberI >= 0 && firstNumberI < createBoard.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard.getBoardSize()) {
            if ("X".equals(createBoard.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard.getBoard()[firstNumberI][secondNumberJ])) {
                text.fieldOccupied();
                choiceX(createBoard, userGetName);
            } else {
                createBoard.setBoard(firstNumberI, secondNumberJ, "X");
            }
        } else {
            text.incorrectCoordinates();
            choiceX(createBoard,userGetName);
        }
    }

    public void choiceO(CreateBoard createBoard, UserGetName userGetName) {
        text = userGetName.getText();
        userInput(userGetName);
        if (firstNumberI >= 0 && firstNumberI < createBoard.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard.getBoardSize()) {
            if ("X".equals(createBoard.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard.getBoard()[firstNumberI][secondNumberJ])) {
                text.fieldOccupied();
                choiceO(createBoard, userGetName);
            } else {
                createBoard.setBoard(firstNumberI, secondNumberJ, "O");
            }
        } else {
            text.incorrectCoordinates();
            choiceO(createBoard,userGetName);
        }
    }
}
