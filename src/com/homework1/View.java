package com.homework1;

public class View {
    public static final String FIRST_WORD_MESSAGE = "Enter \"Hello\"";
    public static final String SECOND_WORD_MESSAGE = "Enter \"world\"";
    public static final String WRONG_INPUT_MESSAGE = "Your input is wrong! ";

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showFinalString(String firstWord, String secondWord) {
        System.out.println(firstWord + ", " + secondWord + "!");
    }
}
