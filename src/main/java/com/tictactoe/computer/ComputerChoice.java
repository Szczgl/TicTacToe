package com.tictactoe.computer;

import com.tictactoe.board.CreateBoard;

import java.util.Random;

public class ComputerChoice {

    Random random = new Random();

    private int firstNumberI;
    private int secondNumberJ;
    private boolean check = true;



//    public void choiceComputer(CreateBoard createBoard) {
//
//        int firstNumberI = random.nextInt(0,createBoard.getBoardSize());
//        int secondNumberJ = random.nextInt(0,createBoard.getBoardSize());
//        if ("X".equals(createBoard.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard.getBoard()[firstNumberI][secondNumberJ])) {
//            choiceComputer(createBoard);
//        } else {
//                createBoard.setBoard(firstNumberI, secondNumberJ, "O");
//        }
//    }

    public void putXOrO (CreateBoard createBoard) {
        if ("X".equals(createBoard.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard.getBoard()[firstNumberI][secondNumberJ])) {
            choiceComputerAlgorithm(createBoard);
        } else {
            createBoard.setBoard(firstNumberI, secondNumberJ, "O");
        }
    }

    public void choiceComputerAlgorithm(CreateBoard createBoard) {

        int boardSizeComp = createBoard.getBoardSize();
        int[][] boardComp = new int[boardSizeComp][boardSizeComp];
        int[] sum = new int[30];
        if (boardSizeComp == 3) {
            sum = new int[8];
        } else if (boardSizeComp == 10) {
            sum = new int[30];
        }
        for (int i = 0; i < boardSizeComp; i++) {
            for (int j = 0; j < boardSizeComp; j++) {
                boardComp[i][j] = 0;
            }
        }

        for (int i = 0; i < boardSizeComp; i++) {
            for (int j = 0; j < boardSizeComp; j++) {
                if ("X".equals(createBoard.getBoard()[i][j])) {
                    boardComp[i][j] = 1;
                }
                if ("O".equals(createBoard.getBoard()[i][j])) {
                    boardComp[i][j] = -1;
                }
            }
        }

        if (createBoard.getBoardSize() == 3) {
            for (int i = 0; i < boardSizeComp; i++) {
                sum[i] = 0;
                sum[i + boardSizeComp] = 0;
                sum[6] = 0;
                sum[7] = 0;

                for (int j = 0; j < boardSizeComp; j++) {
                    sum[i] += boardComp[j][i];
                }
                for (int j = 0; j < boardSizeComp; j++) {
                    sum[i + boardSizeComp] += boardComp[i][j];
                }
                sum[6] += boardComp[i][i];
                int j = boardSizeComp - 1 - i;
                sum[7] += boardComp[i][j];
            }
        }

        while (check) {
            if (sum[0] == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 0;
                putXOrO(createBoard);
                break;
            }
            if (sum[1] == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 1;
                putXOrO(createBoard);
                break;
            }
            if (sum[2] == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 2;
                putXOrO(createBoard);
                break;
            }
            if (sum[3] == -2) {
                firstNumberI = 0;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum[4] == -2) {
                firstNumberI = 1;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum[5] == -2) {
                firstNumberI = 2;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum[6] == -2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = firstNumberI;
                putXOrO(createBoard);
                break;
            }
            if (sum[7] == -2) {
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

            if (sum[0] == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 0;
                putXOrO(createBoard);
                break;
            }
            if (sum[1] == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 1;
                putXOrO(createBoard);
                break;
            }
            if (sum[2] == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = 2;
                putXOrO(createBoard);
                break;
            }
            if (sum[3] == 2) {
                firstNumberI = 0;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum[4] == 2) {
                firstNumberI = 1;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum[5] == 2) {
                firstNumberI = 2;
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
            if (sum[6] == 2) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = firstNumberI;
                putXOrO(createBoard);
                break;
            }
            if (sum[7] == 2) {
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

            if ((sum[0] <= 1 && sum[0] >= -1) || (sum[1] <= 1 && sum[1] >= -1) || (sum[2] <= 1 && sum[2] >= -1) || (sum[3] <= 1 && sum[3] >= -1)
                    || (sum[4] <= 1 && sum[4] >= -1) || (sum[5] <= 1 && sum[5] >= -1) || (sum[6] <= 1 && sum[6] >= -1) || (sum[7] <= 1 && sum[7] >= -1)) {
                firstNumberI = random.nextInt(0, createBoard.getBoardSize());
                secondNumberJ = random.nextInt(0, createBoard.getBoardSize());
                putXOrO(createBoard);
                break;
            }
        }
    }
}