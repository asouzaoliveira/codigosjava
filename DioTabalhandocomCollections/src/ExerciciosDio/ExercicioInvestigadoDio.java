package ExerciciosDio;

import java.util.ArrayList;
import java.util.List;


public class ExercicioInvestigadoDio {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		List<String>perguntas = new ArrayList<>();
		
		perguntas.add("Telefonou para v�tima?");
		perguntas.add("Esteve no local do crime?");
		perguntas.add("Mora perto da v�tima?");
		perguntas.add("Devia para v�tima?");
		perguntas.add("J� trabalhou com a v�tima?");
		
		System.out.println("Responda as perguntas com S/N");
		
		List<String> respostas = new ArrayList<>();
		String resp;
		for (int i = 0; i < perguntas.size(); i++) {
			
		System.out.println(perguntas.get(i));
		
		resp=scan.nextLine();
			respostas.add(resp);
		}
		
		int pos = 0;
		int neg = 0;
		
		for (String r : respostas) {
			
			if(r.equalsIgnoreCase("S")) {
				
				pos+=1;
				
			}if(r.equalsIgnoreCase("N")) {
				
				neg+=1;
				
			}
			
		}if(pos>0&&pos<=2) {
			
			System.out.println("Voc� � um Suspeito!");
			
		}else if(pos>2&&pos<=4){
			System.out.println("Voc� � um C�mplice!");
			
		}else if(pos==5) {
			
			System.out.println("Voc� � o Assasino!");
			
		}else {
			System.out.println("Voc� � Inocente!");
		}
		
		
		
	}

}
