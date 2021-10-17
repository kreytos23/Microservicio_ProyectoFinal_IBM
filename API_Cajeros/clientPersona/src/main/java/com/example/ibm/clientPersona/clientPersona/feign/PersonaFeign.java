package com.example.ibm.clientPersona.clientPersona.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("${feign.client.persons.name}")
@RequestMapping("${feign.client.persons.uri}")
public interface PersonaFeign {

	@GetMapping("${feign.client.persons.cajeros}")
	public String getResponseCajeros();
}
