public class ClienteJuridico extends Cliente {

	private double mensalidade;

	public ClienteJuridico(String nome, double mensalidade) {
		super(nome);
		this.mensalidade = mensalidade;
	}

	@Override
	public double getMensalidade() {
		return this.mensalidade;
	}

}
