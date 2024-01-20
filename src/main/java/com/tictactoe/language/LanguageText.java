package com.tictactoe.language;

public interface LanguageText {

    void userGetNameFirstGamer();
    void hello(String firstUserName, String secondUserName);
    void hello(String firstUserName);
    String fieldSelection();
    String userWin();
    void incorrectCoordinates();
    void fieldOccupied();
    String draw();
    void choicePvPOrPvE();
    String computer();



}