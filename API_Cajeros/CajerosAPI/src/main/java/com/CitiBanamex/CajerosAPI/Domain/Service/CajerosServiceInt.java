package com.CitiBanamex.CajerosAPI.Domain.Service;

import com.CitiBanamex.CajerosAPI.Persistence.Answers;
import com.CitiBanamex.CajerosAPI.Persistence.SucursalesEncontradas;

import java.util.List;

public interface CajerosServiceInt {
    List<SucursalesEncontradas> getResponseCajeros(Answers answers);
}
