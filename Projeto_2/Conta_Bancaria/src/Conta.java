public abstract class Conta implements IConta {


    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agecia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double bitcoin;

    public Conta(Cliente cliente){
        this.agecia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgecia() {
        return agecia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getbitcoin() {
        return bitcoin;
    }


    @Override
    public void sacar(double valor) {
this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
this.sacar(valor);
contaDestino.depositar(valor);
    }

    public void depositarBitcoin(double valor){
        this.bitcoin += valor;
    }

    protected void imprimirInfosComum() {
        System.out.printf("Titular: %s%n", this.cliente.getTitular());
        System.out.printf("Endereço: %s%n", this.cliente.getEndereco());
        System.out.printf("E-mail: %s%n", this.cliente.getEmail());
        System.out.printf("Agencia: %d%n", this.agecia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

protected void imprimirInvestimentos(){
    System.out.printf("Bitcoins: %.2f", this.bitcoin);
}




}
