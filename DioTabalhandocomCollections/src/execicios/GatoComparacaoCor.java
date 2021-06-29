package execicios;

import java.util.Comparator;

public class GatoComparacaoCor implements Comparator<Gatos> {

	@Override
	public int compare(Gatos o1, Gatos o2) {
		
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}

}
