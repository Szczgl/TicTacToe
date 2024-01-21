package com.tictactoe.computer;

import com.tictactoe.board.CreateBoard;

import java.util.Random;

public class ComputerChoice {

    Random random = new Random();

    private int firstNumberI;
    private int secondNumberJ;
    private boolean check = true;

    public void choiceComputer(CreateBoard createBoard) {

        int firstNumberI = random.nextInt(0,createBoard.getBoardSize());
        int secondNumberJ = random.nextInt(0,createBoard.getBoardSize());
        if ("X".equals(createBoard.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard.getBoard()[firstNumberI][secondNumberJ])) {
            choiceComputer(createBoard);
        } else {
                createBoard.setBoard(firstNumberI, secondNumberJ, "O");
        }
    }

    public void putXOrO (CreateBoard createBoard) {
        if ("X".equals(createBoard.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard.getBoard()[firstNumberI][secondNumberJ])) {
            choiceComputerAlgorithm(createBoard);
        } else {
            createBoard.setBoard(firstNumberI, secondNumberJ, "O");
        }
    }

    public void choiceComputerAlgorithm(CreateBoard createBoard) {

        int board1 = 0;
        int board2 = 0;
        int board3 = 0;
        int board4 = 0;
        int board5 = 0;
        int board6 = 0;
        int board7 = 0;
        int board8 = 0;
        int board9 = 0;



        if ("X".equals(createBoard.getBoard()[0][0])) {
            board1 = 1;
        }
        if ("X".equals(createBoard.getBoard()[0][1])) {
            board2 = 1;
        }
        if ("X".equals(createBoard.getBoard()[0][2])) {
            board3 = 1;
        }
        if ("X".equals(createBoard.getBoard()[1][0])) {
            board4 = 1;
        }
        if ("X".equals(createBoard.getBoard()[1][1])) {
            board5 = 1;
        }
        if ("X".equals(createBoard.getBoard()[1][2])) {
            board6 = 1;
        }
        if ("X".equals(createBoard.getBoard()[2][0])) {
            board7 = 1;
        }
        if ("X".equals(createBoard.getBoard()[2][1])) {
            board8 = 1;
        }
        if ("X".equals(createBoard.getBoard()[2][2])) {
            board9 = 1;
        }

        if ("O".equals(createBoard.getBoard()[0][0])) {
            board1 = -1;
        }
        if ("O".equals(createBoard.getBoard()[0][1])) {
            board2 = -1;
        }
        if ("O".equals(createBoard.getBoard()[0][2])) {
            board3 = -1;
        }
        if ("O".equals(createBoard.getBoard()[1][0])) {
            board4 = -1;
        }
        if ("O".equals(createBoard.getBoard()[1][1])) {
            board5 = -1;
        }
        if ("O".equals(createBoard.getBoard()[1][2])) {
            board6 = -1;
        }
        if ("O".equals(createBoard.getBoard()[2][0])) {
            board7 = -1;
        }
        if ("O".equals(createBoard.getBoard()[2][1])) {
            board8 = -1;
        }
        if ("O".equals(createBoard.getBoard()[2][2])) {
            board9 = -1;
        }

        int sum1 = board1 + board4 + board7;
        int sum2 = board2 + board5 + board8;
        int sum3 = board3 + board6 + board9;
        int sum4 = board1 + board2 + board3;
        int sum5 = board4 + board5 + board6;
        int sum6 = board7 + board8 + board9;
        int sum7 = board1 + board5 + board9;
        int sum8 = board3 + board5 + board7;

        while (check) {
            if (sum1 == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 0;
                putXOrO(createBoard);
                break;
            }
            if (sum2 == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 1;
                putXOrO(createBoard);
                break;
            }
            if (sum3 == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 2;
                putXOrO(createBoard);
                break;
            }
            if (sum4 == -2) {
                firstNumberI = 0;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum5 == -2) {
                firstNumberI = 1;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum6 == -2) {
                firstNumberI = 2;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum7 == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = firstNumberI;
                putXOrO(createBoard);
                break;
            }
            if (sum8 == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                if (firstNumberI == 1) {
                    secondNumberJ = firstNumberI;
                } else if (firstNumberI == 0) {
                    secondNumberJ = 2;
                } else {
                    secondNumberJ = 0;
                }
                putXOrO(createBoard);
                break;
            }

            if (sum1 == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 0;
                putXOrO(createBoard);
                break;
            }
            if (sum2 == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 1;
                putXOrO(createBoard);
                break;
            }
            if (sum3 == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 2;
                putXOrO(createBoard);
                break;
            }
            if (sum4 == 2) {
                firstNumberI = 0;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum5 == 2) {
                firstNumberI = 1;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum6 == 2) {
                firstNumberI = 2;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum7 == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = firstNumberI;
                putXOrO(createBoard);
                break;
            }
            if (sum8 == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                if (firstNumberI == 1) {
                    secondNumberJ = firstNumberI;
                } else if (firstNumberI == 0) {
                    secondNumberJ = 2;
                } else {
                    secondNumberJ = 0;
                }
                putXOrO(createBoard);
                break;
            }

            if ((sum1 <= 1 && sum1 >= -1) || (sum2 <= 1 && sum2 >= -1) || (sum3 <= 1 && sum3 >= -1) || (sum4 <= 1 && sum4 >= -1)
                    || (sum5 <= 1 && sum5 >= -1) || (sum6 <= 1 && sum6 >= -1) || (sum7 <= 1 && sum7 >= -1) || (sum8 <= 1 && sum8 >= -1)) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
        }
    }
}