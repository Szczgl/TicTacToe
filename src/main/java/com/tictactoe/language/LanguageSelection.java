package com.tictactoe.language;

import com.tictactoe.language.EnglishText;
import com.tictactoe.language.LanguageText;
import com.tictactoe.language.PolishText;

import java.util.Scanner;

public class LanguageSelection {

    Scanner scanner = new Scanner(System.in);
    LanguageText text;

    public LanguageText chooseLanguage() {
        System.out.println("\n1 - Polski");
        System.out.println("2 - English\n");
        System.out.print("Wybierz język // Choose language : ");
        String languageChoose = scanner.nextLine();
        switch (languageChoose) {
            case "1" :
                text = new PolishText();
                break;
            case "2" :
                text = new EnglishText();
                break;
            default:
                System.out.println("zły wybór // bad choice");
                chooseLanguage();
        }

        return text;
    }
}
