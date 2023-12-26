package com.autocat.nexonopenapi.dto;

import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.OffsetDateTime;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class CharacterBasic {

    @Comment("캐릭터 식별자")
    private String ocid;

    @Comment("조회기준일(KST, 일 단위 데이토러 시, 분은 일괄 0으로 표기)")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    OffsetDateTime date;

    @Comment("캐릭터 명")
    String characterName;

    @Comment("월드 명")
    String worldName;

    @Comment("캐릭터 성별")
    String characterGender;

    @Comment("캐릭터 직업")
    String characterClass;

    @Comment("캐릭터 전직차수")
    String characterClassLevel;

    @Comment("캐릭터 레벨")
    Long characterLevel;

    @Comment("현재 레벨에서 보유한 경험치")
    Long characterExp;

    @Comment("현재 레벨에서 보유한 경험치 퍼센트")
    String characterExpRate;

    @Comment("캐릭터 소속 길드 명")
    String characterGuildName;

    @Comment("캐릭터 외형 이미지")
    String characterImage;
}
