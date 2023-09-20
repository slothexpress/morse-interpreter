package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String result = "";
        MorseInterpreter morse = new MorseInterpreter();

        System.out.println("SELECT YOUR CHOICE OF INTERPETATION. 1 = TO MORSE CODE, 2 = FROM MORSE CODE");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        scan.nextLine(); // Consume the newline character and clear scanner input

        System.out.println("ENTER SEQUENCE TO TRANSLATE: ");
        String input = scan.nextLine();

        switch (option) {
            case 1: result = morse.interpretToMorseCode(input);
                break;
            case 2: result = morse.interpretFromMorseCode(input);
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }

        System.out.println(result);
    }
}