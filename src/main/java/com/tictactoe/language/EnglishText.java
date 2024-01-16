package com.tictactoe.language;

public class EnglishText implements LanguageText {

    @Override
    public void userGetNameFirstGamer() {
        System.out.print("Player no. 1, give your name: ");
    }

    @Override
    public void userGetNameSecondGamer() {
        System.out.print("Player no. 2, give your name: ");
    }

    @Override
    public void hello(String firstUserName, String secondUserName) {
        System.out.println("Hello " + firstUserName + " , " + secondUserName + "\n");
    }

    @Override
    public String fieldSelection() {
        return " enter the coordinates, first number horizontally →, second number vertically ↓ (e.g. 11 or 23): ";
    }

    @Override
    public String userWin() {
        return " The player won: ";
    }

    @Override
    public void incorrectCoordinates() {
        System.out.print("Incorrect coordinates, please enter again: ");
    }

    @Override
    public void fieldOccupied() {
        System.out.print("Select another field - it is already taken, enter the coordinates again: ");
    }
}
