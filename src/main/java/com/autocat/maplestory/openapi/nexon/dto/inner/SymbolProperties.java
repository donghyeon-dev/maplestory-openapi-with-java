package com.autocat.maplestory.openapi.nexon.dto.inner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SymbolProperties {

    private String symbolName;

    private String symbolIcon;

    private String symbolDescription;

    private String symbolForce;

    private Long symbolLevel;

    private String symbolStr;

    private String symbolDex;

    private String symbolInt;

    private String symbolLuk;

    private String symbolHp;

    private Long symbolGrowthCount;

    private Long symbolRequireGrowthCount;
}
