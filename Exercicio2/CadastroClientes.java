import java.util.ArrayList;

public class CadastroClientes {
    private ArrayList<Cliente> clientes;

    public CadastroClientes() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public double getMediaMensalidade() {
        double total = 0;
        if (clientes.size() == 0) {
            return 0.0;
        }

        for (Cliente c : clientes) {
            total += c.getMensalidade();
        }

        return total / clientes.size();
    }

    public String getClientesTexto() {
        StringBuilder resultado = new StringBuilder();

        for (Cliente c : clientes) {
            resultado.append(c.getNome());
            resultado.append(", R$ ");
            resultado.append(c.getMensalidade());
            resultado.append("\n");
        }

        return resultado.toString();
    }

}
