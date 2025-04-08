package br.com.alura.screenmatch.modelos;
public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    public int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluído no Plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + somaDasAvaliacoes / totalDeAvaliacoes);
        System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public int getTotalAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaAvaliacoes() {
        return somaDasAvaliacoes;
    }

}
