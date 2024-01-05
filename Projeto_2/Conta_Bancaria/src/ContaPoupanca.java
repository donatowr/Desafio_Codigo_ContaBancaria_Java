public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {

        System.out.println("=== Extrato Conta Poupança ===");
       super.imprimirInfosComum();
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
}
