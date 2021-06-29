package ExerciciosDio;

import java.util.ArrayList;
import java.util.List;

public class ExercicioTemp {

	public static void main(String[] args) {
		
		List<Dados>dados = new ArrayList<Dados>() {{
			add(new Dados("Janeiro", 30.8));
			add(new Dados("Fevereiro", 25.3));
			add(new Dados("Março", 22.9));
			add(new Dados("Abril", 35.2));
			add(new Dados("Maio", 18.6));
			add(new Dados("Junho", 19.0));
			
		}};
		System.out.println("--\t Mes medido          --\t ");
		System.out.println(dados);
		System.out.println("==========================================================================================");
		System.out.println("\t\tMédia da Temperaturas\t\t");

		double soma = 0;
		
		for (Dados dados2 : dados) {
			
			soma += dados2.getTemperatura();
			
		}
		double media = soma/dados.size();
		
		System.out.println("Temperatura média : "+ media);
		System.out.println("==========================================================================================");
		
		
		System.out.println("Temperaturas Acima da Média");
			
		for (Dados dados2 : dados) {
			
			if(dados2.getTemperatura() >media) {
				
				System.out.println(dados2.getMeses() +" : " + dados2.getTemperatura());
				
			}
			
		}
		System.out.println("==========================================================================================");
		
		System.out.println("Temperaturas Abaixo da Média");
		
		for (Dados dados2 : dados) {
			
			if(dados2.getTemperatura() < media) {
				
				System.out.println(dados2.getMeses() +" : " + dados2.getTemperatura());
				
			}
			
		}
		
		} 
			
		


	}


