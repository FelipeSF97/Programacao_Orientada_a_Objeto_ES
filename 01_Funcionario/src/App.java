public class App {
    public static void main(String[] args) {
    
        Funcionario f1 = new Funcionario("Felipe Flores", 2025, 1500.00);
        Funcionario f2 = new Funcionario("Eduarda Vitoria", 2020, 1900.00);

        System.out.println(f1.getNome() + "(contratado em " + f1.getAnoContratacao() + ") salário de R$" + f1.getSalario());
        System.out.println(f2.getNome() + "(contratada em " + f2.getAnoContratacao() + ") salário de R$" + f2.getSalario());

        boolean salarioAtualizado = f1.setSalario(2500.00);
        if(salarioAtualizado){
                System.out.println("O novo salário de " + f1.getNome() + " é: R$" + f1.getSalario());
        }else{
                System.out.println("Erro ao atualizar salário.");
        }
    }
}
