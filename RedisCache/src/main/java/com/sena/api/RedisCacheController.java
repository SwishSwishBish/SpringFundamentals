package com.sena.api;

import com.sena.service.RedisCacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RedisCacheController {

    private int i = 0;

    private RedisCacheService redisCacheService;

    @GetMapping
    public String cacheControl(){
        if (i == 5){
            redisCacheService.clearCache();
            i = 0;
        }
        i++;
        return redisCacheService.longRunnigMethod();
    }
}
