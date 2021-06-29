package stream;

import java.util.function.Predicate;

public class RefatoracaoMap {
	
	/*Dadas as seguintes informações de id e contato, crie um dicionario e 
	 * ordene este dicionario exibindo (Nome id - Nome contato)
	 * 
	 * id= 1 - Contato = nome: Simba, numero 2222;
	 * id= 4 - Contato = nome: Cani, numero 5555;
	 * id= 3 - Contato = nome: Jon, numero 1111;
	 * */

	public static void main(String[] args) {
		
		/*System.out.println("--\tOrdem arleatória\t--");
		
		Map<Integer, Contato>agenda = new HashMap<>() {{
			
			put(1,new Contato("Simba",2222 ));
			put(4,new Contato("Cani",5555 ));
			put(3,new Contato("Jon",1111 ));
		}};
		
		
		for(Map.Entry<Integer, Contato>entry:agenda.entrySet()) {
			
			System.out.println(entry.getKey() + " - "+ entry.getValue().getNome());
		}
		System.out.println("===============================================================================================");
		
		System.out.println("--\tOrdem Inserção\t--");
		
		Map<Integer, Contato>agenda1 = new LinkedHashMap<>() {{
			
			put(1,new Contato("Simba",2222 ));
			put(4,new Contato("Cani",5555 ));
			put(3,new Contato("Jon",1111 ));
		}};
		for(Map.Entry<Integer, Contato>entry:agenda1.entrySet()) {
			
			System.out.println(entry.getKey() + " - "+ entry.getValue().getNome());
			
		}
		
		System.out.println("===============================================================================================");
		System.out.println("--\tOrdem id\t--");
		Map<Integer, Contato>agenda2 = new TreeMap<>(agenda);
		
		for(Map.Entry<Integer, Contato>entry:agenda2.entrySet()) {
			
			System.out.println(entry.getKey() + " - "+ entry.getValue().getNome());
			
		}
	
		System.out.println("===============================================================================================");
		System.out.println("--\tOrdem numero de telefone\t--");
		
		Set<Map.Entry<Integer, Contato>>set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

			@Override
			public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
				
				return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
			}
			

		});
		set.addAll(agenda.entrySet());
		
		for(Map.Entry<Integer, Contato>entry:set) {
			
			System.out.println(entry.getKey() + " - "+ entry.getValue().getNome() + " - " + entry.getValue().getNumero());
			
		}
		
		System.out.println("===============================================================================================");
		System.out.println("--\tOrdem nme do contato\t--");
		Set<Map.Entry<Integer, Contato>>set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

			@Override
			public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
				
				return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
			}
		});
		
		set1.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato>entry:set1) {
			
			System.out.println(entry.getKey() + " - "+ entry.getValue().getNome() + " - " + entry.getValue().getNumero());
			
		}
		 Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
		 System.out.println(coresDaBandeiraDoBrasil);
		 
		 List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
		 System.out.println(consoantesMeuNome);

		Scanner leitor = new Scanner(System.in);
		  int p = 0;
	        int im = 0;
	        int pos = 0;
	        int neg = 0;
	        int num;

	//continue a solução
	        for (int i=0; i<5;i++) {
	        num = leitor.nextInt();
	    
	        	if (num %2 ==0) {
					p+=1;
				}if (num %2 !=0) {
					im+=1;
				}if (num > 0) {
					pos+=1;
				}if (num < 0) {
					neg+=1;
				}
	        }
	        
	//insira suas variaveis corretamente
	        System.out.println(p + " valor(es) par(es)");
	        System.out.println( im+ " valor(es) impar(es)");
	        System.out.println( pos+ " valor(es) positivo(s)");
	        System.out.println( neg+ " valor(es) negativo(s)");
	        */
	       
	        
	       funcao1 colocarP = valor ->valor + " carlos";
	        
	        System.out.println(colocarP.gerar("joao"));
	        
	        Predicate<String> nome = String::isEmpty;
				System.out.println(nome.test(""));
				System.out.println(nome.test("alexandre"));
	        
	}

}	

@FunctionalInterface 
interface funcao1{
	String gerar(String valor);
}
