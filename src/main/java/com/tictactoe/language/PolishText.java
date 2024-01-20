package com.tictactoe.language;

public class PolishText implements LanguageText {

    @Override
    public void userGetNameFirstGamer()  {
        System.out.print("Graczu nr 1 podaj imie: ");
    }

    @Override
    public void choicePvPOrPvE() {
        System.out.print("Jeśli chcesz grać z komputerem naciśnij ENTER. Jak jesteś graczem wpisz swoje imię: ");
    }

    @Override
    public void hello(String firstUserName, String secondUserName) {
        System.out.println("Witajcie " + firstUserName + " , " + secondUserName + "\n");
    }

    @Override
    public void hello(String firstUserName) {
        System.out.println("Witaj " + firstUserName + "\n");
    }

    @Override
    public String fieldSelection() {
        return " podaj współrzędne pierwsza liczba poziomo →, druga pionowo ↓ (np 11 lub 23): ";
    }

    @Override
    public String userWin() {
        return " Wygrał ";
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

    @Override
    public String computer() {
        return "komputer";
    }
}
