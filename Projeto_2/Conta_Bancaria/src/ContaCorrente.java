public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComum();
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }


}

