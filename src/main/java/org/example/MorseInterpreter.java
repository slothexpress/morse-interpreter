package org.example;

public class MorseInterpreter {
    public String interpret(String s) {
        if(s.equals("*-")) {
            return "A";
        } else if (s.equals("A")) {
            return "*-";
        }
        return "test";
    }
}
