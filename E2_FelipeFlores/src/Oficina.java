import java.util.List;

public class Oficina extends Evento{
    public String nomeMentor;
    public String descricaoAtividade;
    public List<String> tecnologia;

public Oficina(int codigo, String titulo, String nomeProfessor, int numParticipantes,
                String nomeMentor, String descricaoAtividade, List<String> tecnologia){
    super(codigo, titulo, nomeProfessor, numParticipantes);
    this.nomeMentor = nomeMentor;
    this.descricaoAtividade = descricaoAtividade;
    this.tecnologia = tecnologia;
}
public String getNomeMentor(){
    return nomeMentor;
}
public String getDescricaoAtividade(){
    return descricaoAtividade;
}
public List<String> getTecnologia(){
    return tecnologia;
}
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
        sb.append("OFICINA");
        sb.append("Código da Oficina: ").append(getCodigo());
        sb.append("Título: ").append(getTitulo());
        sb.append("Professor Responsável: ").append(getNomeProfessor());
        sb.append("Número de Participantes: ").append(getNumParticipantes());
        sb.append("Mentor da oficina: ").append(getNomeMentor());
        sb.append("Descrição das atividades: ").append(getDescricaoAtividade());
        sb.append("Tecnologias trabalhadas: ").append(getTecnologia());
        return sb.toString();
}
public boolean contemPalavra(String palavra) {
        palavra = palavra.toLowerCase();
        if (super.contemPalavra(palavra) || nomeMentor.toLowerCase().contains(palavra) ||
         descricaoAtividade.toLowerCase().contains(palavra)) {
            return true;
        }
        for (String tec : tecnologia) {
            if (tec.toLowerCase().contains(palavra)) {
                return true;
            }
        }
        return false;
    }
}