package com.autocat.maplestory.openapi.nexon.controller;

import com.autocat.maplestory.openapi.nexon.dto.GuildIdRequest;
import com.autocat.maplestory.openapi.nexon.dto.GuildOverview;
import com.autocat.maplestory.openapi.nexon.service.GuildService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guild")
@RequiredArgsConstructor
public class GuildController {

    private final GuildService guildService;

    /**
     * 길드명과 서버명을 입력받고, *전 일자* 길드 정보를 가져온다.
     * @param request
     * @return
     */
    @GetMapping("/overview")
    GuildOverview fetchGuildOverview(GuildIdRequest request) {
        return guildService.fetchGuildOverview(request);
    }


}
