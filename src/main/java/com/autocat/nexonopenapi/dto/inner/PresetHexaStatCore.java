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
public class PresetHexaStatCore {

    private String slotId;
    private String mainStatName;

    @JsonProperty("sub_stat_name_1")
    private String subStatName1;

    @JsonProperty("sub_stat_name_2")
    private String subStatName2;

    private Long mainStatLevel;

    @JsonProperty("sub_stat_level_1")
    private Long subStatLevel1;

    @JsonProperty("sub_stat_level_2")
    private Long subStatLevel2;

    private Long statGrade;
}
