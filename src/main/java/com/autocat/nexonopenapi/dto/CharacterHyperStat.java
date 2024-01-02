package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.HyperStatPreset1;
import com.autocat.nexonopenapi.dto.inner.HyperStatPreset2;
import com.autocat.nexonopenapi.dto.inner.HyperStatPreset3;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
public class CharacterHyperStat {

    /** 조회 기준일 */
    private OffsetDateTime date;

    /** 캐릭터 직업 */
    private String characterClass;

    /** 적용중인 프리셋 번호 */
    private String usePresetNo;

    /** 사용 가능한 최대 하이퍼스텟 포인트 */
    private Long useAvailableHyperStat;

    /** 프리셋 1번 하이퍼 스텟 잔여 포인트 */
    private Long hyperStatPreset1RemainPoint;

    /** 프리셋 1번 하이퍼 스텟 정보 */
    List<HyperStatPreset1> hyperStatPreset1;

    /** 프리셋 2번 하이퍼 스텟 잔여 포인트 */
    private Long hyperStatPreset2RemainPoint;

    /** 프리셋 2번 하이퍼 스텟 정보 */
    List<HyperStatPreset2> hyperStatPreset2;

    /** 프리셋 3번 하이퍼 스텟 잔여 포인트 */
    private Long hyperStatPreset3RemainPoint;

    /** 프리셋 3번 하이퍼 스텟 정보 */
    List<HyperStatPreset3> hyperStatPreset3;


}
