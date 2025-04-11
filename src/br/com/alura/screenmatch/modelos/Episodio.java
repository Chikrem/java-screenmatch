package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio extends Serie implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public Episodio(
        String nome, 
        int anoDeLancamento, 
        boolean incluidoNoPlano, 
        int duracaoEmMinutos, 
        int temporadas,
        int episodiosPorTemporada, 
        int minutosPorEpisodio, 
        boolean ativa) 
        {
        super(nome, 
        anoDeLancamento, 
        incluidoNoPlano, 
        duracaoEmMinutos, temporadas, 
        episodiosPorTemporada,
        minutosPorEpisodio,
        ativa);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNomeEp(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
