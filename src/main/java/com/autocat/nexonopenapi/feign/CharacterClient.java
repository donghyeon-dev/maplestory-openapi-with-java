package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Character", url = "https://open.api.nexon.com",  configuration = FeignConfig.class)
public interface CharacterClient {


    // 캐릭터고유 식별자 가져오기
    @GetMapping("/maplestory/v1/id")
    ClientBasicRequest getCharacterOcid(@RequestParam(value = "character_name") String characterName);

    // 캐릭터 기본정보 가져오기
    @GetMapping("/maplestory/v1/character/basic")
    CharacterBasic getCharacterBasic(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    // 캐릭터 인기도 가져오기
    @GetMapping("/maplestory/v1/character/popularity")
    CharacterPopularity getCharacterPopularity(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    // 캐릭터 종합 능력치 정보 가져오기
    @GetMapping("/maplestory/v1/character/stat")
    CharacterStat getCharacterStat(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    // 캐릭터 하이퍼스탯 정보 가져오기
    @GetMapping("/maplestory/v1/character/hyper-stat")
    CharacterHyperStat getCharacterHyperStat(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);
}
