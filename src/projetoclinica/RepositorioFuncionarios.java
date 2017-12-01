
package projetoclinica;

import java.util.ArrayList;

public class RepositorioFuncionarios {
    private ArrayList<Medico> medicos;
    
    public RepositorioFuncionarios(){
        medicos = new ArrayList<Medico>();
    }
    
    public void AdicionarMedico(){
        //CRIA UM NOVO FORMULÁRIO PARA CADASTRO DE MÉDICO QUE CONTERÁ AS INFORMAÇÕES NOS GET'S DELE.
        CadastroMedico cadastro = new CadastroMedico();
        cadastro.setVisible(true);
        //ADICIONA UM NOVO MÉDICO NO ARRAYLIST, PEGANDO OS DADOS DE NOME E ESPECIALIDADE DO FORMULADRIO "CADASTRO" ACIMA.
        medicos.add(new Medico(cadastro.getNome(),cadastro.getCpf(),cadastro.getRg(),cadastro.getEndereco(),cadastro.getBairro(),cadastro.getCidade(),cadastro.getCelular(),cadastro.getTelefone(),cadastro.getEmail(),cadastro.getDataNasc(),cadastro.getCrm(), cadastro.getEspecialidade(),cadastro.getSalario()));
    }
    
    public void RemoveMedico(){
        //Criar
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }
    
    
}
