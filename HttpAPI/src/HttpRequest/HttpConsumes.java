package HttpRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class HttpConsumes {
    public static void main(String[] args) {
        final String URLAPI = "https://www.banamex.com/localizador/jsonP/json5.json";

        try {
            URL url = new URL(URLAPI);
            URLConnection conexion = url.openConnection();

            Reader reader = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(reader);

            String linea = "a";
            int veces = 0;
            while((linea = br.readLine()) != null){

                System.out.println(linea);
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
