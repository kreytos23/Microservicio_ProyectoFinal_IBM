package com.example.ibm.ejemplo.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Service;


@Service
public class IHttpConsumesImpl implements IHttpConsumes {

	@Override
	public String sendRequestToBanamex() {
		final String URLAPI = "https://www.banamex.com/localizador/jsonP/json5.json";

		try {
			URL url = new URL(URLAPI);
			URLConnection conexion = url.openConnection();

			Reader reader = new InputStreamReader(conexion.getInputStream());
			BufferedReader br = new BufferedReader(reader);

			String linea = br.readLine();;
			return linea.substring(13, linea.length() - 2);
		}catch (Exception ex){
			return null;
		}
	}

}
