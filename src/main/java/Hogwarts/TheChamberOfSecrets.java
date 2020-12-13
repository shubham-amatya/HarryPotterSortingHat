package Hogwarts;

import Utilities.Console;

public class TheChamberOfSecrets {
    Console console;

    public TheChamberOfSecrets(Console console){
        this.console = console;
    }

   /* public TheChamberOfSecrets() {

    }*/

    public void welcomeArt(){
        String art = ("                                         _ __\n" +
                "        ___                             | '  \\\n" +
                "   ___  \\ /  ___         ,'\\_           | .-. \\        /|\n" +
                "   \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|\n" +
                " _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _\n" +
                "// | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_\n" +
                "\\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\\n" +
                " `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|\n" +
                "   | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |\n" +
                "   | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |\n" +
                "   /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |\n" +
                "        /_\\           `------'        \\ |             `.\\  | |  `._,' /_\\\n" +
                "                                       \\|                    `.\\");

        console.println(art);
        console.print("\n\nWelcome to Hogwarts School of Witchcraft and Wizardry\n\n" +
                "You will be sorted in your respective houses\n\n" +
                "ANSWER THESE QUESTIONS TO THE BEST OF YOUR ABILITIES\n\n");
    }


    public void waitArt(){
        String art = ("          /////\\\\,\n" +
                "       ,///////\\\\\\\\\\\n" +
                "     ,//////   > \\\\\\\\\n" +
                "     ////  __ `   _\\\\\n" +
                "     //__//  \\--//  \\\n" +
                "     /'--\\\\_O/  \\\\_O/\n" +
                "     \\_         \\   |\n" +
                "       \\      ,__>  /\n" +
                "       |\\   ,____  /\n" +
                "       | \\   \\__| /\n" +
                "       |  '._____/\n" +
                "       |      |\n" +
                "     /``\"--._ \\/`\\\n" +
                "    /        \\|  /`--.\n" +
                "   /```\"\"--..__;.'     `\\");
        String message = "CONGRATULATIONS!!! You belong to...";
        console.println(art +"\n\n\n" + message);
    }





}
