package Entidades;

public class Departamento {
	private String nome;
	private String id;
	private Instituicao instituicao;
	private Diretor diretor;
	
	public Departamento(String nome, String id, Instituicao instituicao, Diretor diretor) {
		setNome(nome);
		setId(id);
		setInstituicao(instituicao);
		setDiretor(diretor);
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
		if(id.charAt(0) == 'D' && id.length() == 4) {	
			this.id = id;
			return true;
		}
		
		else {
			System.out.println("Id Invalido!");
			return false;
		}
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	// Verificar se o resto é numero ( setId() );
	
}
