package me.gabreuw.personapi.api.dto;

import lombok.Getter;
import lombok.Setter;
import me.gabreuw.personapi.domain.model.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
public class PhoneDTO implements Serializable {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

}
