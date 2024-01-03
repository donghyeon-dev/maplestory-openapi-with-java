package com.autocat.nexonopenapi.controller;

import com.autocat.nexonopenapi.dto.*;
import com.autocat.nexonopenapi.feign.CharacterClient;
import com.autocat.nexonopenapi.service.CharacterService;
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

    @GetMapping("/v-matrix")
    public CharacterVMatrix getCharacterVMatrix(CharacterOcidRequest request) {
        return characterService.getCharacterVMatrix(request);
    }

}
