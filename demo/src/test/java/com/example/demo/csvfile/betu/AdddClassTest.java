package com.example.demo.csvfile.betu;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdddClassTest {

    private AdddClass adddClass = new AdddClass();

    @Before
    public void setUp() throws Exception {
        adddClass = new AdddClass();
    }

    @Test
    void add() {
        System.out.println("caaling add to validate add() >>");
        int result = adddClass.add(10, 20);

        assertEquals(result, 30);
    }

    @Test
    void add1() {
        System.out.println("caaling add to validate add() >>");
        int result = adddClass.add(10, 20);

        assertEquals(result, 10);
    }
}