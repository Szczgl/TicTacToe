package com.tictactoe.language;

public class EnglishText implements LanguageText {

    @Override
    public void userGetNameFirstGamer() {
        System.out.print("Player no. 1, give your name : ");
    }

    @Override
    public void userGetNameSecondGamer() {
        System.out.print("Player no. 2, give your name : ");
    }

    @Override
    public void hello(String firstUserName, String secondUserName) {
        System.out.println("Hello " + firstUserName + " , " + secondUserName);
    }
}
