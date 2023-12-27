package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.HyperStatPreset1;
import com.autocat.nexonopenapi.dto.inner.HyperStatPreset2;
import com.autocat.nexonopenapi.dto.inner.HyperStatPreset3;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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

@Builder
public class CharacterHyperStat {

    @Comment("조회 기준일")
    private OffsetDateTime date;

    @Comment("캐릭터 직업")
    private String characterClass;

    @Comment("적용중인 프리셋 번호")
    private String usePresetNo;

    @Comment("사용 가능한 최대 하이퍼스텟 포인트")
    private Long useAvailableHyperStat;

    @Comment("프리셋 1번 하이퍼 스텟 잔여 포인트")
    @JsonProperty("hyper_stat_preset_1_remain_point")
    private Long hyperStatPreset1RemainPoint;

    @Comment("프리셋 1번 하이퍼 스텟 정보")
    @JsonProperty("hyper_stat_preset_1")
    List<HyperStatPreset1> hyperStatPreset1;

    @Comment("프리셋 2번 하이퍼 스텟 잔여 포인트")
    @JsonProperty("hyper_stat_preset_2_remain_point")
    private Long hyperStatPreset2RemainPoint;

    @Comment("프리셋 2번 하이퍼 스텟 정보")
    @JsonProperty("hyper_stat_preset_2")
    List<HyperStatPreset2> hyperStatPreset2;

    @Comment("프리셋 3번 하이퍼 스텟 잔여 포인트")
    @JsonProperty("hyper_stat_preset_3_remain_point")
    private Long hyperStatPreset3RemainPoint;

    @Comment("프리셋 3번 하이퍼 스텟 정보")
    @JsonProperty("hyper_stat_preset_3")
    List<HyperStatPreset3> hyperStatPreset3;


}
