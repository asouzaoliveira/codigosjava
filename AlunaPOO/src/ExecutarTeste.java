import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		
		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome("Modulo Orientação a Objetos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		
		Produto produto2 = new Produto();
		
		produto2.setId(2L);
		produto2.setNome("Modulo Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		
		produto3.setId(3L);
		produto3.setNome("Modulo Angular 8 ");
		produto3.setValor(BigDecimal.valueOf(150));
		
		
		Produto produto4 = new Produto();
		produto4.setId(3L);
		produto4.setNome("HIBERNATE");
		produto4.setValor(BigDecimal.valueOf(300));
		
		
		
		Venda venda = new Venda();
		
		venda.setDescricaoVenda("Curso de Formação em Java");
		venda.setEnderecoEntrega("Entrega pelo E-Mail");
		venda.setId(10L);
		venda.setNomeCliente("Alexandre Souza");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));//
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		venda.getListaProdutos().add(produto4);
		
		System.out.println("Descrição da Venda : " + venda.getDescricaoVenda() + " Valor Total da venda : " 
				+ venda.totalVenda());
		
		for (Produto produto : venda.getListaProdutos()) {
			
			System.out.println(produto.getNome() +" = " + produto.getValor());
			
			
		}
		

	}

}
