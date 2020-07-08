package Entidades;

public class Professor {

	private String graduacao;
	
	public Professor(String graduacao) {
		setGraduacao(graduacao);
	}

	public String getGraduacao() {
		return graduacao; 
	}

	public void setGraduacao(String graduacao) {
		if(graduacao == "Superior" || graduacao == "Mestrado" || graduacao == "Doutorado") {
			this.graduacao = graduacao;
		}
	}
}
