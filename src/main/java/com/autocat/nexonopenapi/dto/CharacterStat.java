package com.autocat.nexonopenapi.dto;


import com.autocat.nexonopenapi.dto.inner.FinalStat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.OffsetDateTime;
import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class CharacterStat {

    @Comment("조회기준일")
    private OffsetDateTime date;

    @Comment("캐릭터 직업")
    private String characterClass;

    @Comment("현재 스텟 정보")
    List<FinalStat> finalStat;

    @Comment("잔여 AP")
    private Long remainAp;

}
