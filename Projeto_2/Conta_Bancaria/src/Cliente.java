public class Cliente {
    String titular;
    String endereco;
    int telefone;
    String email;

    public Cliente(String endereco, int telefone, String email) {

        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String Titular) {
        this.titular = Titular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
