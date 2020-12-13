package Utilities;

import java.io.*;

public final class Console {

    private final PrintStream output;
    BufferedReader bufferedreader = new BufferedReader(
            new InputStreamReader(System.in));

    public Console(InputStream in, PrintStream out) {

        this.output = out;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) throws IOException {
        println(prompt, args);
        String input = bufferedreader.readLine();
        try {

            String nameInput = input;
            for (int i = 0; i < nameInput.length(); i++) {
                if (Character.isLetter(nameInput.charAt(i))) {
                    continue;
                } else {
                    println("Snape won't be too pleased! Enter your answer, NOW! ");
                    input = bufferedreader.readLine();
                }
            }
        } catch (IOException e) {
            println("Choose wisely, muggle!");
        }

        return input;
    }


    public Integer getIntegerInput() throws IOException {
      String stringInput = bufferedreader.readLine();

        try {
            Integer integerInput = Integer.parseInt(stringInput);
            return integerInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
            return getIntegerInput();
        }
    }

    }



