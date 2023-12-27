package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CharacterClient는 지정된 URL로 GET 요청을 보내는 Feign 클라이언트 인터페이스입니다.
 * 서버에서 다양한 형태의 캐릭터 데이터를 가져오는 메소드가 포함되어 있습니다.
 *
 * @author donghyeon.park
 */
@FeignClient(name = "Character", url = "https://open.api.nexon.com", configuration = FeignConfig.class)
public interface CharacterClient {


    /**
     * 캐릭터의 OCID를 가져옵니다.
     *
     * @param characterName 캐릭터의 이름
     * @return 캐릭터의 OCID를 포함한 ClientBasicRequest 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/id")
    ClientBasicRequest getCharacterOcid(@RequestParam(value = "character_name") String characterName);

    /**
     * 캐릭터의 기본 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 기본 정보를 포함한 CharacterBasic 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/basic")
    CharacterBasic getCharacterBasic(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 인기도 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 인기도 정보를 포함한 CharacterPopularity 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/popularity")
    CharacterPopularity getCharacterPopularity(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터 종합 능력치 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 종합 능력치 정보를 포함한 CharacterStat 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/stat")
    CharacterStat getCharacterStat(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 하이퍼스탯 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 하이퍼스탯 정보를 포함한 CharacterHyperStat 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/hyper-stat")
    CharacterHyperStat getCharacterHyperStat(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 성향 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 성향 정보를 포함한 CharacterPropensity 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/propensity")
    CharacterPropensity getCharacterPropensity(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 어빌리티 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 어빌리티 정보를 포함한 CharacterAbility 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/ability")
    CharacterAbility getCharacterAbility(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 아이템 장비 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 아이템 장비 정보를 포함한 CharacterItemEquipment 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/item-equipment")
    CharacterItemEquipment getCharacterItemEquipment(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 캐시 아이템 장비 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 캐시 아이템 장비 정보를 포함한 CharacterCashItemEquipment 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/cashitem-equipment")
    CharacterCashItemEquipment getCharacterCashItemEquipment(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 심볼 장비 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 심볼 장비 정보를 포함한 CharacterSymbolEquipment 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/symbol-equipment")
    CharacterSymbolEquipment getCharacterSymbolEquipment(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 세트 효과 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 세트 효과 정보를 포함한 CharacterSetEffect 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/set-effect")
    CharacterSetEffect getCharacterSetEffect(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 미용 아이템 장비 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 미용 아이템 장비 정보를 포함한 CharacterBeautyEquipment 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/beauty-equipment")
    CharacterBeautyEquipment getCharacterBeautyEquipment(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 안드로이드 장비 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 안드로이드 장비 정보를 포함한 CharacterAndroidEquipment 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/android-equipment")
    CharacterAndroidEquipment getCharacterAndroidEquipment(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 펫 장비 정보를 가져옵니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 펫 장비 정보를 포함한 CharacterPetEquipment 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/pet-equipment")
    CharacterPetEquipment getCharacterPetEquipment(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 스킬 정보를 가져옵니다.
     *
     * @param ocid                캐릭터의 OCID
     * @param date                정보를 얻고자 하는 날짜
     * @param characterSkillGrade  스킬 차수
     * @return 해당 날짜와 스킬 등급의 캐릭터 스킬 정보를 포함한 CharacterSkill 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/skill")
    CharacterSkill getCharacterSkill(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date
            , @RequestParam(value = "character_skill_grade") String characterSkillGrade);


    /**
     * 캐릭터의 링크 스킬 정보를 가져옵니다.
     *
     * @param ocid                캐릭터의 OCID
     * @param date                정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 링크 스킬 정보를 포함한 CharacterLinkSkill 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/character/link-skill")
    CharacterLinkSkill getCharacterLinkSkill(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);
}
