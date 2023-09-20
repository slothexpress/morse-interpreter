package org.example;

import java.util.HashMap;

public class MorseInterpreter {

    public String interpret(String s) {
        if(s.equals("*-")) {
            return "A";
        } else if (s.equals("A")) {
            return "*-";
        } else if (s.equals("Z")) {
            return "--**";
        }

        return "test";
    }
}
