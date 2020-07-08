package Entidades;

public class Instituicao {

	private String nome;
	private String cnpj;

	public Instituicao(String nome, String cnpj) {
		setNome(nome);
		setCnpj(cnpj);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public boolean setCnpj(String cnpj) {
		if (cnpj.charAt(3) == '.' && cnpj.charAt(7) == '.' && cnpj.charAt(11) == '-' && cnpj.length() == 14) {
			this.cnpj = cnpj;
			return true;
		}
		else {
			System.out.println("CNPJ Invalido!");
			return false;
		}


		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		// x x x . x x x . x x x  -  x  x
	}

}

// Verificar se o resto é numero ( setCnpf() );
