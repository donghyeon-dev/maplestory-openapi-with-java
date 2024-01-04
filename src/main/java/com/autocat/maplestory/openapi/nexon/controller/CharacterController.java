package com.autocat.maplestory.openapi.nexon.controller;

import com.autocat.maplestory.openapi.nexon.dto.*;
import com.autocat.maplestory.openapi.nexon.service.CharacterService;
import com.autocat.maplestory.openapi.nexon.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    /**
     * 캐릭터명을 입력받고, 전일날짜 기준으로 캐릭터의 모든 정보를 가져온다.
     * @param request
     * @return
     */
    @GetMapping("/overview")
    public CharacterOverview getCharacterBasicInfo(CharacterOcidRequest request) {
        return characterService.getCharacterBasicInfo(request);

    }

    @GetMapping("/hyper-stat")
    public CharacterHyperStat getCharacterHyperStat(CharacterOcidRequest request) {
        return characterService.getCharacterHyperStat(request);
    }

    @GetMapping("/basic")
    public CharacterBasic getCharacterBasic(CharacterOcidRequest request) {
        return characterService.getCharacterBasic(request);
    }

    @GetMapping("/v-matrix")
    public CharacterVMatrix getCharacterVMatrix(CharacterOcidRequest request) {
        return characterService.getCharacterVMatrix(request);
    }

    @GetMapping("/experience-per-day-of-week")
    public ChracterExperienceChanges getCharacterExperienceChanges(CharacterOcidRequest request) {
        return characterService.getCharacterExperienceChanges(request);
    }



}
