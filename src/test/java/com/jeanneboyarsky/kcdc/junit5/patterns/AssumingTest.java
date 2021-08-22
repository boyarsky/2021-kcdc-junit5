package com.jeanneboyarsky.kcdc.junit5.patterns;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

class AssumingTest {

    @Test
    void bean() {
        Bean bean = null;
        assumeFalse(bean == null, "no name");

        assertEquals("Jeanne", bean.getFirstName(), "first");
        assertEquals("Boyarsky", bean.getLastName(), "last");

    }


}