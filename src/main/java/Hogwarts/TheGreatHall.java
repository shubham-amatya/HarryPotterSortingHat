package Hogwarts;

import Utilities.Console;

import java.io.IOException;

public class TheGreatHall {
    private static TheChamberOfSecrets chamberOfSecrets = new TheChamberOfSecrets(new Console(System.in, System.out));
    private static Hat hat = new Hat(new Console(System.in, System.out));
    private static Calculation c = new Calculation(new Console(System.in, System.out));

    public TheGreatHall() {
        this.hat = hat;
    }

    public static void main(String[] args) throws IOException {
        chamberOfSecrets.welcomeArt();
        hat.getQuestions();
        chamberOfSecrets.waitArt();
        c.makeDecision(hat.getCounter());
    }
}
