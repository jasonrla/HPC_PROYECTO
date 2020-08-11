package com.everis.base.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * @author jovallep
 */
@Data
@Builder
public class Usuario {

    private String firstName;
    private String lastName;
    private String email;
}
