package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    MorseInterpreter sut = new MorseInterpreter();

    @Test
    public void interpretToLetterA() {
        String result = sut.interpretFromMorseCode("*-");

        Assertions.assertEquals("A", result);
    }

    @Test
    public void interpretFromLetterA() {
        String result = sut.interpretToMorseCode("A");

        Assertions.assertEquals("*-", result);
    }

    @Test
    public void interpretFromSemicolon() {
        String result = sut.interpretFromMorseCode(";");

        Assertions.assertEquals(" ", result);
    }

    @Test
    public void interpretToSemicolon() {
        String result = sut.interpretToMorseCode(" ");

        Assertions.assertEquals(";", result);
    }

    @Test
    public void interpretSequenceToMorseCode() {
        String result = sut.interpretToMorseCode("HEJ");

        Assertions.assertEquals("**** * *---", result);
    }

    @Test
    public void interpretTwoWordSequenceToMorseCode() {
        String result = sut.interpretToMorseCode("HEJ HEJ");

        Assertions.assertEquals("**** * *--- ; **** * *---", result);
    }

    @Test
    public void interpretSequenceFromMorseCode() {
        String result = sut.interpretFromMorseCode("**** * *---");

        Assertions.assertEquals("HEJ", result);
    }

    @Test
    public void interpretTwoWordSequenceFromMorseCode() {
        String result = sut.interpretFromMorseCode("**** * *--- ; **** * *---");

        Assertions.assertEquals("HEJ HEJ", result);
    }
}
