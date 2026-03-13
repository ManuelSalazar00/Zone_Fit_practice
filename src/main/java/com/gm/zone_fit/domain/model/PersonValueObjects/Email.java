package com.gm.zone_fit.domain.model.PersonValueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Objects;

@Getter
@EqualsAndHashCode
public class Email {

    private final String value;

    public Email(String value) {
        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        this.value = value;
    }

}
