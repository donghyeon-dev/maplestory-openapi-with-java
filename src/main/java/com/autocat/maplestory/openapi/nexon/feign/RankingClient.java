package com.autocat.maplestory.openapi.nexon.feign;

import com.autocat.maplestory.openapi.nexon.dto.OverallRanking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RankingClient는 지정된 URL로 GET 요청을 보내는 Feign 클라이언트 인터페이스입니다.
 * 다양한 랭킹정보를 가져오는 메소드가 포함되어 있습니다.
 *
 * @author donghyeon.park
 */
@FeignClient(name = "Ranking", url = "https://open.api.nexon.com", configuration = FeignConfig.class)
public interface RankingClient {


    /**
     * 이 메소드는 지정한 날짜, 월드 이름, 월드 유형, 클래스, ocid, 페이지 번호에 대한 전체 랭킹을 검색합니다.
     *
     * @param date 랭킹이 조회되는 날짜 (필수).
     * @param worldName 월드의 이름 (선택).
     * @param worldType 월드의 유형 (선택).
     * @param clazz 캐릭터의 클래스 (선택).
     * @param ocid 캐릭터의 ocid (선택).
     * @param page 랭킹에서의 페이지 번호 (선택).
     * @return 전체 랭킹 정보를 포함하고 있는 OverallRanking 객체를 반환.
     */
    @GetMapping("/maplestory/v1/ranking/overall")
    OverallRanking getRankingOverall(@RequestParam(value = "date") String date,
                                     @RequestParam(value = "world_name", required = false) String worldName,
                                     @RequestParam(value = "wolrd_type", required = false) String worldType,
                                     @RequestParam(value = "class", required = false) String clazz,
                                     @RequestParam(value = "ocid", required = false) String ocid,
                                     @RequestParam(value = "page", required = false) int page
    );



}
