package com.example.ibm.ejemplo.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ibm.ejemplo.mapping.Mapping;
import com.example.ibm.ejemplo.services.IHttpConsumes;

@RestController
@RequestMapping(Mapping.ACADEMIA)
public class ConsumesRestController {

	@Autowired
	IHttpConsumes httpConsumes;

	@GetMapping("/get-cajeros")
	public ResponseEntity<String> getCajeros() {
		return new ResponseEntity<>(httpConsumes.sendRequestToBanamex(), HttpStatus.OK) ;
	}
}
