package execicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, 
  crie uma lista e ordene esta lista exibindo : 
  (nome, idade, cor)
  
  *Gato1 = nome: Jon, idade: 18, cor:preto
  *Gato2 = nome: Simba, idade: 6, cor:tigrado
  *Gato2 = nome: Jon, idade: 12, cor:amarelo
  */

public class OrdenacaoLista {

	public static void main(String[] args) {
		
		System.out.println("--\tOrdem de inserção\t--");
		
		List<Gatos> gato = new ArrayList<Gatos>() {{
		add(new Gatos("Jon", 18, "preto"));
		add(new Gatos("Simba", 6, "tigrado"));
		add(new Gatos("Jon", 12, "amarelo"));

		}};
		
		System.out.println(gato);
		System.out.println("====================================================================================");
		
		System.out.println("--\tOrdem de inserção aleatoria\t--");
	Collections.shuffle(gato);
	
	System.out.println(gato);
	System.out.println("====================================================================================");
	
	System.out.println("--\tOrdem natural de nomes\t--");
	Collections.sort(gato);
	System.out.println(gato);
	System.out.println("====================================================================================");
	
	System.out.println("--\tOrdem de idade\t--");
	Collections.sort(gato, new GatoComparacao());
	
	System.out.println(gato);
	System.out.println("====================================================================================");
	
	System.out.println("--\tOrdem de cor\t--");
	Collections.sort(gato, new GatoComparacaoCor());
	System.out.println(gato);
	System.out.println("====================================================================================");
	
	System.out.println("--\tOrdem de nome/idade/cor\t--");
	Collections.sort(gato, new GatoComparacaoNomeIdadeCor());
	System.out.println(gato);
	System.out.println("====================================================================================");
	
	}							

}
