package com.tictactoe.user;

import com.tictactoe.board.CreateBoard3x3;

import java.util.Scanner;

public class UserChoice {

    private int firstNumberI;
    private int secondNumberJ;

    CreateBoard3x3 createBoard3X3 = new CreateBoard3x3();

//    public UserChoice(CreateBoard3x3 createBoard3X3) {
//        this.createBoard3X3 = createBoard3X3;
//    }


    Scanner scanner = new Scanner(System.in);
    private String[][] board;

//    public void setBoard(String[][] board) {
//        this.board = board;
//    }

    public void choiceX() {
        int userOneChoiceX = scanner.nextInt();
        scanner.nextLine();
        int firstNumberI = (userOneChoiceX / 10) - 1;
        int secondNumberJ = (userOneChoiceX % 10) - 1;
        if ("X".equals(createBoard3X3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3X3.getBoard()[firstNumberI][secondNumberJ])) {
            System.out.println("wybierz inne pole to już jest zajęte");
        } else {
            createBoard3X3.getBoard()[firstNumberI][secondNumberJ] = "X";
        }
    }

    public void choiceO() {
        int userTwoChoiceO = scanner.nextInt();
        scanner.nextLine();
        int firstNumberI = (userTwoChoiceO / 10) - 1;
        int secondNumberJ = (userTwoChoiceO % 10) - 1;
        if ("X".equals(createBoard3X3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3X3.getBoard()[firstNumberI][secondNumberJ])) {
            System.out.println("wybierz inne pole to już jest zajęte");
        } else {
            createBoard3X3.getBoard()[firstNumberI][secondNumberJ] = "O";
        }
    }
    public String[][] getBoard() {
        return board;
    }

}
