package me.gabreuw.personapi.api.dto;

import lombok.Getter;
import lombok.Setter;
import me.gabreuw.personapi.domain.model.enums.PhoneType;

import java.io.Serializable;

@Getter
@Setter
public class PhoneDTO implements Serializable {

    private Long id;

    private PhoneType type;

    private String number;

}
