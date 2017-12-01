package projetoclinica;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String bairro;
    private String cidade;
    private String celular;
    private String telefone;
    private String email;
    private String dataNasc;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome){
        this.setNome(nome);
    }
    
    public Funcionario(String nome, String cpf , String rg, String endereco, String bairo, String cidade, String celular, String telefone, String email, String dataNasc){
        this.setBairro(bairro);
        this.setCelular(celular);
        this.setCidade(cidade);
        this.setCpf(cpf);
        this.setDataNasc(dataNasc);
        this.setEmail(email);
        this.setEndereco(endereco);
        this.setNome(nome);
        this.setRg(rg);
        this.setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}
