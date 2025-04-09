package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por Temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por Episódio: " + minutosPorEpisodio);
        System.out.println("Duração total: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("Ativa: " + ativa);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorTemporada() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorTemporada(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
 
    public int getDuracaoEmMinutos() {
        return this.episodiosPorTemporada * this.temporadas * this.minutosPorEpisodio;  
    }

    
}
