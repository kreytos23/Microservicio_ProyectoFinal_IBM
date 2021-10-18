package com.CitiBanamex.CajerosAPI.Domain.Service;

import com.CitiBanamex.CajerosAPI.Domain.Feign.CajerosFeign;
import com.CitiBanamex.CajerosAPI.Persistence.Answers;
import com.CitiBanamex.CajerosAPI.Persistence.SucursalesEncontradas;
import com.CitiBanamex.CajerosAPI.Utils.JSONConstants;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CajerosServiceImp implements CajerosServiceInt{

    @Autowired
    CajerosFeign cajerosFeign;

    @Override
    public List<SucursalesEncontradas> getResponseCajeros(Answers answers) {
        String json = cajerosFeign.getResponseCajeros();

        List<SucursalesEncontradas> sucursales = new ArrayList<>();
        SucursalesEncontradas aux;
        String AuxGPS1,AuxGPS2,AuxDireccion, AuxCP,AuxDelegacion,AuxEstado;
        String AuxHorario1,AuxHorario2,Horario,AuxTipoSucursal,AuxEntreCalles,ID;
        int maxCajero;

        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject raiz = jsonObject.getJSONObject(JSONConstants.RAIZ);

            for (int x = 0; x < JSONConstants.DIVISION1.length; x++) {
                for (int y = 0; y < JSONConstants.DIVISION2.length; y++) {
                    maxCajero = iteracionMax(x, y, raiz);
                    for (int j = 1; j <= maxCajero; j++) {
                        try {
                            AuxGPS1 = obtenerValor(x, y, j, 15, raiz);
                            AuxGPS2 = obtenerValor(x, y, j, 16, raiz);
                            AuxDireccion = obtenerValor(x, y, j, 4, raiz);
                            AuxCP = obtenerCP(AuxDireccion);
                            AuxEstado = obtenerValor(x, y, j, 17, raiz);
                            AuxDelegacion = obtenerValor(x, y, j, 2, raiz);

                            if (AuxGPS1.equalsIgnoreCase(answers.getGPS1()) && AuxGPS2.equalsIgnoreCase(answers.getGPS2()) && AuxCP.equalsIgnoreCase(answers.getCP()) && AuxEstado.equalsIgnoreCase(answers.getEstado()) && AuxDelegacion.equalsIgnoreCase(answers.getDelegacion())) {
                                AuxHorario1 = obtenerValor(x, y, j, 13, raiz);
                                AuxHorario2 = obtenerValor(x, y, j, 14, raiz);
                                AuxEntreCalles = obtenerValor(x, y, j, 6, raiz);
                                AuxTipoSucursal = obtenerValor(x, y, j, 19, raiz);
                                ID = x + " " + y + " " + j;
                                Horario = AuxHorario1 + " - " + AuxHorario2;
                                aux = new SucursalesEncontradas(AuxTipoSucursal, AuxDireccion, AuxEntreCalles, Horario, ID);
                                sucursales.add(aux);

                            }
                        } catch (NullPointerException ex) {
                            continue;
                        }
                    }
                }
            }
        } catch (NullPointerException | JSONException nullPointer) {
        }
        return sucursales;
    }

    public String obtenerValor(int indice1, int indice2, int indice3, int indiceDeValor, JSONObject raiz){
        String valor;
        try {
            valor = raiz.getJSONObject( JSONConstants.DIVISION1[indice1]).getJSONObject(JSONConstants.DIVISION2[indice2]).getJSONArray(String.valueOf(indice3)).getString(indiceDeValor);
            return valor;
        }catch (JSONException ex){
            return null;
        }
    }

    public int iteracionMax (int indice1, int indice2, JSONObject raiz){

        int maximoCajero = 0;
        int maximoCajeroAux = 0;
        String valorObtenido = "";

        try {
            JSONObject array =
                    raiz.getJSONObject( JSONConstants.DIVISION1[indice1]).getJSONObject(JSONConstants.DIVISION2[indice2]);

            Iterator listanom = array.keys();
            for (int x = 0; x < array.length(); x++){
                valorObtenido = (String) listanom.next();
                maximoCajeroAux = Integer.parseInt(valorObtenido);
                if( maximoCajeroAux > maximoCajero ){
                    maximoCajero = maximoCajeroAux;
                }
            }
            return maximoCajero;
        }catch (JSONException  | NumberFormatException number){
            return 0;
        }
    }

    public String obtenerCP(String direccion){
        int cpIndex = direccion.indexOf(JSONConstants.CP);
        String AuxCP;
        AuxCP = direccion.substring(cpIndex + 5, cpIndex + 10);
        return AuxCP;
    }
}
