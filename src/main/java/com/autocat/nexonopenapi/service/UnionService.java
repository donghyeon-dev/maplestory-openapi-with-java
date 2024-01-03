package com.autocat.nexonopenapi.service;

import com.autocat.nexonopenapi.dto.CharacterOcidRequest;
import com.autocat.nexonopenapi.dto.ClientBasicRequest;
import com.autocat.nexonopenapi.dto.Union;
import com.autocat.nexonopenapi.dto.UnionOverview;
import com.autocat.nexonopenapi.dto.inner.UnionRaider;
import com.autocat.nexonopenapi.feign.CharacterClient;
import com.autocat.nexonopenapi.feign.UnionClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Slf4j
@Service
@RequiredArgsConstructor
public class UnionService {

    private final UnionClient unionClient;
    private final CharacterClient characterClient;


    public UnionOverview getCharacterUnionOverview(CharacterOcidRequest request) {
        ClientBasicRequest basicRequestDto = characterClient.getCharacterOcid(request.getCharacterName());

        Union union = unionClient.getUnion(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        UnionRaider unionRaider = unionClient.getUnionRaider(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        return UnionOverview.builder()
                .union(union)
                .unionRaider(unionRaider)
                .build();


    };
}
