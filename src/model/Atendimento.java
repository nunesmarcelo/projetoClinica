package model;

public class Atendimento {
    private String id;
    private String horario;
    private String dia;
    private String especialidade;
    private String exame;
    private String tipo;
    private String id_medico;
    private String id_cliente;
    private String nomeMedico;
    private String nomeCliente;
    
    public Atendimento(){
        
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId_medico() {
        return id_medico;
    }

    public void setId_medico(String id_medico) {
        this.id_medico = id_medico;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getResumo() {
    	if(this.getEspecialidade() == null) {
	    	return (this.getId()+" "+
					this.getExame()+" "+
					this.getDia()+" ");
    	}
    	return (this.getId()+" "+
				this.getEspecialidade()+" "+
				this.getDia()+" ");
    }
	@Override
	public String toString() {
		if(this.getEspecialidade() != null){
                    return "Area:"+this.getEspecialidade();
                }
                else{
                    return "Exame:"+this.getExame();
                }
	}
    
}
