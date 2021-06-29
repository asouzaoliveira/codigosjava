package execicios;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPaginas implements Comparator<Map.Entry<String, Livros>> {

	@Override
	public int compare(Entry<String, Livros> l1, Entry<String, Livros> l2) {
		
		
		
		return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
	}
	
	

}
