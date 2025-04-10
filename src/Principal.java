// Final Curso-1

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("A Origem");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setIncluidoNoPlano(true);
        // meuFilme.totalDeAvaliacoes = 1;
        meuFilme.setDuracaoEmMinutos(148);
        meuFilme.setDiretor("Christopher Nolan");

        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(6.7);
        
        // Chama método que exibe a ficha técnica do filme
        meuFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculo = new CalculadoraDeTempo();
        calculo.inclui(meuFilme);
        calculo.inclui(meuFilme);

        
        System.out.println("****************************************");
        
        // System.out.println(meuFilme.getSomaAvaliacoes());
        // System.out.println(meuFilme.getTotalAvaliacoes());
        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Game of Thrones");
        minhaSerie.setAnoDeLancamento(2011);
        minhaSerie.setIncluidoNoPlano(false);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorTemporada(60);
        minhaSerie.setAtiva(false);
        minhaSerie.avalia(9.5);
        minhaSerie.avalia(8);
        System.out.println("****************************************");
        
        minhaSerie.exibeFichaTecnica();
        
        System.out.println("****************************************");
        
        calculo.inclui(minhaSerie);
        calculo.getTempoTotal();
        System.out.println("****************************************");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

    }
}