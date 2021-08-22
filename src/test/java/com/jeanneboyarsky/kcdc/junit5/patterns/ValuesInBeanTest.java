package com.jeanneboyarsky.kcdc.junit5.patterns;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ValuesInBeanTest {

    @Test
    void bean() {
       Bean bean = new Bean("Jeanne", "Boyarsky");
       assertAll("name",
               () -> assertEquals("Jeanne", bean.getFirstName(), "first"),
               () -> assertEquals("Boyarsky", bean.getLastName(), "last"));
    }

    @Test
    void record() {
        Record record = new Record("Jeanne", "Boyarsky");
        Record expected = new Record("Jeanne", "Boyarsky");
        assertEquals(expected, record, "name");
    }

}