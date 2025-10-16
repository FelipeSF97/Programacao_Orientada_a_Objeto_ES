import java.util.LinkedList;
import java.util.List;

public class SistemaDeTarefas {
    private List<Agendavel> tarefas;

    public SistemaDeTarefas(){
        tarefas = new LinkedList<Agendavel>();
    }
    public void adicionarTarefa(Agendavel tarefa){
        tarefas.add(tarefa);
    }
    public void executarTodas(){
        for(Agendavel t : tarefas ){
            t.executar();
        }
    }
    public void monitorarTarefas(){
        for(Agendavel t : tarefas){
            System.out.printf("A tarefa está %s para %s\n", t, t.monitorar());
        }
    }
}
