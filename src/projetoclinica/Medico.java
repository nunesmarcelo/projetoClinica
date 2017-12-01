package projetoclinica;

import java.util.ArrayList;

public class Medico extends Funcionario{
    private String crm;
    private String especialidade;
    private String salario;
    private ArrayList<String> atendimentos;
    
    public Medico(){
        
    }
    
    public Medico(String nome,String cpf,String rg,String endereco,String bairro,String cidade,String celular,String telefone,String email,String dataNasc, String crm,String especialidade,String salario){
        super(nome,cpf,rg,endereco,bairro,cidade,celular,telefone,email,dataNasc);
        this.setEspecialidade(especialidade);
        this.setCrm(crm);
        this.setSalario(salario);
    }
    
    public Medico(String crm, String especialidade, String salario){
        
    }
    
    
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public ArrayList<String> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<String> atendimentos) {
        this.atendimentos = atendimentos;
    }
    
    
}
