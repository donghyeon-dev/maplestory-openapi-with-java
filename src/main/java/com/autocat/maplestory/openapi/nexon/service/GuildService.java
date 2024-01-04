package com.autocat.maplestory.openapi.nexon.service;

import com.autocat.maplestory.openapi.nexon.dto.Guild;
import com.autocat.maplestory.openapi.nexon.dto.GuildIdRequest;
import com.autocat.maplestory.openapi.nexon.dto.GuildOverview;
import com.autocat.maplestory.openapi.nexon.dto.GuildBasic;
import com.autocat.maplestory.openapi.nexon.feign.GuildClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Slf4j
@Service
@RequiredArgsConstructor
public class GuildService {

    private final GuildClient guildClient;


    public GuildOverview fetchGuildOverview(GuildIdRequest request) {

        Guild guildId = guildClient.fetchGuildId(request.getGuildName(), request.getWorldName());
        GuildBasic guildBasic = guildClient.fetchGuildBasic(guildId.getOguildId()
                , LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        return GuildOverview.builder().guild(guildId).guildBasic(guildBasic).build();

    };
}
