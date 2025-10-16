public class BackupDeDados implements Agendavel{
    private String caminhoOrigem;
    private String caminhoDestino;
    private Status status;
    private String horarioAgendado;
    
    public BackupDeDados(String caminhoOrigem, String caminnhoDestino){
        this.caminhoOrigem = caminhoOrigem;
        this.caminhoDestino = caminnhoDestino;
        this.status = status.INDEFINIDA;
    }
    @Override
    public void agendar(String horario){
        this.status = Status.AGENDADA;
        this.horarioAgendado = horario;
        System.out.printf("Backup de dados agendado para: %s", horario);
    }
    @Override
    public Status monitorar(){
        return status;
    }
    @Override
    public void executar(){
        this.status = Status.EXECUÇÃO;
        System.out.printf("Copiando os arquivos de %s para %s\n", caminhoOrigem, caminhoDestino);
        this.status = Status.CONCLUÍDA;
    }
}
