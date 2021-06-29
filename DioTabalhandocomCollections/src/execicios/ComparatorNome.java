package execicios;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNome implements Comparator<Map.Entry<String, Livros>> {

	@Override
	public int compare(Entry<String, Livros> l1, Entry<String, Livros> l2) {
		
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}

	
	
	

}
