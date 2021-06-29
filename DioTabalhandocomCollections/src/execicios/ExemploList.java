package execicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		//Dada uma lista com 7 notas de um aluno {7,8.5,9.3,´5,7,8,3.6}, faça:
		
	 //List notas = new ArrayList();
		//List<Double> notas = new ArrayList<Double>();
		//ArrayList<Double> notas = new ArrayList<>();
		//List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,8d,3.6));
		//List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,8d,3.6);
		//notas.add(10d);
		//System.out.println(notas);
		
		//List<Double> notas = List.of(7d,8.5,9.3,5d,7d,8d,3.6);
		//notas.add(1d);
		//notas.remove(5d);
		//System.out.println(notas);
	 	
		//System.out.println("crie uma lista e adicione sete notas: ");
		
		List<Double> notas = new ArrayList<Double>();
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(8.0);
		notas.add(3.6);
		/*System.out.println(notas.toString());
		System.out.println("====================================================================================");
		//System.out.println(notas.toString());
		//System.out.println("====================================================================================");
		//System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d) );
		//System.out.println("====================================================================================");
		//System.out.println("adicione na lista a nota 8.0 na posição 4: ");
		//notas.add(4, 8.0);
		//System.out.println(notas.toString());
		//System.out.println("====================================================================================");
		//System.out.println("Substitua a nota 5.0 pela nota 6.0:" );
		//notas.set(notas.indexOf(5d),6.0);
		//System.out.println(notas.toString());
		//System.out.println("confira se a nota 5.0 esta na lista: " + notas.contains(5.0));
		//System.out.println("====================================================================================");
		//System.out.println("Exiba as notas na ordem em que foram informadas:");
		//for(Double nota: notas)System.out.println(nota);
		//System.out.println("====================================================================================");
		//System.out.println("Exiba a terceira nota adicionada: " );
		//System.out.println(notas.get(2));
		//System.out.println("====================================================================================");
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println(notas.toString());
		System.out.println("====================================================================================");
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		System.out.println(notas.toString());
		System.out.println("====================================================================================");
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			
			double proximo = iterator.next();
			
			soma+=proximo;
		}
		
		System.out.println(soma);
		System.out.println("====================================================================================");
		
		System.out.println("Exiba a media das notas: ");
		
		System.out.println(soma/notas.size());
		
		System.out.println("====================================================================================");
		
		System.out.println("Remova a nota da posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("====================================================================================");
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			
			double proximo = iterator1.next();
			
			if(proximo<7) 
				
				iterator1.remove();
		}
			System.out.println(notas);
			System.out.println("====================================================================================");
		System.out.println("Apague toda a lista");	
		//notas.clear();
		
		System.out.println(notas);
		
		System.out.println("====================================================================================");
		System.out.println("Confir se a lista esta vazia:");
		System.out.println(notas.isEmpty());
		*/
		System.out.println("crie uma lista chamada notas2 coloque todos os elementos da List ArrayList nessa nova lista: ");
		
		LinkedList<Double>notas2 = new LinkedList<Double>();
		System.out.println(notas2);
		System.out.println("====================================================================================");
		
		Iterator<Double>iterator = notas.iterator();
		
	while(iterator.hasNext()) {
		
		double prox = iterator.next();
		
		notas2.add(prox);	
	}
	System.out.println(notas2);
	System.out.println("====================================================================================");
	
	System.out.println("Mostre a primeira nota da nova lista sem remove-lo: ");
	System.out.println(notas2);
	System.out.println(notas2.getFirst());
	
	System.out.println("====================================================================================");
	
	System.out.println("Mostre a primeira nota da nova lista  removendo-o: ");
	
	notas2.removeFirst();
	
	System.out.println(notas2);
	System.out.println(notas2.getFirst());
	
	}

}
