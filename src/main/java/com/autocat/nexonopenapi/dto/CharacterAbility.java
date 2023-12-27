package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.AbilityInfo;
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

@Builder
public class CharacterAbility {

    @Comment("조회 기준일")
    OffsetDateTime date;

    @Comment("어빌리티 등급")
    String abilityGrade;

    @Comment("어빌리티 정보")
    List<AbilityInfo> abilityInfo;

    @Comment("보유 명성치")
    Long remainFame;
}
