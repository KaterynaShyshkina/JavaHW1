package com.homework1;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    private static final String EXPECTED_FIRST_WORD = "Hello";
    private static final String EXPECTED_SECOND_WORD = "world";

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void buildHelloWorld() {
        Scanner scanner = new Scanner(System.in);
        model.setValue(verifyInput(scanner, View.FIRST_WORD_MESSAGE, EXPECTED_FIRST_WORD));
        String firstWord = model.getValue();
        model.setValue(verifyInput(scanner, View.SECOND_WORD_MESSAGE, EXPECTED_SECOND_WORD));
        String secondWord = model.getValue();
        view.showFinalString(firstWord, secondWord);
    }

    public String verifyInput(Scanner scanner, String message, String expectedWord) {
        view.showMessage(message);
        while(!scanner.hasNext(expectedWord)) {
            view.showMessage(View.WRONG_INPUT_MESSAGE + message);
            scanner.next();
        }
        return scanner.next();
    }
}
