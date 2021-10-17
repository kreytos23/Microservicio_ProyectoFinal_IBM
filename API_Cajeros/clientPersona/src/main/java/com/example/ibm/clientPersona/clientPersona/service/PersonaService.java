package com.example.ibm.clientPersona.clientPersona.service;

import java.util.List;

import com.example.ibm.clientPersona.clientPersona.Entity.Answers;
import com.example.ibm.clientPersona.clientPersona.Entity.SucursalesEncontradas;

public interface PersonaService {
	List<SucursalesEncontradas> getResponseCajeros(Answers answers);
}
