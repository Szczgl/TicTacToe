package com.tictactoe.language;

public class PolishText implements LanguageText {

    @Override
    public void userGetNameFirstGamer()  {
        System.out.print("Graczu nr 1 podaj imie : ");
    }

    @Override
    public void userGetNameSecondGamer() {
        System.out.print("Graczu nr 2 podaj imie : ");
    }

    @Override
    public void hello(String firstUserName, String secondUserName) {
        System.out.println("Witajcie " + firstUserName + " , " + secondUserName);
    }
}
