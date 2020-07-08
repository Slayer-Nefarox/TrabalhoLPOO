public abstract class Coordenador_Professor extends Pessoa
{
	Professor professor;
	Coordenador coordenador;
	public Coordenador_Professor(String a, String b, String c, String d, String e, Professor x, Coordenador y)
	{
		super(a, b, c, d, e);
		setProfessor(x);
		setCoordenador(y);
	}
	//setter e getter
	public void setProfessor(Professor x)
	{
		this.professor = x;
	}
	public Professor getProfessor()
	{
		return this.professor;
	}	
	public void setCoordenador(Coordenador x)
	{
		this.coordenador = x;
	}
	public Coordenador getCoordenador()
	{
		return this.coordenador;
	}
}
