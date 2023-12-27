package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class VCoreEquipment {
    private String slotId;

    private Long slotLevel;

    @JsonProperty("v_core_name")
    private String vCoreName;

    @JsonProperty("v_core_type")
    private String vCoreType;

    @JsonProperty("v_core_level")
    private Long vCoreLevel;

    @JsonProperty("v_core_skill_1")
    private String vCoreSkill1;

    @JsonProperty("v_core_skill_2")
    private String vCoreSkill2;

    @JsonProperty("v_core_skill_3")
    private String vCoreSkill3;
}
