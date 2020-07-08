package Entidades;

public class Curso {

	private String nome;
	private String id;
	private Departamento departamento;
	private Coordenador coordenador;
	
	public Curso(String nome, String id, Departamento departamento, Coordenador coordenador) {
		setNome(nome);
		setId(id);
		setDepartamento(departamento);
		setCoordenador(coordenador);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public boolean setId(String id) {
		if(id.charAt(0) == 'C' && id.length() == 4) {	
			this.id = id;
			return true;
		}
		
		else {
			System.out.println("Id Invalido!");
			return false;
		}
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Coordenador getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
}

//Verificar se o resto é numero ( setId() );
