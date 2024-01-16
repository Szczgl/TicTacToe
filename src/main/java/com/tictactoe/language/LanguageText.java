package com.tictactoe.language;

public interface LanguageText {

    void userGetNameFirstGamer();
    void userGetNameSecondGamer();
    void hello(String firstUserName, String secondUserName);
    String fieldSelection();
    String userWin();
    void incorrectCoordinates();
    void fieldOccupied();


}