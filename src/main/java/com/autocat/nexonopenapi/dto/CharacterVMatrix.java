package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.VCoreEquipment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterVMatrix {

    private OffsetDateTime date;
    private String characterClass;

    @JsonProperty("character_v_core_equipment")
    private List<VCoreEquipment> characterVCoreEquipment;

    @JsonProperty("character_v_matrix_remain_slot_upgrade_point")
    private Long characterVMatrixRemainSlotUpgradePoint;
}
