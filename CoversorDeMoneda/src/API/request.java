package API;

import com.conversion.moneda.Moneda;
import com.conversion.moneda.recordMoneda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class request {

    //Clase que realiza la conversion y retorna los datos a recordMoneda
    public static Moneda cambioDeMoneda(String base_code, String target_code, Double monto) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/8b1e5e4b5a5b9964df23bbef/pair/"+base_code+"/"+target_code+"/"+monto;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting().create();

        recordMoneda resultadoRecord = gson.fromJson(json, recordMoneda.class);
        return new Moneda(resultadoRecord);
    }
}
