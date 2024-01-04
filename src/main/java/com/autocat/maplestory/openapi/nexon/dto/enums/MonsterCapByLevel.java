package com.autocat.maplestory.openapi.nexon.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Optional;

/**
 * reference
 * - https://namu.wiki/w/%EB%A9%94%EC%9D%B4%ED%94%8C%EC%8A%A4%ED%86%A0%EB%A6%AC/%EB%A0%88%EB%B2%A8%EB%B3%84%20%EC%9C%A1%EC%84%B1#s-4.5
 * - https://m.blog.naver.com/jihyun__sz/221918108405
 * - https://maplestory.fandom.com/ko/wiki/%EB%B6%84%EB%A5%98:%EC%96%8C%EC%96%8C_%EC%95%84%EC%9D%BC%EB%9E%9C%EB%93%9C/%EB%A7%B5
 */
@Getter
@Slf4j
@AllArgsConstructor
public enum MonsterCapByLevel {

    CAP_200_210(207, "안식의 에르다스", 118_598, 200, 210),
    CAP_210_215(213, "성난 플리온", 265_808, 210, 215),
    CAP_215_220(216, "대장 라이터틀", 284_043, 215,220),
    CAP_220_225(221, "갈리나", 316_316,220,225),
    CAP_225_230(232, "흙의 정령", 408_788,255,230),
    CAP_230_235(237,"혼돈의 정령", 446_505,230,235),
    CAP_235_240(244, "아라냐", 509_964,235,240),
    CAP_240_245(246, "뽈라르", 527_106,240,245),
    CAP_245_250(251, "파괴의 피조물", 594_040,245,250),
    CAP_250_255(258, "침묵의 정찰자", 661_261,250,255),
    CAP_255_260(262, "어센시온", 700_242,255,260),
    CAP_260_265(261, "화염정령", 1_750_290,260,265),
    CAP_265_270(265, "모래칼날 약탈꾼", 2_056_974,265,270),
    CAP_270_275(272, "강화형 파수꾼 산호", 2_445_217,270,275),
    CAP_275_280(275, "먹그늘 나비", 2_903_024,275,280),
    CAP_280_285(282, "하이레프 보병", 3_436_027,280,285),
    CAP_285_290(287, "뭐로해야지..?", 4_000_000,285,290),
    ;

    private final int level;
    private final String monsterName;
    private final long experience;
    private final int minimumLevelCap;
    private final int maximumLevelCap;

    public static MonsterCapByLevel getMonsterEnumByLevel(int level){
        Optional<MonsterCapByLevel> optionalTargetEnum = Optional.ofNullable(Arrays.stream(MonsterCapByLevel.values())
                .filter(monsterCapByLevel -> monsterCapByLevel.getMinimumLevelCap() < level
                        && monsterCapByLevel.getMaximumLevelCap() > level)
                .findFirst()
                .orElseGet(null));

        if(optionalTargetEnum.isPresent()){
            log.info("MonsterCapByLevel.get() : {}", optionalTargetEnum.get());
            return optionalTargetEnum.get();
        }

        log.warn("MonsterCapByLevel is null, parameter level is [{}]", level);
        return null;
    }

}
