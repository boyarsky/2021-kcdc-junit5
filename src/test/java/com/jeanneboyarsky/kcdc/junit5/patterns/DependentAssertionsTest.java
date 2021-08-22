package com.jeanneboyarsky.kcdc.junit5.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependentAssertionsTest {

    @Test
    void bean() {
        Bean bean = null;
        assertAll("found name",
                () -> {
                    assertNotNull(bean);
                    assertAll("name values",
                            () -> assertEquals("Jeanne", bean.getFirstName(), "first"),
                            () -> assertEquals("Boyarsky", bean.getLastName(), "last"));

                });
    }


}