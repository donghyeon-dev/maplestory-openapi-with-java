package com.autocat.maplestory.openapi.nexon.controller;

import com.autocat.maplestory.openapi.nexon.dto.CharacterOcidRequest;
import com.autocat.maplestory.openapi.nexon.dto.UnionOverview;
import com.autocat.maplestory.openapi.nexon.service.UnionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/union")
@RequiredArgsConstructor
public class UnionController {

    private final UnionService unionService;

    /**
     * 캐릭터명을 입력받고, 전일날짜 기준으로 캐릭터의 모든 정보를 가져온다.
     * @param request
     * @return
     */
    @GetMapping("/overview")
    public UnionOverview getCharacterUnionOverview(CharacterOcidRequest request) {
        return unionService.getCharacterUnionOverview(request);

    }

}
