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
    public void interpretFromLetterZ() {
        String result = sut.interpretToMorseCode("Z");

        Assertions.assertEquals("--**", result);
    }

    @Test
    public void interpretSemicolon() {
        String result = sut.interpretFromMorseCode(";");

        Assertions.assertEquals(" ", result);
    }

    @Test
    public void interpretSequenceToMorseCode() {
        String result = sut.interpretToMorseCode("HEJ");

        Assertions.assertEquals("**** * *---", result);
    }
}
