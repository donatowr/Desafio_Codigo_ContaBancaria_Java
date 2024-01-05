import java.util.ArrayList;
import java.util.List;

public abstract class Banco {
    public String nome;
    private List<Conta> contas;
    protected Cliente cliente;

    public Banco (Cliente cliente){
        this.cliente = cliente;
        this.nome = "Don Bank";
    }




    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }



    protected void imprimirDadosCliente(Cliente Cliente){
        System.out.println();
        System.out.println("=== Imprimindo Dados do Cliente ===");
        System.out.println(this.nome);
        System.out.printf("Titular: %s\n",this.cliente.getTitular());
        System.out.printf("Endereço: %s\n",this.cliente.getEndereco());
        System.out.printf("E-mail: %s\n",this.cliente.getEmail());
        System.out.printf("Telefone %s",this.cliente.getTelefone());
    }

    public void listarContas() {
       List<Conta> contas = new ArrayList<Conta>();

        System.out.println();
        System.out.println("=== Listar Contas ===");
        System.out.println(contas);
    }

}
