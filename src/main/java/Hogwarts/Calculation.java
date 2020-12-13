package Hogwarts;

import Utilities.Console;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Calculation extends Hat{
    Houses houses;
    Console console = new Console(System.in, System.out);


    public Calculation(Console console) {
        super(console);
    }



    public Houses makeDecision(Integer counter){
         Houses result;
        if(counter<=10){
            result = Houses.HUFFLEPUFF;
            console.println(result.toString());
        }else if(counter>10 && getCounter()<=15){
            result = Houses.RAVENCLAW;
            console.println(result.toString());
        }else if(counter>15 && getCounter()<=28){
            result = Houses.SLYTHERIN;
            console.println(result.toString());
        }else{
            result = Houses.GRYFFINDOR;
            console.println(result.toString());
        }

        return result;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "houses=" + houses +
                ", console=" + console +
                '}';
    }
}
