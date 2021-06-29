package exemplosdeElementosestaticos;

import java.util.Scanner;

public class ExemploMetodoEstatico {
	
	static double n3 = 50;
	double n4 = 200;
	
	public static double soma(double n1, double n2) {
		return (n1+n2);
		
	}
	public double subtra(double n1, double n2) {
		return (n1-n2);
	}
	
	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System.in);
					
		double x, y, total;
		
	System.out.println("Digite o 1 numero: ");
	x = in.nextDouble();
	System.out.println("Digite o 2 numero: ");
	y = in.nextDouble();
	
	total = x+y + n3;
	
	System.out.println("a soma entre x e y é : "+ total);
	System.out.println("a soma entre x e y é : "+ soma(x,y));
	
	ExemploMetodoEstatico ex = new ExemploMetodoEstatico();
	
	ex.n4+=300;
	System.out.println("o valor de n4 é : "+ ex.n4);//o valor não sera 300, pois esta definido como static, valor sera 500.
	System.out.println("a subtração entre x e y é : "+ ex.soma(x,y));
	
	}	


}

