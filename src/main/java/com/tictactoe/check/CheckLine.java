package com.tictactoe.check;

import com.tictactoe.board.CreateBoard;
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

    public void checkLineAll(CreateBoard createBoard, UserGetName userGetName) {
        checkLineCol(createBoard, userGetName);
        checkLineRow(createBoard, userGetName);
        checkLineSlash(createBoard, userGetName);
        checkLineBackslash(createBoard, userGetName);

    }

    public void checkLineCol(CreateBoard createBoard, UserGetName userGetName) {
        countDownCheckList = createBoard.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            for (int i = 0; i < createBoard.getBoardSize(); i++) {
                if (createBoard.getBoard()[i][countDownCheckList].equals("X")) {
                    countX++;
                    checkWin(userGetName);
                }
                if (createBoard.getBoard()[i][countDownCheckList].equals("O")) {
                    countO++;
                    checkWin(userGetName);
                }
            }
            countDownCheckList--;
        }
    }

    public void checkLineRow(CreateBoard createBoard, UserGetName userGetName) {
        countDownCheckList = createBoard.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            for (int i = 0; i < createBoard.getBoardSize(); i++) {
                if (createBoard.getBoard()[countDownCheckList][i].equals("X")) {
                    countX++;
                    checkWin(userGetName);
                }
                if (createBoard.getBoard()[countDownCheckList][i].equals("O")) {
                    countO++;
                    checkWin(userGetName);
                }
            }
            countDownCheckList--;
        }
    }

    public void checkLineSlash(CreateBoard createBoard, UserGetName userGetName) {
        countX = 0;
        countO = 0;
        for (int i = 0; i < createBoard.getBoardSize(); i++) {
            if (createBoard.getBoard()[i][i].equals("X")) {
                countX++;
                checkWin(userGetName);
            }
            if (createBoard.getBoard()[i][i].equals("O")) {
                countO++;
                checkWin(userGetName);
            }
        }
    }

    public void checkLineBackslash(CreateBoard createBoard, UserGetName userGetName) {
        countX = 0;
        countO = 0;
        countDownCheckList = createBoard.getBoardSize() - 1;
        for (int i = 0; i < createBoard.getBoardSize(); i++) {
            if (createBoard.getBoard()[i][countDownCheckList].equals("X")) {
                countX++;
                checkWin(userGetName);
            }
            if (createBoard.getBoard()[i][countDownCheckList].equals("O")) {
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
