package com.gm.zone_fit.domain.model.PersonValueObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldThrowExceptionWhenEmailIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Email("EmailError"));
    }

    @Test
    void shouldCreateEmailWhenFormatIsValid() {
        Email email = new Email("test@email.com");
        assertEquals("test@email.com", email.getValue());
    }
}