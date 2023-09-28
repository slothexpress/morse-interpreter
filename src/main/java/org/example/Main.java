package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {

            String result = "";
            MorseInterpreter morse = new MorseInterpreter();
            Scanner scan = new Scanner(System.in);
            int number;

            while(true) {
                System.out.print("\n---- SELECT MODE OF INTERPETATION ---- \n1 = TO MORSE CODE, 2 = FROM MORSE CODE. \n\nYOUR CHOCE: ");
                String choice = scan.nextLine();

                try {
                    number = Integer.parseInt(choice);

                    if(number == 1 || number == 2) {
                        break;
                    } else {
                        System.out.println("\nInvalid option. Please try again!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input! Please enter a number.");
                }
            }

            System.out.println("\nENTER SEQUENCE TO TRANSLATE: ");
            String input = scan.nextLine();

            switch (number) {
                case 1: result = morse.interpretToMorseCode(input);
                    break;
                case 2: result = morse.interpretFromMorseCode(input);
                    break;
            }

            if(!result.isEmpty()) {
                System.out.println("Done! Translation: " + result);
            }

        }
    }
}