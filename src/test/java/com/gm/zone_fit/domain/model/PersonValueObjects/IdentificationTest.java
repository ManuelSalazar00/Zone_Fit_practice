package com.gm.zone_fit.domain.model.PersonValueObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentificationTest {
    @Test
    void shouldThrowExceptionWhenTypeIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Identification(null, "123456"));
    }
    @Test
    void shouldThrowExceptionWhenNumberIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Identification(IdentificationType.CC, null));
    }

    @Test
    void shouldCreateIdentificationWhenFormatIsValid() {
        Identification identification = new Identification(IdentificationType.CC, "123456");
        assertEquals(IdentificationType.CC  , identification.getType());
        assertEquals("123456" , identification.getNumber());
    }

}