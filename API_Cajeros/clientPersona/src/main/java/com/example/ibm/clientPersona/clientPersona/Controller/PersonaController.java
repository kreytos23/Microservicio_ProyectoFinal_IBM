package com.example.ibm.clientPersona.clientPersona.Controller;

import java.util.List;

import com.example.ibm.clientPersona.clientPersona.Entity.Answers;
import com.example.ibm.clientPersona.clientPersona.Entity.SucursalesEncontradas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ibm.clientPersona.clientPersona.service.PersonaService;

@RestController
@RequestMapping("/BanamexAPI")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;

	@GetMapping("/obtener-cajeros")
	public List<SucursalesEncontradas> getCajeros(@RequestBody Answers answers){
		return personaService.getResponseCajeros(answers);
	}
}
