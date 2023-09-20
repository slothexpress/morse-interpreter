package org.example;

import java.util.HashMap;

public class MorseInterpreter {

    HashMap<String, String> toMorseCodeMap;
    HashMap<String, String> fromMorseCodeMap;

    public MorseInterpreter() {
        toMorseCodeMap = new HashMap<>();
        fromMorseCodeMap = new HashMap<>();
        initializeToMorseCodeMap();
        initializeFromMorseCodeMap();
    }

    public String interpretToMorseCode(String s) {
        StringBuilder sb = new StringBuilder();
        char[] letters = s.toCharArray();
        for (char l : letters) {
            String letter = String.valueOf(l);
            String result = toMorseCodeMap.get(letter);

            sb.append(result);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public String interpretFromMorseCode(String s) {
        return fromMorseCodeMap.get(s);
    }

    public void initializeToMorseCodeMap() {
        toMorseCodeMap.put("A", "*-");
        toMorseCodeMap.put("B", "-***");
        toMorseCodeMap.put("C", "-*-*");
        toMorseCodeMap.put("D", "-**");
        toMorseCodeMap.put("E", "*");
        toMorseCodeMap.put("F", "**-*");
        toMorseCodeMap.put("G", "--*");
        toMorseCodeMap.put("H", "****");
        toMorseCodeMap.put("I", "**");
        toMorseCodeMap.put("J", "*---");
        toMorseCodeMap.put("K", "-*-");
        toMorseCodeMap.put("L", "*-**");
        toMorseCodeMap.put("M", "--");
        toMorseCodeMap.put("N", "-*");
        toMorseCodeMap.put("O", "---");
        toMorseCodeMap.put("P", "*--*");
        toMorseCodeMap.put("Q", "--*-");
        toMorseCodeMap.put("R", "*-*");
        toMorseCodeMap.put("S", "***");
        toMorseCodeMap.put("T", "-");
        toMorseCodeMap.put("U", "**-");
        toMorseCodeMap.put("V", "***-");
        toMorseCodeMap.put("W", "*--");
        toMorseCodeMap.put("X", "-**-");
        toMorseCodeMap.put("Y", "-*--");
        toMorseCodeMap.put("Z", "--**");

        toMorseCodeMap.put("0", "-----");
        toMorseCodeMap.put("1", "*----");
        toMorseCodeMap.put("2", "**---");
        toMorseCodeMap.put("3", "***--");
        toMorseCodeMap.put("4", "****-");
        toMorseCodeMap.put("5", "*****");
        toMorseCodeMap.put("6", "-****");
        toMorseCodeMap.put("7", "--***");
        toMorseCodeMap.put("8", "---**");
        toMorseCodeMap.put("9", "----*");

        toMorseCodeMap.put(".", "*-*-*-*");
        toMorseCodeMap.put(",", "--**--");
        toMorseCodeMap.put("?", "**--**");

        toMorseCodeMap.put(" ", ";");
    }

    public void initializeFromMorseCodeMap() {
        fromMorseCodeMap.put("*-", "A");
        fromMorseCodeMap.put("-***", "B");
        fromMorseCodeMap.put("-*-*", "C");
        fromMorseCodeMap.put("-**", "D");
        fromMorseCodeMap.put("*", "E");
        fromMorseCodeMap.put("**-*", "F");
        fromMorseCodeMap.put("--*", "G");
        fromMorseCodeMap.put("****", "H");
        fromMorseCodeMap.put("**", "I");
        fromMorseCodeMap.put("*---", "J");
        fromMorseCodeMap.put("-*-", "K");
        fromMorseCodeMap.put("*-**", "L");
        fromMorseCodeMap.put("--", "M");
        fromMorseCodeMap.put("-*", "N");
        fromMorseCodeMap.put("---", "O");
        fromMorseCodeMap.put("*--*", "P");
        fromMorseCodeMap.put("--*-", "Q");
        fromMorseCodeMap.put("*-*", "R");
        fromMorseCodeMap.put("***", "S");
        fromMorseCodeMap.put("-", "T");
        fromMorseCodeMap.put("**-", "U");
        fromMorseCodeMap.put("***-", "V");
        fromMorseCodeMap.put("*--", "W");
        fromMorseCodeMap.put("-**-", "X");
        fromMorseCodeMap.put("-*--", "Y");
        fromMorseCodeMap.put("--**", "Z");

        fromMorseCodeMap.put("-----", "0");
        fromMorseCodeMap.put("*----", "1");
        fromMorseCodeMap.put("**---", "2");
        fromMorseCodeMap.put("***--", "3");
        fromMorseCodeMap.put("****-", "4");
        fromMorseCodeMap.put("*****", "5");
        fromMorseCodeMap.put("-****", "6");
        fromMorseCodeMap.put("--***", "7");
        fromMorseCodeMap.put("---**", "8");
        fromMorseCodeMap.put("----*", "9");

        fromMorseCodeMap.put("*-*-*-*", ".");
        fromMorseCodeMap.put("--**--", ",");
        fromMorseCodeMap.put("**--**", "?");

        fromMorseCodeMap.put(";", " ");
    }

}
