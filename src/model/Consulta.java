package model;

public class Consulta {
    private String id;
    private String horario;
    private String dia;
    private String especialidade;
    private String exame;
    private String tipo;
    private String id_medico;
    private String id_cliente;
    
    public Consulta(){
        
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
    
    
}
