package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TitulosOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite o nome do filme que deseja buscar: ");
            var nomeDoFilme = leitura.nextLine();
            System.out.println("Buscando informações sobre o filme " + nomeDoFilme + "...");

            String endereco = "https://www.omdbapi.com/?t=" + nomeDoFilme + "&apikey=8b3fffff";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // System.out.println(response.body());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TitulosOmdb meuTituloOmdb = gson.fromJson(json, TitulosOmdb.class);
            System.out.println("Título: " + meuTituloOmdb);
            
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Título: " + meuTitulo);

        }
    }
}