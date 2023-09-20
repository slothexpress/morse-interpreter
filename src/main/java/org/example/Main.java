package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String result = "";
        MorseInterpreter morse = new MorseInterpreter();
        Scanner scan = new Scanner(System.in);
        int number;

        while(true) {
            System.out.println("\nSELECT YOUR CHOICE OF INTERPETATION: 1 = TO MORSE CODE, 2 = FROM MORSE CODE");
            String choice = scan.nextLine();

            try {
                number = Integer.parseInt(choice);

                if(number == 1 || number == 2) {
                    break;
                } else {
                    System.out.println("ONLY 1 or 2 IS A VALID CHOICE! PLEASE TRY CHOOSE AGAIN.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        System.out.println("ENTER SEQUENCE TO TRANSLATE: ");
        String input = scan.nextLine();

        switch (number) {
            case 1: result = morse.interpretToMorseCode(input);
                break;
            case 2: result = morse.interpretFromMorseCode(input);
                break;
        }

        System.out.println(result);
    }
}