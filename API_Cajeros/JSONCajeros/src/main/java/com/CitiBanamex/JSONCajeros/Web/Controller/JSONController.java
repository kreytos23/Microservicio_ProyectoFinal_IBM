package com.CitiBanamex.JSONCajeros.Web.Controller;

import com.CitiBanamex.JSONCajeros.Domain.Service.JSONCajerosInt;
import com.CitiBanamex.JSONCajeros.Utils.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Mapping.API)
public class JSONController {

    @Autowired
    JSONCajerosInt jsonCajerosInt;

    @GetMapping("/get-cajeros")
    public ResponseEntity<String> getCajeros() {
        return new ResponseEntity<>(jsonCajerosInt.sendRequestToBanamex(), HttpStatus.OK) ;
    }
}
