package model;

public class Exame{
    private int id;
    private String nome;
    
    public Exame(){
        
    }
    
    public Exame(String nome){
        super();
        this.setNome(nome);
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
    public String toString(){
        return this.getNome();
    }
}
