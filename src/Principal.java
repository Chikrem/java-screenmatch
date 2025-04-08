public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "A Origem";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.incluidoNoPlano = true;
        meuFilme.totalDeAvaliacoes = 1;
        meuFilme.duracaoEmMinutos = 148;

        // Chama método que exibe a ficha técnica do filme
        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(6.7);
        
        meuFilme.exibeFichaTecnica();
    }
}