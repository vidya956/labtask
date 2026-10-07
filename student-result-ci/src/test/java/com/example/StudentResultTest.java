package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentResultTest {

    @Test
    public void testCalculateTotal() {
        StudentResult student = new StudentResult();
        assertEquals(240, student.calculateTotal(80, 70, 90));
    }

    @Test
    public void testCalculateAverage() {
        StudentResult student = new StudentResult();
        assertEquals(80.0, student.calculateAverage(80, 80, 80), 0.01);
    }

    @Test
    public void testGetResultPass() {
        StudentResult student = new StudentResult();
        assertEquals("Pass", student.getResult(60, 70, 80));
    }

    @Test
    public void testGetResultFail() {
        StudentResult student = new StudentResult();
        assertEquals("Fail", student.getResult(40, 70, 30));
    }
}
