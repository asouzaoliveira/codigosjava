package ExerciciosDio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
	
	

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		//CRIE UM CONJUNTO DE CORES DO ARCO IRIS
		
		Set<Cores>cores = new HashSet<>() {{
			
			add(new Cores("Vermelho"));
			add(new Cores("Laranja"));
			add(new Cores("Amarelo"));
			add(new Cores("Verde"));
			add(new Cores("Azul"));
			add(new Cores("Anil"));
			add(new Cores("Violeta"));
			
		}};
		
		System.out.println("--\tExiba todas as cores uma abaixo da outra\t--");
		
		for (Cores cores2 : cores) {
			
			System.out.println(cores2.getCor());
			
		}
		System.out.println("===============================================================================================");
		
		System.out.println("--\tExiba a Quantidade de cores que o arco-iris possui\t--");
		
		System.out.println("O arco-iris possui : "+cores.size() + " cores.");
		System.out.println("===============================================================================================");
		
		System.out.println("--\tExiba todas as cores em ordem alfabetica\t--");
		
		Set<Cores>cores2 = new TreeSet<>(new ComparadorCores());
		cores2.addAll(cores);
		
		for (Cores cores3 : cores2) {
			
			System.out.println(cores3);
			
		}
		System.out.println("--\tExiba todas as cores na ordem informada\t--");
		
		Set<Cores>cores1 = new LinkedHashSet<>(){{
			
			add(new Cores("Vermelho"));
			add(new Cores("Laranja"));
			add(new Cores("Amarelo"));
			add(new Cores("Verde"));
			add(new Cores("Azul"));
			add(new Cores("Anil"));
			add(new Cores("Violeta"));
			
		}};
		for (Cores cores3 : cores1) {
			System.out.println(cores3.getCor());
			
		}
		
		
		System.out.println("===============================================================================================");
		
		System.out.println("--\tExiba todas as cores na ordem inversa a informada\t--");
		
		List<Cores>cores5 = new ArrayList<>(cores1); 
		
		Collections.reverse(cores5);
		
		for (Cores cores3 : cores5) {
			
			System.out.println(cores3.getCor());
			
			
		}
		
		System.out.println("===============================================================================================");
		
		
		System.out.println("--\tExiba todas as cores começadas com a letra 'v'\t--");
		
		for (Cores cores3 : cores5) {
			
			if(cores3.getCor().indexOf("V")==0) {
				
				System.out.println(cores3.getCor());
				
			}
			
		}
			
			System.out.println("===============================================================================================");
			System.out.println("--\tRemova todas as cores que não começam com a letra 'v'\t--");
		
			
			System.out.println("===============================================================================================");
			//System.out.println("--\tLimpe o conjunto\t--");
			//cores5.clear();
			//System.out.println(cores5);
			//System.out.println("===============================================================================================");
			////System.out.println("--\tConfira se o conjunto esta vazio\t--");
			//System.out.println(cores5.isEmpty());
	}
	
	
}
