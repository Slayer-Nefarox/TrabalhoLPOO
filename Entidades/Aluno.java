package Entidades;

public class Aluno {
	
	private String rga;
	private Curso curso;
	
	public Aluno(String rga, Curso curso) {
		setRga(rga);
		setCurso(curso);
	}

	public String getRga() {
		return rga;
	}

	public boolean setRga(String rga) {
		if ( rga.charAt(4) == '.' && rga.charAt(9) == '.' && rga.charAt(13) == '-' && rga.length() == 15 ) {
			this.rga = rga;
			return true;
		}
		else {
			System.out.println("RGA Invalido!");
			return false;
		}

		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
		// x x x x . x x x x . x  x  x  -  x
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
