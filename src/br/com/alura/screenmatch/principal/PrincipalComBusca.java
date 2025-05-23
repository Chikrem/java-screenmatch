package br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TitulosOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        try (Scanner leitura = new Scanner(System.in)) {

            String busca = "";
            List<Titulo> titulos = new ArrayList<>();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

            while (!busca.equals("sair")) {
                System.out.println("Digite 'sair' para encerrar o programa ou pressione Enter para continuar.");
                
                busca = leitura.nextLine();
                if (busca.equals("sair")) {
                    break;
                }

                System.out.println("Digite o nome do filme que deseja buscar: ");
                var nomeDoFilme = leitura.nextLine().replace(" ", "+");
                System.out.println("Buscando informações sobre o filme " + nomeDoFilme + "...");
    
                String endereco = "https://www.omdbapi.com/?t=" + nomeDoFilme + "&apikey=8b3fffff";
    
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
    
                String json = response.body();
    
                TitulosOmdb meuTituloOmdb = gson.fromJson(json, TitulosOmdb.class);
                System.out.println(json);
    
                System.out.println("Título: " + meuTituloOmdb);
    
                try {
                    Titulo meuTitulo = new Titulo(meuTituloOmdb);
                    System.out.println("Título: " + meuTitulo);
    
                    // FileWriter escritor = new FileWriter("filmes.txt", true);
                    // escritor.write("\n Título: " + meuTitulo.toString());
                    // escritor.close();
                    // System.out.println("Título salvo com sucesso!");

                    titulos.add(meuTitulo);
                    System.out.println("Título adicionado à lista de títulos.");
    
                } catch (ErroDeConversaoDeAnoException e) {
                    System.out.println(e.getMessage());
                } catch (NullPointerException e) {
                    System.out.println("Erro ao converter o título do filme.");
                } catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                }
            }

            System.out.println(titulos);

            FileWriter escrita = new FileWriter("filmes.json");
            escrita.write(gson.toJson(titulos));
            escrita.close();

        } catch (NumberFormatException e) {
            System.out.println("Erro ao ler a entrada do usuário: " + e.getMessage());
        } finally {
            System.out.println("Programa encerrado.");
        }
    } 
}