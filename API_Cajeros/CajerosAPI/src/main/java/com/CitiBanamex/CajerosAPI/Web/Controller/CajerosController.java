package com.CitiBanamex.CajerosAPI.Web.Controller;

import com.CitiBanamex.CajerosAPI.Domain.Service.CajerosServiceInt;
import com.CitiBanamex.CajerosAPI.Persistence.Answers;
import com.CitiBanamex.CajerosAPI.Persistence.SucursalesEncontradas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/BanamexAPI")
public class CajerosController {

    @Autowired
    CajerosServiceInt cajerosService;

    @GetMapping("/obtener-cajeros")
    public List<SucursalesEncontradas> getCajeros(@RequestBody Answers answers){
        return cajerosService.getResponseCajeros(answers);
    }
}
