package com;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RunnerTest {

    @Test
    public void printName() {
        Runner.printName("ab");
    }


    @Test
    @DisplayName("split without whitespaces")
    void split3() {
        List<String> strings = Runner.splitTest("a,b,c");
        assertEquals(strings.get(0), "a");
        assertEquals(strings.get(1), "b");
        assertEquals(strings.get(2), "c");
        assertAll("all",
                () -> assertEquals(strings.get(1), "b"),
                () -> assertEquals(strings.get(2), "c"));
    }

    @Test
    @DisplayName("split null")
    void splitNull() {
        List<String> strings = Runner.splitTest(null);
        assertTrue(strings.isEmpty());

    }
}