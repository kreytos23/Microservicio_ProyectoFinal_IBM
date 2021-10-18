package com.CitiBanamex.CajerosAPI.Web.Controller;

import com.CitiBanamex.CajerosAPI.Domain.Service.CajerosServiceInt;
import com.CitiBanamex.CajerosAPI.Persistence.Answers;
import com.CitiBanamex.CajerosAPI.Persistence.SucursalesEncontradas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/BanamexAPI")
public class CajerosController {

    @Autowired
    CajerosServiceInt cajerosService;

    @GetMapping("/obtener-cajeros")
    public ResponseEntity<List<SucursalesEncontradas>> getCajeros(@RequestBody @Valid Answers answers){
        return new ResponseEntity<>(cajerosService.getResponseCajeros(answers), HttpStatus.OK);
    }
}
