package com.tictactoe.computer;

import com.tictactoe.board.CreateBoard3x3;

import java.util.Random;

public class ComputerChoice {

    Random random = new Random();

    private int firstNumberI;
    private int secondNumberJ;
    private boolean check = true;

    public void choiceComputer(CreateBoard3x3 createBoard3x3) {

        int firstNumberI = random.nextInt(0,3);
        int secondNumberJ = random.nextInt(0,3);
        if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
            choiceComputer(createBoard3x3);
        } else {
                createBoard3x3.setBoard(firstNumberI, secondNumberJ, "O");
        }
    }

    public void putXOrO (CreateBoard3x3 createBoard3x3) {
        if ("X".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ]) || "O".equals(createBoard3x3.getBoard()[firstNumberI][secondNumberJ])) {
            choiceComputerAlgorithm(createBoard3x3);
        } else {
            createBoard3x3.setBoard(firstNumberI, secondNumberJ, "O");
        }
    }

    public void choiceComputerAlgorithm(CreateBoard3x3 createBoard3x3) {

        int board1 = 0;
        int board2 = 0;
        int board3 = 0;
        int board4 = 0;
        int board5 = 0;
        int board6 = 0;
        int board7 = 0;
        int board8 = 0;
        int board9 = 0;



        if ("X".equals(createBoard3x3.getBoard()[0][0])) {
            board1 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[0][1])) {
            board2 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[0][2])) {
            board3 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[1][0])) {
            board4 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[1][1])) {
            board5 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[1][2])) {
            board6 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[2][0])) {
            board7 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[2][1])) {
            board8 = 1;
        }
        if ("X".equals(createBoard3x3.getBoard()[2][2])) {
            board9 = 1;
        }

        if ("O".equals(createBoard3x3.getBoard()[0][0])) {
            board1 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[0][1])) {
            board2 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[0][2])) {
            board3 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[1][0])) {
            board4 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[1][1])) {
            board5 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[1][2])) {
            board6 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[2][0])) {
            board7 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[2][1])) {
            board8 = -1;
        }
        if ("O".equals(createBoard3x3.getBoard()[2][2])) {
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
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = 0;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum2 == -2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = 1;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum3 == -2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = 2;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum4 == -2) {
                firstNumberI = 0;
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
            if (sum5 == -2) {
                firstNumberI = 1;
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
            if (sum6 == -2) {
                firstNumberI = 2;
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
            if (sum7 == -2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = firstNumberI;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum8 == -2) {
                firstNumberI = random.nextInt(0, 3);
                if (firstNumberI == 1) {
                    secondNumberJ = firstNumberI;
                } else if (firstNumberI == 0) {
                    secondNumberJ = 2;
                } else {
                    secondNumberJ = 0;
                }
                putXOrO(createBoard3x3);
                break;
            }

            if (sum1 == 2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = 0;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum2 == 2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = 1;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum3 == 2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = 2;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum4 == 2) {
                firstNumberI = 0;
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
            if (sum5 == 2) {
                firstNumberI = 1;
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
            if (sum6 == 2) {
                firstNumberI = 2;
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
            if (sum7 == 2) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = firstNumberI;
                putXOrO(createBoard3x3);
                break;
            }
            if (sum8 == 2) {
                firstNumberI = random.nextInt(0, 3);
                if (firstNumberI == 1) {
                    secondNumberJ = firstNumberI;
                } else if (firstNumberI == 0) {
                    secondNumberJ = 2;
                } else {
                    secondNumberJ = 0;
                }
                putXOrO(createBoard3x3);
                break;
            }

            if ((sum1 <= 1 && sum1 >= -1) || (sum2 <= 1 && sum2 >= -1) || (sum3 <= 1 && sum3 >= -1) || (sum4 <= 1 && sum4 >= -1)
                    || (sum5 <= 1 && sum5 >= -1) || (sum6 <= 1 && sum6 >= -1) || (sum7 <= 1 && sum7 >= -1) || (sum8 <= 1 && sum8 >= -1)) {
                firstNumberI = random.nextInt(0, 3);
                secondNumberJ = random.nextInt(0, 3);
                putXOrO(createBoard3x3);
                break;
            }
        }
    }
}