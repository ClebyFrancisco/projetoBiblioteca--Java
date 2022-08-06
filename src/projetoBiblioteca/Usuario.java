package projetoBiblioteca;

public class Usuario {
	private String nome;
	private int cpf;
	private String tel;
	private String matricula;
	public Usuario(String nome, int cpf, String tel, String matricula) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String exibir() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", tel=" + tel + ", matricula=" + matricula + "]";
	}
	
	

}
