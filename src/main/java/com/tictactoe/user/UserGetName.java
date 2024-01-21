package com.tictactoe.user;


import com.tictactoe.language.LanguageSelection;
import com.tictactoe.language.LanguageText;

import java.util.Scanner;

public class UserGetName {

    Scanner scanner = new Scanner(System.in);
    LanguageSelection languageSelection = new LanguageSelection();
    LanguageText text;
    private String firstUserName;
    private String secondUserName;

    public void setLanguageText(LanguageText text) {
        this.text = text;
    }



    public void getName() {
        setLanguageText(languageSelection.chooseLanguage());
        System.out.println();
        text.userGetNameFirstGamer();
        firstUserName = scanner.nextLine();
        text.choicePvPOrPvE();
        secondUserName = scanner.nextLine();
        if (!secondUserName.isEmpty()) {
            System.out.println();
            text.hello(firstUserName, secondUserName);
        } else {
            System.out.println();
            text.hello(firstUserName);
        }
    }

    public String getFirstUserName() {
        return firstUserName;
    }

    public String getSecondUserName() {
        return secondUserName;
    }

    public LanguageText getText() {
        return text;
    }

    public void setSecondUserName(String secondUserName) {
        this.secondUserName = secondUserName;
    }
}
