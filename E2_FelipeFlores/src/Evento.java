public abstract class Evento {
    private int codigo = 0;
    private String titulo;
    private String nomeProfessor;
    private int numParticipantes;

    public Evento(int codigo, String titulo, String nomeProfessor, int numParticipantes){
        this.codigo = codigo++;
        this.titulo = titulo;
        this.nomeProfessor = nomeProfessor;
        this.numParticipantes = numParticipantes;
    }

    public int getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getNomeProfessor(){
        return nomeProfessor;
    }
    public int getNumParticipantes(){
        return numParticipantes;
    }

    public abstract String toString();

    public boolean contemPalavra(String palavra) {
        palavra = palavra.toLowerCase();
        return titulo.toLowerCase().contains(palavra) || nomeProfessor.toLowerCase().contains(palavra);
    }
}
