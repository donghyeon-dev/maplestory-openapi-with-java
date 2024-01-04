package com.autocat.nexonopenapi.service;

import com.autocat.nexonopenapi.dto.Guild;
import com.autocat.nexonopenapi.dto.GuildBasic;
import com.autocat.nexonopenapi.dto.GuildIdRequest;
import com.autocat.nexonopenapi.dto.GuildOverview;
import com.autocat.nexonopenapi.feign.GuildClient;
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
