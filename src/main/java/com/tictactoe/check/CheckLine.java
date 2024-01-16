package com.tictactoe.check;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.user.UserGetName;

public class CheckLine {

    private int countX;
    private int countO;
    private int countDownCheckList;

    public boolean endGame = false;

    public void checkLineAll(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        checkLineCol(createBoard3x3, userGetName);
        checkLineRow(createBoard3x3, userGetName);
        checkLineSlash(createBoard3x3, userGetName);
        checkLineBackslash(createBoard3x3, userGetName);

    }

    private void checkLineCol(CreateBoard3x3 createBoard3X3, UserGetName userGetName) {
        countDownCheckList = createBoard3X3.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            for (int i = 0; i < createBoard3X3.getBoardSize(); i++) {
                if (createBoard3X3.getBoard()[i][countDownCheckList].equals("X")) {
                    countX++;
                    checkWin(userGetName);
                }
                if (createBoard3X3.getBoard()[i][countDownCheckList].equals("O")) {
                    countO++;
                    checkWin(userGetName);
                }
            }
            countDownCheckList--;
        }
    }

    private void checkLineRow(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        countDownCheckList = createBoard3x3.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            for (int i = 0; i < createBoard3x3.getBoardSize(); i++) {
                if (createBoard3x3.getBoard()[countDownCheckList][i].equals("X")) {
                    countX++;
                    checkWin(userGetName);
                }
                if (createBoard3x3.getBoard()[countDownCheckList][i].equals("O")) {
                    countO++;
                    checkWin(userGetName);
                }
            }
            countDownCheckList--;
        }
    }

    private void checkLineSlash(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        countX = 0;
        countO = 0;
        for (int i = 0; i < createBoard3x3.getBoardSize(); i++) {
            if (createBoard3x3.getBoard()[i][i].equals("X")) {
                countX++;
                checkWin(userGetName);
            }
            if (createBoard3x3.getBoard()[i][i].equals("O")) {
                countO++;
                checkWin(userGetName);
            }
        }
    }

    private void checkLineBackslash(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        countX = 0;
        countO = 0;
        countDownCheckList = createBoard3x3.getBoardSize() - 1;
        for (int i = 0; i < createBoard3x3.getBoardSize(); i++) {
            if (createBoard3x3.getBoard()[i][countDownCheckList].equals("X")) {
                countX++;
                checkWin(userGetName);
            }
            if (createBoard3x3.getBoard()[i][countDownCheckList].equals("O")) {
                countO++;
                checkWin(userGetName);
            }
            countDownCheckList--;
        }
    }

    private void checkWin(UserGetName userGetName) {
        if (countX == 3) {
            System.out.println("\nwygrał gracz " + userGetName.getFirstUserName() + "\n");
            endGame = true;
        }
        if (countO == 3) {
            System.out.println("\nwygrał gracz " + userGetName.getSecondUserName() + "\n");
            endGame = true;
        }
    }

    public boolean isEndGame() {
        return endGame;
    }
}
