package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PetEquipment {
    private String itemName;
    private String itemIcon;
    private String itemDescription;

    @JsonProperty("item_option")
    private List<CashItemOption> itemOption;

    private Long scrollUpgrade;
    private Long scrollUpgradable;
}
