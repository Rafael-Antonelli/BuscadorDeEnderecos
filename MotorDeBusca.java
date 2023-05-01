import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MotorDeBusca {

    String cep;


    public void getLocalidade() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create("https://viacep.com.br/ws/"+cep+"/json/"))
                 .build();

         HttpResponse<String> response = client
                 .send(request, HttpResponse.BodyHandlers.ofString());

         Gson gson = new Gson();
         Endereco endereco = gson.fromJson(response.body(), Endereco.class);


        System.out.println("*********************************");
        System.out.println("Rua : " + endereco.getLogradouro());
        System.out.println("Bairro : " + endereco.getBairro());
        System.out.println("Cidade : " + endereco.getLocalidade());
        System.out.println("*********************************");

    }


    public void setCep(String cep) {
        this.cep = cep;
    }

}
