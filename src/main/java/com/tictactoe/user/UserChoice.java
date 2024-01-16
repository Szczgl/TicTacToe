package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;
import java.util.Scanner;

public class UserChoice {

    private int firstNumberI;
    private int secondNumberJ;
    private int userChoice;

    Scanner scanner = new Scanner(System.in);

    public void userInput() {
        if (scanner.hasNextInt()) {
            userChoice = scanner.nextInt();
            firstNumberI = (userChoice / 10) - 1;
            secondNumberJ = (userChoice % 10) - 1;
        } else {
            System.out.print("To nie jest współrzędna, podaj ponownie: ");
            scanner.next();
            userInput();
        }
    }


    public void choiceX(CreateBoard3x3 createBoard3x3) {
        userInput();
        if (firstNumberI >= 0 && firstNumberI < createBoard3x3.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard3x3.getBoardSize()) {
            if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
                System.out.print("wybierz inne pole to już jest zajęte, podaj ponownie współrzędne: ");
                choiceX(createBoard3x3);
            } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "X");
            }
        } else {
            System.out.print("Nieprawidłowe współrzędne, podaj ponownie współrzędne: ");
            choiceX(createBoard3x3);
        }
    }

    public void choiceO(CreateBoard3x3 createBoard3x3) {
        userInput();
        if (firstNumberI >= 0 && firstNumberI < createBoard3x3.getBoardSize() && secondNumberJ >= 0 && secondNumberJ < createBoard3x3.getBoardSize()) {
            if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
                System.out.print("wybierz inne pole to już jest zajęte, podaj ponownie współrzędne: ");
                choiceO(createBoard3x3);
            } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "O");
            }
        } else {
            System.out.print("Nieprawidłowe współrzędne, podaj ponownie współrzędne: ");
            choiceO(createBoard3x3);
        }
    }
}
