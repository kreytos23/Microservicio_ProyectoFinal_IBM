package Request;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RequestJSONBanamex {
    public static void main(String[] args) {
        final String URLAPI = "https://www.banamex.com/localizador/jsonP/json5.json";

        try {
            URL url = new URL(URLAPI);
            URLConnection conexion = url.openConnection();

            Reader reader = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(reader);

            String linea = "";

            while((linea = br.readLine()) != null){
                linea += linea;
            }
            System.out.println(linea);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
