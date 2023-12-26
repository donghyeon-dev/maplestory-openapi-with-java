package com.autocat.nexonopenapi.config;

import com.autocat.nexonopenapi.feign.FeignConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.autocat.nexonopenapi", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = FeignConfig.class)
})
public class ApplicationConfiguration {
}
