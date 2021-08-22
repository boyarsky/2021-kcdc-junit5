package com.jeanneboyarsky.kcdc.junit5.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReportTest {

    private Report report;

    @BeforeEach
    void setUp() {
        report = new Report();
    }

    @Test
    void createRow() {
        String expected = "Jeanne Boyarsky,Intro to JUnit 5";
        String actual = report.createRow("Jeanne Boyarsky", "Intro to JUnit 5");
        assertEquals(expected, actual, "row");
    }
}