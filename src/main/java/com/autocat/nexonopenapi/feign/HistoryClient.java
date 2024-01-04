package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.dto.Union;
import com.autocat.nexonopenapi.dto.inner.UnionRaider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HistoryClient 지정된 URL로 GET 요청을 보내는 Feign 클라이언트 인터페이스입니다.
 * 딸깍 히스토리 조회 메소드가 포함되어 있습니다.
 *
 * @author donghyeon.park
 */
@FeignClient(name = "DC", url = "https://open.api.nexon.com")
public interface HistoryClient {

    /**
     * ToDo : API에 오류가 많아서 잠시 보류
     */

}
