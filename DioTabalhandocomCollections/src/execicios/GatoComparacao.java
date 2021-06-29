package execicios;

import java.util.Comparator;

public class GatoComparacao implements Comparator<Gatos> {

	@Override
	public int compare(Gatos o1, Gatos o2) {
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}


}
