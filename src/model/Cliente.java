package model;

public class Cliente extends Pessoa{
       
    public Cliente(){
        super();
    }
    
    public Cliente(String nome, String cpf , String rg, String endereco, String bairo, String cidade, String celular, String telefone, String email, String dataNasc){
        super( nome,  cpf ,  rg, endereco,  bairo,  cidade,  celular, telefone, email, dataNasc);
    }
}
