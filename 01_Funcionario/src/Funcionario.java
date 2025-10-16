public class Funcionario {

	private int anoContratacao;

	private String nome;

	private double salario;

	public Funcionario(String nome, int anoContratacao, double salario) {
		this.nome = nome;
		this.anoContratacao = anoContratacao;
		this.salario = salario;
	}

	public int getAnoContratacao() {
		return anoContratacao;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public boolean setSalario(double novoSalario) {
		if(novoSalario > 0.0 && novoSalario > this.salario){
			this.salario = novoSalario;
			return true;
		}else{
			return false;
		}
	}

}
