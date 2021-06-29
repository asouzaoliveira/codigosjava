package execicios;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		
		//Dados Modelos dos carros e seus respectivos consumos na estrada, faça:
		
		/*modelo = gol - consumo = 14.4km/l
		 * modelo = uno - consumo = 15.6km/l
		 * modelo = mobi - consumo = 16.1km/l
		 * modelo = hb20 - consumo = 14.5km/l
		 * modelo = kwid - consumo = 15.6km/l
		 * */
		
		//Map carrosPopulares2020 = new HashMap();
		//Map<String,Double>carrosPopulares = new HashMap<>();
		//HashMap<String,Double>carrosPopulares = new HasMap<>();
		//Map<String,Double>carrosPopulares2020 = Map.of("gol",14.4, "uno",15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);
		
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
		Map<String, Double>carrosPopulares = new HashMap<>() {{
			put("gol",14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		
		}};
		System.out.println(carrosPopulares);
		System.out.println("==============================================================================================");
		System.out.println("substitua o consumo do gol por 15.2 km/l: ");
		
		carrosPopulares.put("gol",15.2);
		System.out.println(carrosPopulares);
		System.out.println("==============================================================================================");
		
		System.out.println("confira se o modelo Tucson esta no dicionario");
		
		System.out.println(carrosPopulares.containsKey("tucson"));
		System.out.println("==============================================================================================");
		System.out.println("exiba o valor de consumo do uno");
		System.out.println(carrosPopulares.get("uno"));
		
		System.out.println("==============================================================================================");
		//System.out.println("exiba o terceiro modelo informado");
		
		System.out.println("exiba os modelos");
		Set<String> modelos = carrosPopulares.keySet();
		
		System.out.println(modelos);
		
		System.out.println("==============================================================================================");
		
		System.out.println("exiba o consumo dos carros");
		
		Collection<Double>consumo = carrosPopulares.values();
		System.out.println(consumo);
		System.out.println("==============================================================================================");
		System.out.println("exiba o modelo mais economico e seu consumo");
		double cons = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>>carro = carrosPopulares.entrySet();
		String modelo = "";
		
		for (Entry<String, Double> entry : carro) {
			
			if(entry.getValue().equals(cons)) {
				
				modelo = entry.getKey();
				
			}
			
		}
		System.out.println("modelo mais eficiente : "+modelo +" "+ cons);
		
		System.out.println("==============================================================================================");
		
		System.out.println("exiba o modelo menos economico e seu consumo");
		
		double minimo = Collections.min(carrosPopulares.values());
		Set<Map.Entry<String, Double>>carro2 = carrosPopulares.entrySet();
		String modeloM = "";
		for (Entry<String, Double> entry : carro2) {
			
			if(entry.getValue().equals(minimo)) {
				
				modeloM = entry.getKey();
				
			}
			
		}
		System.out.println("Modelo menos eficiente : "+ modeloM + " "+ minimo);
		System.out.println("==============================================================================================");
		
		System.out.println("exiba a soma dos consumos");
		
		double soma = 0.0;
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		
		while(iterator.hasNext()) {
			
			soma+=iterator.next();
			
		}
		System.out.println("soma dos consumos : " + soma);
		
		System.out.println("==============================================================================================");
		System.out.println("exiba a media dos consumos");
		
		System.out.println("media dos consumos : " + soma/carrosPopulares.size());
		
		System.out.println("==============================================================================================");
		
		System.out.println("exclua os modelos com o consumo igual a 15.6km/l");
		
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		
		while(iterator1.hasNext()) {
			
			if(iterator1.next().equals(15.6)) 
				iterator1.remove();
				
		}
		System.out.println(carrosPopulares);
		
		System.out.println("==============================================================================================");
		
		System.out.println("exiba todos os carros na ordem informada");
		Map<String, Double>carrosPopulares2 = new LinkedHashMap<>() {{
			put("gol",14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		
		}};
		System.out.println(carrosPopulares2);
		
		System.out.println("==============================================================================================");
		
		System.out.println("exiba o dicionario ordenado por modelo");
		Map<String, Double>carrosPopulares3 = new TreeMap<>(carrosPopulares2);
		System.out.println(carrosPopulares3);
		
		System.out.println("==============================================================================================");
		
		System.out.println("Apague o dicionario");
		
		carrosPopulares.clear();
		
		System.out.println(carrosPopulares);
		
		System.out.println("==============================================================================================");
		
		System.out.println("verifique se o conjunto esta vazio");
		
		System.out.println(carrosPopulares.isEmpty());
		
		System.out.println("==============================================================================================");
	}

}
