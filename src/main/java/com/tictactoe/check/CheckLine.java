package com.tictactoe.check;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;

public class CheckLine {

    private int countX;
    private int countO;

    private int countDownCheckList;
    public boolean endGame = false;

    LanguageText text;


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
            if (createBoard.getBoardSize() == 10) {
                for (int i = 0; i < createBoard.getBoardSize(); i++) {
                    if (createBoard.getBoard()[i][countDownCheckList].equals("X")) {
                        countX++;
                        if (countX == 5) {
                            checkWin(userGetName);
                            countX = 0;
                            break;
                        }
                        countO = 0;
                    } else if (createBoard.getBoard()[i][countDownCheckList].equals("O")) {
                        countO++;
                        if (countO == 5) {
                            checkWin(userGetName);
                            countO = 0;
                            break;
                        }
                        countX = 0;
                    } else {
                        countX = 0;
                        countO = 0;
                    }
                }
                countDownCheckList--;
            } else if (createBoard.getBoardSize() == 3) {
                for (int i = 0; i < createBoard.getBoardSize(); i++) {
                    if (createBoard.getBoard()[i][countDownCheckList].equals("X")) {
                        countX++;
                        if (countX == 3) {
                            checkWin(userGetName);
                            countX = 0;
                            break;
                        }
                        countO = 0;
                    } else if (createBoard.getBoard()[i][countDownCheckList].equals("O")) {
                        countO++;
                        if (countO == 3) {
                            checkWin(userGetName);
                            countO = 0;
                            break;
                        }
                        countX = 0;
                    } else {
                        countX = 0;
                        countO = 0;
                    }
                }
                countDownCheckList--;
            }
        }
    }

    public void checkLineRow(CreateBoard createBoard, UserGetName userGetName) {
        countDownCheckList = createBoard.getBoardSize() - 1;
        while (countDownCheckList >= 0) {
            countX = 0;
            countO = 0;
            if (createBoard.getBoardSize() == 10) {
                for (int i = 0; i < createBoard.getBoardSize(); i++) {
                    if (createBoard.getBoard()[countDownCheckList][i].equals("X")) {
                        countX++;
                        if (countX == 5) {
                            checkWin(userGetName);
                            countX = 0;
                            break;
                        }
                        countO = 0;
                    } else if (createBoard.getBoard()[countDownCheckList][i].equals("O")) {
                        countO++;
                        if (countO == 5) {
                            checkWin(userGetName);
                            countO = 0;
                            break;
                        }
                        countX = 0;
                    } else {
                        countX = 0;
                        countO = 0;
                    }
                }
                countDownCheckList--;
            } else if (createBoard.getBoardSize() == 3) {
                for (int i = 0; i < createBoard.getBoardSize(); i++) {
                    if (createBoard.getBoard()[countDownCheckList][i].equals("X")) {
                        countX++;
                        if (countX == 3) {
                            checkWin(userGetName);
                            countX = 0;
                            break;
                        }
                        countO = 0;
                    } else if (createBoard.getBoard()[countDownCheckList][i].equals("O")) {
                        countO++;
                        if (countO == 3) {
                            checkWin(userGetName);
                            countO = 0;
                            break;
                        }
                        countX = 0;
                    } else {
                        countX = 0;
                        countO = 0;
                    }
                }
                countDownCheckList--;
            }
        }
    }

    public void checkLineSlash(CreateBoard createBoard, UserGetName userGetName) {
        if (createBoard.getBoardSize() == 10) {
            for (int i = 0; i < createBoard.getBoardSize() - 5; i++) {
                for (int j = 0; j < createBoard.getBoardSize() - 5; j++) {
                    countX = 0;
                    countO = 0;
                    for (int k = 0; k < 5; k++) {
                        if (createBoard.getBoard()[i + k][j + k].equals("X")) {
                            countX++;
                            if (countX == 5) {
                                checkWin(userGetName);
                                countX = 0;
                                break;
                            }
                            countO = 0;
                        } else if (createBoard.getBoard()[i + k][j + k].equals("O")) {
                            countO++;
                            if (countO == 5) {
                                checkWin(userGetName);
                                countO = 0;
                                break;
                            }
                            countX = 0;
                        } else {
                            countX = 0;
                            countO = 0;
                        }
                    }
                }
            }
        } else if (createBoard.getBoardSize() == 3) {
            for (int i = 0; i < createBoard.getBoardSize(); i++) {
                if (createBoard.getBoard()[i][i].equals("X")) {
                    countX++;
                    if (countX == 3) {
                        checkWin(userGetName);
                        countX = 0;
                        break;
                    }
                    countO = 0;
                } else if (createBoard.getBoard()[i][i].equals("O")) {
                    countO++;
                    if (countO == 3) {
                        checkWin(userGetName);
                        countO = 0;
                        break;
                    }
                    countX = 0;
                } else {
                    countX = 0;
                    countO = 0;
                }
            }
        }
    }

    public void checkLineBackslash(CreateBoard createBoard, UserGetName userGetName) {
        if (createBoard.getBoardSize() == 10) {
            for (int i = 0; i <= createBoard.getBoardSize() - 5; i++) {
                for (int j = createBoard.getBoardSize() - 1; j >= 4; j--) {
                    countX = 0;
                    countO = 0;
                    for (int k = 0; k < 5; k++) {
                        if (createBoard.getBoard()[i + k][j - k].equals("X")) {
                            countX++;
                            if (countX == 5) {
                                checkWin(userGetName);
                                countX = 0;
                                break;
                            }
                            countO = 0;
                        } else if (createBoard.getBoard()[i + k][j - k].equals("O")) {
                            countO++;
                            if (countO == 5) {
                                checkWin(userGetName);
                                countO = 0;
                                break;
                            }
                            countX = 0;
                        } else {
                            countX = 0;
                            countO = 0;
                        }
                    }
                }
            }
        } else if (createBoard.getBoardSize() == 3) {
            countDownCheckList = createBoard.getBoardSize() - 1;
            for (int i = 0; i < createBoard.getBoardSize(); i++) {
                if (createBoard.getBoard()[i][countDownCheckList].equals("X")) {
                    countX++;
                    if (countX == 3) {
                        checkWin(userGetName);
                        countX = 0;
                        break;
                    }
                    countO = 0;
                } else if (createBoard.getBoard()[i][countDownCheckList].equals("O")) {
                    countO++;
                    if (countO == 3) {
                        checkWin(userGetName);
                        countO = 0;
                        break;
                    }
                    countX = 0;
                } else {
                    countX = 0;
                    countO = 0;
                }
                countDownCheckList--;
            }
        }
    }

    public void checkWin(UserGetName userGetName) {
        text = userGetName.getText();
        if (countX == 3 || countX == 5) {
            System.out.println("\n" + text.userWin() + userGetName.getFirstUserName() + "\n");
            endGame = true;
        }
        if (countO == 3 || countO == 5) {
            System.out.println("\n" + text.userWin()  + userGetName.getSecondUserName() + "\n");
            endGame = true;
        }
    }

    public boolean isEndGame() {
        return endGame;
    }
}
