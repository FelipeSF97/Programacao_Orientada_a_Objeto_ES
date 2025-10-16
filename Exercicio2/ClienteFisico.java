public class ClienteFisico extends Cliente {

	private int idade;
	private double salario;

	public ClienteFisico(String nome, int idade, double salario) {
		super(nome);
		this.idade = idade;
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public double getMensalidade() {
		double percentual = (idade < 60) ? 10.0 : 15.0;

		return this.salario * percentual / 100;
	}

}