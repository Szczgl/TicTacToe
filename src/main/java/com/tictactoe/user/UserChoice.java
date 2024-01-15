package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserChoice {

    private int firstNumberI;
    private int secondNumberJ;

    Scanner scanner = new Scanner(System.in);

    public void userInput() {
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        firstNumberI = (userChoice / 10) - 1;
        secondNumberJ = (userChoice % 10) - 1;
    }



    public void choiceX(CreateBoard3x3 createBoard3x3) {
        userInput();
        if (firstNumberI >= 0 && firstNumberI < createBoard3x3.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard3x3.getBoardSize()) {
            if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
                System.out.println("wybierz inne pole to już jest zajęte");
            } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "X");
            }
        } else {
            System.out.println("Nieprawidłowe współrzędne.");
        }
    }

    public void choiceO(CreateBoard3x3 createBoard3x3) {
        userInput();
        if (firstNumberI >= 0 && firstNumberI < createBoard3x3.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard3x3.getBoardSize()) {
            if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
                System.out.println("wybierz inne pole to już jest zajęte");
            } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "O");
            }
        } else {
            System.out.println("Nieprawidłowe współrzędne.");
        }
    }
}
