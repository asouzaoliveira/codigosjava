package ExerciciosDio;

import java.util.Comparator;

public class ComparadorCores implements Comparator<Cores>{

	@Override
	public int compare(Cores c1, Cores c2) {
		
		return c1.getCor().compareToIgnoreCase(c2.getCor());
	}

	
	
	
	

}
