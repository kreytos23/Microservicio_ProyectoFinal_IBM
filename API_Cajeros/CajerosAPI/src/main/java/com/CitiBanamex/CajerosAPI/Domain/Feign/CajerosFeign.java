package com.CitiBanamex.CajerosAPI.Domain.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("${feign.client.apiCajeros.name}")
@RequestMapping("${feign.client.apiCajeros.uri}")
public interface CajerosFeign {
    @GetMapping("${feign.client.apiCajeros.cajeros}")
    public String getResponseCajeros();
}
