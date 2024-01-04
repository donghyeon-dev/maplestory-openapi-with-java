package com.autocat.maplestory.openapi.nexon.service;

import com.autocat.maplestory.openapi.nexon.dto.CharacterOcidRequest;
import com.autocat.maplestory.openapi.nexon.dto.ClientBasicRequest;
import com.autocat.maplestory.openapi.nexon.dto.Union;
import com.autocat.maplestory.openapi.nexon.dto.UnionOverview;
import com.autocat.maplestory.openapi.nexon.feign.UnionClient;
import com.autocat.maplestory.openapi.nexon.dto.inner.UnionRaider;
import com.autocat.maplestory.openapi.nexon.feign.CharacterClient;
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
