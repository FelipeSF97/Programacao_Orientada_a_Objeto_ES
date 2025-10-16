public class RelatorioFinanceiro implements Agendavel{
    private Status status;
    private String horarioAgendado;
    
    public RelatorioFinanceiro(){
        this.status = status.INDEFINIDA;
    }
    @Override
    public void agendar(String horario){
        this.status = Status.AGENDADA;
        this.horarioAgendado = horario;
        System.out.printf("Emissão do relatório financeiro agendado para: %s", horario);
    }
    @Override
    public Status monitorar(){
        return status;
    }
    @Override
    public void executar(){
        this.status = Status.EXECUÇÃO;
        System.out.printf("Gerando relatório financeiro... \n");
        this.status = Status.CONCLUÍDA;
    }
}
