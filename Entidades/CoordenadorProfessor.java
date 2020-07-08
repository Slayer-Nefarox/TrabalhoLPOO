package Entidades;

public abstract class CoordenadorProfessor {

	private Professor professor;
	private Coordenador coordenador;
	
	public CoordenadorProfessor(Professor professor, Coordenador coordenador) {
		setProfessor(professor);
		setCoordenador(coordenador);
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	
	
	
	

}
