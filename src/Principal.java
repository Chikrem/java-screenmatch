// Final Curso-1

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // Filme meuFilme = new Filme();
        // meuFilme.setNome("A Origem");
        // meuFilme.setAnoDeLancamento(2010);
        // meuFilme.setIncluidoNoPlano(true);
        // // meuFilme.totalDeAvaliacoes = 1;
        // meuFilme.setDuracaoEmMinutos(148);
        // meuFilme.setDiretor("Christopher Nolan");

        // meuFilme.avalia(8.5);
        // meuFilme.avalia(10);
        // meuFilme.avalia(10);
        // meuFilme.avalia(6.7);

        // // Chama método que exibe a ficha técnica do filme
        // meuFilme.exibeFichaTecnica();

        // CalculadoraDeTempo calculo = new CalculadoraDeTempo();
        // calculo.inclui(meuFilme);
        // calculo.inclui(meuFilme);

        System.out.println("****************************************");

        // // System.out.println(meuFilme.getSomaAvaliacoes());
        // // System.out.println(meuFilme.getTotalAvaliacoes());
        // Serie minhaSerie = new Serie();
        // minhaSerie.setNome("Game of Thrones");
        // minhaSerie.setAnoDeLancamento(2011);
        // minhaSerie.setIncluidoNoPlano(false);
        // minhaSerie.setTemporadas(8);
        // minhaSerie.setEpisodiosPorTemporada(10);
        // minhaSerie.setMinutosPorTemporada(60);
        // minhaSerie.setAtiva(false);
        // minhaSerie.avalia(9.5);
        // minhaSerie.avalia(8);
        // System.out.println("****************************************");

        // minhaSerie.exibeFichaTecnica();

        // System.out.println("****************************************");

        // calculo.inclui(minhaSerie);
        // calculo.getTempoTotal();
        // System.out.println("****************************************");

        // FiltroRecomendacao filtro = new FiltroRecomendacao();
        // filtro.filtra(meuFilme);
        System.out.println("****************************************");

        Filme meuFilme = new Filme("A Origem", 2010, true, 148, "Christopher Nolan");

        Filme outroFilme = new Filme("Avatar", 2009, true, 180, "James Cameron");

        Filme novoFilme = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001, true, 160, "Peter Jackson");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(novoFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            // System.out.println(listaDeFilmes.get(i).getNome());
            System.out.println(listaDeFilmes.get(i).toString());
        }

        System.out.println("****************************************");
        meuFilme.avalia(8.5);
        meuFilme.avalia(9);
        meuFilme.exibeFichaTecnica();

    }
}