package execicios;

public class Gatos implements Comparable<Gatos>{
	
	public String nome;
	public int idade;
	public String cor;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "nome= " + nome + ", idade= " + idade + ", cor= " + cor;
		
	
	}
	
	public Gatos() {
		
	}
	
	public Gatos(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int compareTo(Gatos gato) {
		
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}
