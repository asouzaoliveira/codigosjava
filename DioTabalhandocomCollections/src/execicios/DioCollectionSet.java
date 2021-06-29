package execicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DioCollectionSet {
	
	/*Dadas as informa��es de minhas series favoritas, crie um conjunto e ordene este conjunto
	 * exibindo :(nome - genero - tempo de episodio)
	 * 
	 * 
	 * 
	 S�rie 1 = Nome: got , genero: fantasia, tempoEpisodio: 60
	 S�rie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
	 S�rie 3 = Nome: that '70s show, genero: com�dia, tempoEpisodio: 25*/

	public static void main(String[] args) {
		
		
		
	
		System.out.println("--\tOrdem Aleat�ria\t--");
		
		Set<Serie>minhasSeries = new HashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "com�dia", 25));
		}};
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() +" - "+serie.getTempoEpisodio() );
		}
		System.out.println("=================================================================================================");
		System.out.println("--\tOrdem Inser��o\t--");
		
		Set<Serie>minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "com�dia", 25));
		}};
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() +" - "+serie.getTempoEpisodio() );
		}
		
		System.out.println("=================================================================================================");
		
		System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
		Set<Serie>minhasSeries2 = new TreeSet<>(minhasSeries);
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() +" - "+serie.getTempoEpisodio() );
		}
		
		System.out.println("=================================================================================================");
		System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
		Set<Serie>minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		
		minhasSeries3.addAll(minhasSeries);

		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() +" - "+serie.getTempoEpisodio() );
		}
		
		
		System.out.println("=================================================================================================");
		
		System.out.println("--\tOrdem Genero\t--");
		Set<Serie>minhasSeries4 = new TreeSet<>(new ComparatorGenero());
		
		minhasSeries4.addAll(minhasSeries);

		for (Serie serie : minhasSeries4) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() +" - "+serie.getTempoEpisodio() );
		}
		
		
		

	}

	

}
