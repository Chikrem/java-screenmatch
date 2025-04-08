public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "A Origem";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 8.8;
        meuFilme.totalDeAvaliacoes = 1000000;
        meuFilme.duracaoEmMinutos = 148;

        System.out.println("Nome: " + meuFilme.nome);
        System.out.println("Ano de Lançamento: " + meuFilme.anoDeLancamento);
    }
}