package me.gabreuw.personapi.common.utils;

import me.gabreuw.personapi.api.dto.PhoneDTO;
import me.gabreuw.personapi.domain.model.Phone;
import me.gabreuw.personapi.domain.model.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "11 99999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final Long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
