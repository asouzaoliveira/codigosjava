package execicios;

public class Serie implements Comparable<Serie> {
	
	public String nome;
	public String genero;
	public int tempoEpisodio;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(int tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	public Serie(String nome, String genero, int tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	@Override
	public String toString() {
		return "nome = " + nome + ", genero = " + genero + ", tempoEpisodio = " + tempoEpisodio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + tempoEpisodio;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempoEpisodio != other.tempoEpisodio)
			return false;
		return true;
	}
	@Override
	public int compareTo(Serie serie) {
		
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
		if(tempoEpisodio!=0) {
			return tempoEpisodio;
		}
		
		return this.getGenero().compareTo(serie.getGenero()); 
	}
	
	
	
	

}
