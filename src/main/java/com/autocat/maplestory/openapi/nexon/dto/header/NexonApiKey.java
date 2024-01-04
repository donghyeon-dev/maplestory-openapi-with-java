package com.autocat.maplestory.openapi.nexon.dto.header;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Optional;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class NexonApiKey {
    
    @Builder.Default
    private String nxopenApiKey = Optional.ofNullable(System.getenv("NXOPEN_API_KEY")).orElseThrow(IllegalArgumentException::new);
}
