package com.tictactoe.check;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.user.UserChoice;
import com.tictactoe.user.UserGetName;
import com.tictactoe.user.UserMove;

public class CheckLine {

    int countX;
    int countO;
    int countDownCheckList;

    UserGetName userGetName = new UserGetName();
    CreateBoard3x3 createBoard3X3 = new CreateBoard3x3();
    UserChoice userChoice = new UserChoice();

    public boolean endGame = false;

    public void checkLineAll() {
        checkLineCol();
        checkLineRow();
        checkLineSlash();
        checkLineBackslash();

    }

    private void checkLineCol() {
        countDownCheckList = createBoard3X3.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            for (int i = 0; i < createBoard3X3.getBoardSize(); i++) {
                if (userChoice.getBoard()[i][countDownCheckList].equals("X")) {
                    countX++;
                    checkWin();
                }
                if (userChoice.getBoard()[i][countDownCheckList].equals("O")) {
                    countO++;
                    checkWin();
                }
            }
            countDownCheckList--;
        }
    }

    private void checkLineRow() {
        countDownCheckList = createBoard3X3.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            for (int i = 0; i < createBoard3X3.getBoardSize(); i++) {
                if (userChoice.getBoard()[countDownCheckList][i].equals("X")) {
                    countX++;
                    checkWin();
                }
                if (userChoice.getBoard()[countDownCheckList][i].equals("O")) {
                    countO++;
                    checkWin();
                }
            }
            countDownCheckList--;
        }
    }

    public void checkLineSlash() {
        countX = 0;
        countO = 0;
        for (int i = 0; i < createBoard3X3.getBoardSize(); i++) {
            if (userChoice.getBoard()[i][i].equals("X")) {
                countX++;
                checkWin();
            }
            if (userChoice.getBoard()[i][i].equals("O")) {
                countO++;
                checkWin();
            }
        }
    }

    private void checkLineBackslash() {
        countX = 0;
        countO = 0;
        countDownCheckList = createBoard3X3.getBoardSize() - 1;
        for (int i = 0; i < createBoard3X3.getBoardSize(); i++) {
            if (userChoice.getBoard()[i][countDownCheckList].equals("X")) {
                countX++;
                checkWin();
            }
            if (userChoice.getBoard()[i][countDownCheckList].equals("O")) {
                countO++;
                checkWin();
            }
            countDownCheckList--;
        }
    }

    private void checkWin() {
        if (countX == 3) {
            System.out.println("wygrał gracz " + userGetName.getFirstUserName());
            endGame = true;
        }
        if (countO == 3) {
            System.out.println("wygrał gracz " + userGetName.getSecondUserName());
            endGame = true;
        }
    }

    public boolean isEndGame() {
        return endGame;
    }
}
