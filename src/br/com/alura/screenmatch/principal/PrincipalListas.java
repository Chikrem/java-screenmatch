package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("A Origem", 2010, true, 148, "Christopher Nolan");

        Filme outroFilme = new Filme("Avatar", 2009, true, 180, "James Cameron");

        Filme novoFilme = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001, true, 160, "Peter Jackson");

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        Serie minhaSerie = new Serie("Game of Thrones", 2011, false, 60, 8, 10, 60, true);

        listaDeFilmes.add(minhaSerie);

        outroFilme.avalia(8.0);
        meuFilme.avalia(9.0);
        novoFilme.avalia(7.0);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        for (Titulo titulo : listaDeFilmes) {
            // System.out.println(listaDeFilmes.get(i).getNome());
            System.out.print(titulo);
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(" Classificação: " + filme.getClassificacao());
                }
        }

        System.out.println("\n*************************************************************");

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeFilmes);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        for (Titulo titulo : listaDeFilmes) {
            // System.out.println(listaDeFilmes.get(i).getNome());
            System.out.print(titulo);
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(" Classificação: " + filme.getClassificacao());
                }
        };

        listaDeFilmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeFilmes);
    }
}