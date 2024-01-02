package com.autocat.nexonopenapi.dto;


import com.autocat.nexonopenapi.dto.inner.FinalStat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;


import java.time.OffsetDateTime;
import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class CharacterStat {

    /** 조회기준일 */
    private OffsetDateTime date;

    /** 캐릭터 직업 */
    private String characterClass;

    /** 현재 스텟 정보 */
    List<FinalStat> finalStat;

    /** 잔여 AP */
    private Long remainAp;

}
