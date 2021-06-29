package execicios;

import java.util.Comparator;

public class GatoComparacaoNomeIdadeCor implements Comparator <Gatos>{

	
	@Override
	public int compare(Gatos gato1, Gatos gato2) {
		
		int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
		if(nome != 0) {
			return nome;
		}
		
		int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
		
		if(cor!= 0) {
			return cor;
		}
		
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade()) ;
	}

}
