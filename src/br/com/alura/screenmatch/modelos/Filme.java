package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme (
        String nome, 
        int anoDeLancamento, 
        boolean incluidoNoPlano, 
        int duracaoEmMinutos,  
        String diretor) {
        super(nome, 
        anoDeLancamento, 
        incluidoNoPlano, 
        duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Diretor: " + diretor);
    }

    @Override
    public int getClassificacao() {
        return (int) getMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
