package Hogwarts;

import Utilities.Console;

import java.io.IOException;

public class QuestionBank {
    private Console console;
    private Integer counter = 0;

    public QuestionBank(Console console) {
        this.console = console;
    }


    public Integer dawnOrDusk() throws IOException {

        String choice1 = console.getStringInput("**     Dawn or dusk ??    **");
        while (!(choice1.equalsIgnoreCase("dawn") || choice1.equalsIgnoreCase("dusk"))) {
            console.print("Clever eh, Dumbledo!");
            choice1 = console.getStringInput(" TRY AGAIN!");
        }
        if (choice1.equalsIgnoreCase("Dawn")) {
            counter = 10;
        } else {
            counter = 7;
        }
        return counter;
    }

    public Integer forestOrRiver() throws IOException {
        //counter += dawnOrDusk();
        String choice1 = console.getStringInput("**    Forest or river?    **?");
        while (!(choice1.equalsIgnoreCase("forest") || choice1.equalsIgnoreCase("river"))) {
            console.print("Interesting, trying to be smart are you!!? I can read your mind, mere mortal. Try again!");
            choice1 = console.getStringInput(" TRY AGAIN!");
        }
        if (choice1.equalsIgnoreCase("Forest")) {
            counter += 4;
        } else {
            counter += 13;
        }
        return counter;
    }

    public Integer getSoulScore() throws IOException {
       // counter += forestOrRiver();
        console.println("\nWhich trait do you value the most? \n" +
                "Press 1 for Loyalty\n" +
                "Press 2 for Curiosity\n" +
                "Press 3 for Zest\n" +
                "Press 4 for Charisma");
        int choice = console.getIntegerInput();

        switch (choice) {
            case 1:
                console.println("hmm...interesting");
                counter += 1;
                break;
            case 2:
                console.println("CURIOUS...very curious!!");
                counter +=  3;
                break;
            case 3:
                console.println("I wonder...");
                counter +=  5;
                break;
            case 4:
                console.println("Indeed...!");
                counter +=  7;
                break;

            default:
                console.print("Invalid choice. Choose wisely, you don't want to end up in the dark forest...!\n ");
                return getSoulScore();

        }
        return counter;
    }

    public Integer flameColor() throws IOException {
       // counter += getSoulScore();
        String choice1 = console.getStringInput("What is the color of fire?");
        if(choice1.length() <= 3){
            counter = counter+5;
        } else if(choice1.length() >=4){
            counter = counter +3;
        }
        return counter;
    }

    public Integer getCounter() {
        return counter;
    }

    public Integer regexCalculation() throws IOException {
        String choice = console.getStringInput("**    What is your W.I.Z.A.R.D name?   **");
        String regEx = "\\^[Q-T]";
        if(choice.matches(regEx)){
            counter = counter +13;
        } else{
            counter = counter + 3;
        }
        return counter;
    }

}
