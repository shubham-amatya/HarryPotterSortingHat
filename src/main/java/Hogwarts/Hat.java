package Hogwarts;

import Utilities.Console;

import java.io.IOException;


public class Hat extends QuestionBank{

    public Hat(Console console) {
        super(console);
    }

    public void getQuestions() throws IOException {
        dawnOrDusk();
        forestOrRiver();
        getSoulScore();
        flameColor();
        regexCalculation();
    }
}
