
public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Integer altura;
	private Integer cpf;
	private Integer cep;
	private Integer telefone;
	private String sexo;
	public Pessoa(String nome, Integer idade, Integer altura, Integer cpf, Integer cep, Integer telefone, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.cpf = cpf;
		this.cep = cep;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	public Pessoa() { // Método constructor vazio 
		super();
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
