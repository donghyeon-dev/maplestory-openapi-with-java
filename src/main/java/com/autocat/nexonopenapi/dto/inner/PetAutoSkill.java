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
public class PetAutoSkill {
    @JsonProperty("skill_1")
    private String skill1;

    @JsonProperty("skill_1_icon")
    private String skill1Icon;

    @JsonProperty("skill_2")
    private String skill2;

    @JsonProperty("skill_2_icon")
    private String skill2Icon;
}
