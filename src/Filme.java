public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluído no Plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + somaDasAvaliacoes / totalDeAvaliacoes);
        System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    int getTotalAvaliacoes() {
        return totalDeAvaliacoes;
    }

    double getSomaAvaliacoes() {
        return somaDasAvaliacoes;
    }

}
