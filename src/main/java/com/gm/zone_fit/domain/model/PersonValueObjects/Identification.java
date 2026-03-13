package com.gm.zone_fit.domain.model.PersonValueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Identification  {
    private final IdentificationType type;
    private final String number;

    public Identification(IdentificationType type, String number){

        if(type == null){
            throw new IllegalArgumentException("Document type cannot be empty");
        }

        if(number == null || number.isBlank()){
            throw new IllegalArgumentException("Document number cannot be empty");
        }

        this.type = type;
        this.number =number;
    }

}
