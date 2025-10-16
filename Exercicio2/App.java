public class App {

    public static void main(String[] args) {

        CadastroClientes meuCadastroClientes = new CadastroClientes();

        ClienteFisico c1 = new ClienteFisico("Ana", 18, 4910.31);
        ClienteFisico c2 = new ClienteFisico("Maria", 22, 3985.26);

        ClienteJuridico c3 = new ClienteJuridico("PUCRS", 250.0);

        meuCadastroClientes.adicionarCliente(c1);
        meuCadastroClientes.adicionarCliente(c2);
        meuCadastroClientes.adicionarCliente(c3);

        double mediaMensalidade = meuCadastroClientes.getMediaMensalidade();

        String resultado = meuCadastroClientes.getClientesTexto();
        System.out.println(resultado);
        System.out.printf("Os clientes pagam em media R$ %2f \n", mediaMensalidade);
    }
}
