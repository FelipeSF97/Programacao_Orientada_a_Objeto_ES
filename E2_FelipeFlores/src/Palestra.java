public class Palestra extends Evento{
    public String palestrante;
    public String titulacao;
    public String biografia;

    public Palestra(int codigo, String titulo, String nomeProfessor, int numParticipantes, 
            String palestrante, String titulacao, String biografia){
        super(codigo, titulo, nomeProfessor, numParticipantes);
        this.palestrante = palestrante;
        this.titulacao = titulacao;
        this.biografia = biografia;
    }
    public String getPalestrante(){
        return palestrante;
    }
    public String getTitulacao(){
        return titulacao;
    }
    public String getBiografia(){
        return biografia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PALESTRA");
        sb.append("Código da Palestra: ").append(getCodigo());
        sb.append("Título: ").append(getTitulo());
        sb.append("Professor Responsável: ").append(getNomeProfessor());
        sb.append("Número de Participantes: ").append(getNumParticipantes());
        sb.append("Palestrante: ").append(getPalestrante());
        sb.append("Titulação do Palestrante: ").append(getTitulacao());
        sb.append("Biografia do Palestrante: ").append(getBiografia());
        return sb.toString();
    }
    public boolean contemPalavra(String palavra) {
        return super.contemPalavra(palavra) || palestrante.toLowerCase().contains(palavra.toLowerCase()) ||
        titulacao.toLowerCase().contains(palavra.toLowerCase()) || biografia.toLowerCase().contains(palavra.toLowerCase());
    }
}
