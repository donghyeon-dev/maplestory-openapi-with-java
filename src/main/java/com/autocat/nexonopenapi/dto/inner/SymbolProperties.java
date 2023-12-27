package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
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
@JsonRootName("symbol_properties")
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
