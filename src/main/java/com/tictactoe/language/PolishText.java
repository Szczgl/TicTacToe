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
    public String fieldSelectionRow() {
        return " podaj współrzędne pierwsza liczba poziomo → : ";
    }

    @Override
    public String fieldSelectionColumn() {
        return " druga pionowo ↓ : ";
    }

    @Override
    public String userWin() {
        return " Wygrał ";
    }

    @Override
    public void incorrectCoordinates() {
        System.out.print("Nieprawidłowe współrzędne, podaj ponownie, liczba poziomo → : ");
    }

    @Override
    public void fieldOccupied() {
        System.out.print("Wybierz inne pole to już jest zajęte, podaj ponownie współrzędne, liczba poziomo → : ");
    }

    @Override
    public String draw() {
        return "  REMIS";
    }

    @Override
    public String computer() {
        return "komputer";
    }

    @Override
    public void typeOfGame() {
        System.out.print("Wybierz typ gry: ");
    }

    @Override
    public void badChoice() {
        System.out.print("Zły wybór: ");
    }

}
