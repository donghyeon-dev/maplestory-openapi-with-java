package com.autocat.maplestory.openapi.nexon.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum World {

    SCANIA("스카니아"),
    BERA("베라"),
    LUNA("루나"),
    ZENITH("제니스"),
    CROA("크로아"),
    UNION("유니온"),
    ELYSIUM("엘리시움"),
    INOSYS("이노시스"),
    RED("레드"),
    AURORA("오로라"),
    ARCANE("아케인"),
    NOVA("노바"),
    REBOOT("리부트"),
    REBOOT2("리부트2"),
    BURNING("버닝"),
    BURNING2("버닝2"),
    BURNING3("버닝3");


    private String worldName;
}
