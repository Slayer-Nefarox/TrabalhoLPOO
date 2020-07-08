package Entidades;

public class Pessoa {

	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String nascimento;
	protected Instituicao instituicao; 
	
	public Pessoa(String nome, String cpf, String telefone, String endereco, String nascimento) {
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
		setEndereco(endereco);
		setNascimento(nascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		if(cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-' && cpf.length() == 14) {
			this.cpf = cpf;
			return true;
		}
		else{
			System.out.println("CPF Invalido!");
			return false;			
		}
		
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		// x x x . x x x . x x x  -  x  x
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean setTelefone(String telefone) {
		if(telefone.charAt(0) == '(' && telefone.charAt(3) == ')' && telefone.charAt(9) == '-' && telefone.length() == 14 ){
			this.telefone = telefone;
			return true;
		}
		else{
			System.out.println("Telefone Invalido!");
			return false;			
		}
		
		//	0 1 2 3 4 5 6 7 8 9 10 11 12 13
		//  ( x x ) x x x x x - x  x  x  x
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNascimento() {
		return nascimento;
	}

	public boolean setNascimento(String nascimento) {
		if(nascimento.charAt(2) == '/' && nascimento.charAt(5) == '/' && nascimento.length() == 10) {
			this.nascimento = nascimento;
			return true;
		}
		else{
			System.out.println("Data de nascimento Invalida!");
			return false;			
		}
		
		// 0 1 2 3 4 5 6 7 8 9
		// x x / x x / x x x x
	}
}

// Verificar se o resto é numero ( setNascimento() , setTelefone() , setCpf() );

