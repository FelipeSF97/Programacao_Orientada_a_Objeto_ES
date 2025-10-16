public class App {
    public static void main(String[] args) throws Exception {
        BackupDeDados bk = new BackupDeDados("home", "PUCRS");
        RelatorioFinanceiro rf = new RelatorioFinanceiro();
        LimpezaSistema ls = new LimpezaSistema();
        SistemaDeTarefas st = new SistemaDeTarefas();

        st.adicionarTarefa(bk);
        st.adicionarTarefa(rf);
        st.adicionarTarefa(ls);
        st.monitorarTarefas();
        bk.agendar("12:00");
        rf.agendar("14:00");
        ls.agendar("18:00");
    }
}
