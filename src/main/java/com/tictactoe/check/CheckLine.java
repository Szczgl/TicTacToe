package com.tictactoe.check;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;

public class CheckLine {

    private int countX;
    private int countO;

    private int count0Return;
    private int countXReturn;
    private int countDownCheckList;
    public boolean endGame = false;

    LanguageText text;

    public int getCount0Return() {
        return count0Return;
    }

    public int getCountXReturn() {
        return countXReturn;
    }

    public int getCountX() {
        return countX;
    }

    public int getCountO() {
        return countO;
    }

    public void checkLineAll(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
        checkLineCol(createBoard3x3, userGetName);
        checkLineRow(createBoard3x3, userGetName);
        checkLineSlash(createBoard3x3, userGetName);
        checkLineBackslash(createBoard3x3, userGetName);

    }

    public void checkLineCol(CreateBoard3x3 createBoard3X3, UserGetName userGetName) {
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

    public void checkLineRow(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
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

    public void checkLineSlash(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
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

    public void checkLineBackslash(CreateBoard3x3 createBoard3x3, UserGetName userGetName) {
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

    public void checkWin(UserGetName userGetName) {
        text = userGetName.getText();
        if (countX == 3) {
            System.out.println("\n" + text.userWin() + userGetName.getFirstUserName() + "\n");
            endGame = true;
        }
        if (countO == 3) {
            System.out.println("\n" + text.userWin()  + userGetName.getSecondUserName() + "\n");
            endGame = true;
        }
    }

    public boolean isEndGame() {
        return endGame;
    }
}
