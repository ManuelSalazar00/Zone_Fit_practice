package com.gm.zone_fit.domain.model.PersonValueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class CellPhone {
    private final String Value;

    public CellPhone(String value){
        if(value == null || !value.matches("\\d{10}")){
            throw new IllegalArgumentException("Invalid cellPhone format");
        }
        this.Value = value;
    }
}
