package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.duracaoEmMinutos = duracaoEmMinutos;

    }
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluído no Plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + getMedia());
        System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
        if (this.duracaoEmMinutos > 0) {
            System.out.println("Duração em Minutos: " + duracaoEmMinutos);
        }
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double getMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public int setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        return anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
        return incluidoNoPlano;
    }

    public int setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
        return duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

}
