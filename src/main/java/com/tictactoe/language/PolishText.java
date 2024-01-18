package com.tictactoe.language;

public class PolishText implements LanguageText {

    @Override
    public void userGetNameFirstGamer()  {
        System.out.print("Graczu nr 1 podaj imie: ");
    }

    @Override
    public void userGetNameSecondGamer() {
        System.out.print("Graczu nr 2 podaj imie: ");
    }

    @Override
    public void hello(String firstUserName, String secondUserName) {
        System.out.println("Witajcie " + firstUserName + " , " + secondUserName + "\n");
    }

    @Override
    public String fieldSelection() {
        return " podaj współrzędne pierwsza liczba poziomo →, druga pionowo ↓ (np 11 lub 23): ";
    }

    @Override
    public String userWin() {
        return " Wygrał gracz: ";
    }

    @Override
    public void incorrectCoordinates() {
        System.out.print("Nieprawidłowe współrzędne, podaj ponownie: ");
    }

    @Override
    public void fieldOccupied() {
        System.out.print("Wybierz inne pole to już jest zajęte, podaj ponownie współrzędne: ");
    }

    @Override
    public String draw() {
        return "  REMIS";
    }
}
