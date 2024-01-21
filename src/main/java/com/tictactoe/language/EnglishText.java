package com.tictactoe.language;

public class EnglishText implements LanguageText {

    @Override
    public void userGetNameFirstGamer() {
        System.out.print("Player no. 1, give your name: ");
    }

    @Override
    public void choicePvPOrPvE() {
        System.out.print("If you want to play with computer, press ENTER. If you are a player, enter your name:");
    }

    @Override
    public void hello(String firstUserName, String secondUserName) {
        System.out.println("Hello " + firstUserName + " , " + secondUserName + "\n");
    }

    @Override
    public void hello(String firstUserName) {
        System.out.println("Hello " + firstUserName + "\n");
    }

    @Override
    public String fieldSelectionRow() {
        return " enter the coordinates, first number horizontally → : ";
    }

    @Override
    public String fieldSelectionColumn() {
        return " second number vertically ↓ : ";
    }

    @Override
    public String userWin() {
        return " Won ";
    }

    @Override
    public void incorrectCoordinates() {
        System.out.print("Incorrect coordinates, please enter again, first number horizontally → : ");
    }

    @Override
    public void fieldOccupied() {
        System.out.print("Select another field - it is already taken, enter the coordinates again, first number horizontally → : ");
    }

    @Override
    public String draw() {
        return "   DRAW";
    }

    @Override
    public String computer() {
        return " computer";
    }

    @Override
    public void typeOfGame() {
        System.out.print("Game selection : ");
    }

    @Override
    public void badChoice() {
        System.out.print("Bad choice: ");
    }
}
