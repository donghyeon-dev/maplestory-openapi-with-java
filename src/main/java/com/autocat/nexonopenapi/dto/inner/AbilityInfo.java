package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@JsonRootName("ability_info")
public class AbilityInfo {

    String abilityNo;

    String abilityGrade;

    String abilityValue;
}
