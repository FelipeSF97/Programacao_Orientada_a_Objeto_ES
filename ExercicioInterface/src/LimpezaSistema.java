public class LimpezaSistema implements Agendavel{
    private Status status;
    private String horarioAgendado;
    
    public LimpezaSistema(){
        this.status = status.INDEFINIDA;
    }
    @Override
    public void agendar(String horario){
        this.status = Status.AGENDADA;
        this.horarioAgendado = horario;
        System.out.printf("Limpeza do sistema agendada para: %s", horario);
    }
    @Override
    public Status monitorar(){
        return status;
    }
    @Override
    public void executar(){
        this.status = Status.EXECUÇÃO;
        System.out.printf("Limpando arquivos temporários e dados obsoletos dos sistema...\n");
        this.status = Status.CONCLUÍDA;
    }
}
