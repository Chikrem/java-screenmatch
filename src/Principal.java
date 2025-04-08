import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "A Origem";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.incluidoNoPlano = true;
        meuFilme.totalDeAvaliacoes = 1;
        meuFilme.duracaoEmMinutos = 148;

        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(6.7);
        
        // Chama método que exibe a ficha técnica do filme
        meuFilme.exibeFichaTecnica();

        System.out.println("****************************************");

        System.out.println(meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.getTotalAvaliacoes());
    }
}