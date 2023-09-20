package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    MorseInterpreter sut = new MorseInterpreter();

    @Test
    public void interpretFromLetterA() {
        String result = sut.interpret("*-");

        Assertions.assertEquals("A", result);
    }

    @Test
    public void interpretToLetterA() {
        String result = sut.interpret("A");

        Assertions.assertEquals("*-", result);
    }
}
