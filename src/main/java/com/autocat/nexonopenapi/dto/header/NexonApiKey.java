package com.autocat.nexonopenapi.dto.header;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
