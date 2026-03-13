package com.gm.zone_fit.domain.model.PersonValueObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellPhoneTest {
    @Test
    void shouldThrowExceptionWhenCellphoneIsInvalid(){
        assertThrows(IllegalArgumentException.class, ()-> new CellPhone("CellPhoneError"));
    }

    @Test
    void shouldCreateCellPhoneWhenFormatIsValid(){
        CellPhone cellPhone = new CellPhone("3210789654");
        assertEquals("3210789654", cellPhone.getValue());
    }

}