package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonRootName;
import org.hibernate.annotations.Comment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonRootName("final_stat")
public class FinalStat {

    @Comment("스텟 명")
    private String statName;

    @Comment("스텟 값")
    private String statValue;

}
