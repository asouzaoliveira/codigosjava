package execicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenandoMap {
	
	/*DADAS AS SEGUINTES INFORMA��ES DOS MEUS LIVROS FAVORITOS E SEU AUTORES,
	 * CRIE UM DICIONARIO E ORDENE ESSE DICIONARIO:
	 * EXIBINDO (NOME DO AUTOR - NOME DO LIVRO)
	 * 
	 * 
	 * 
	 * Autor = Hawking, Stephen - Livro = nome: Uma Breve Hist�ria do tempo, paginas: 256
	 * Autor = Duhing, Charles - Livro = nome: O Poder do H�bito, paginas: 400
	 * Autor = Harary, Yuvval Naah - Livro = 21 Li��es para o S�culo 21, paginas: 432
	 * */

	public static void main(String[] args) {
		
		System.out.println("--\t Ordem Aleat�ria\t--");
		Map<String, Livros>livros = new HashMap<>() {{
			put("Hawking, Stephen", new Livros("Uma Breve Hist�ria do tempo", 256));
			put("Duhing, Charles", new Livros("O Poder do H�bito", 400));
			put("Harary, Yuvval Naah", new Livros("21 Li��es para o S�culo 21", 432));
		}};
		
		for (Map.Entry<String, Livros> livro :livros.entrySet()) {
			
			System.out.println(livro.getKey() +" "+ livro.getValue().getNome() );
			
		}
		
		System.out.println("=======================================================================================");
		
		System.out.println("--\t Ordem de Inser��o\t--");
		Map<String, Livros>livros1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livros("Uma Breve Hist�ria do tempo", 256));
			put("Duhing, Charles", new Livros("O Poder do H�bito", 400));
			put("Harary, Yuvval Naah", new Livros("21 Li��es para o S�culo 21", 432));
		}};
		
		for (Map.Entry<String, Livros> livro :livros1.entrySet()) {
			
			System.out.println(livro.getKey() +" "+ livro.getValue().getNome() );
			
		}
		
		
		System.out.println("=======================================================================================");
		
		System.out.println("--\t Ordem Alfabetica de Autores\t--");
		Map<String, Livros>livros2 = new TreeMap<>() {{
			put("Hawking, Stephen", new Livros("Uma Breve Hist�ria do tempo", 256));
			put("Duhing, Charles", new Livros("O Poder do H�bito", 400));
			put("Harary, Yuvval Naah", new Livros("21 Li��es para o S�culo 21", 432));
		}};
		
		for (Map.Entry<String, Livros> livro :livros2.entrySet()) {
			
			System.out.println(livro.getKey() +" "+ livro.getValue().getNome() );
			
		}
		
		
		System.out.println("=======================================================================================");
		
		System.out.println("--\t Ordem Alfabetica de Nome dos Livros\t--");
		Set<Map.Entry<String, Livros>>meusLivros = new TreeSet<>(new ComparatorNome());
		meusLivros.addAll(livros.entrySet());
		for (Map.Entry<String, Livros> livro :meusLivros) {
			
			System.out.println(livro.getKey() +" "+ livro.getValue().getNome() );
			
		}
		
		System.out.println("=======================================================================================");
		
		System.out.println("--\t Ordem de N�mero de P�ginas\t--");
		
		Set<Map.Entry<String, Livros>>meusLivros2 = new TreeSet<>(new ComparatorPaginas());
		meusLivros2.addAll(livros.entrySet());
		for (Map.Entry<String, Livros> livro :meusLivros2) {
			
			System.out.println(livro.getKey() +" - "+ livro.getValue().getPaginas());
			
		}
		

	}

}
