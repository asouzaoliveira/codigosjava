package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeanItem;
import dao.DaoItem;


/**
 * Servlet implementation class Item
 */
@WebServlet("/salvarItem")
public class Item extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    DaoItem daoItem = new DaoItem();
    public Item() {
        super();
       
    }

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		try {
			String acao = request.getParameter("acao");
			String prod = request.getParameter("prod");
			
			if(acao.equalsIgnoreCase("delete")) {
				
				daoItem.delete(prod);
				
				
					RequestDispatcher view = request.getRequestDispatcher("CadastroProduto.jsp");
					request.setAttribute("item", daoItem.listaItens());
					view.forward(request, response);	
					
					
			}else if(acao.equalsIgnoreCase("editar")) {
				
				BeanItem beanItem = daoItem.consultar(prod);
				
				RequestDispatcher view = request.getRequestDispatcher("CadastroProduto.jsp");
				request.setAttribute("prod", beanItem);
				view.forward(request, response);	
				
				
			}
			
			
		
			else if(acao.equalsIgnoreCase("listartodos")) {
			
			RequestDispatcher view = request.getRequestDispatcher("CadastroProduto.jsp");
			request.setAttribute("item", daoItem.listaItens());
			view.forward(request, response);
			
			
		}
		}catch (Exception e) {
			e.printStackTrace();
		}

}
		
	
		
	
	@Override
	@SuppressWarnings({ "unused", "null", "static-access" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		

		if(acao!=null  && acao.equalsIgnoreCase("reset")) {
			
			try {
				RequestDispatcher view = request.getRequestDispatcher("CadastroProduto.jsp");
				request.setAttribute("item", daoItem.listaItens());
				view.forward(request, response);
				
				}catch (Exception e) {
					e.printStackTrace();
				}
			
		}
		
		
		
		
		
		
		else   {
			String id = request.getParameter("id");
			
			String produto = request.getParameter("produto");
			
			String quantidade = request.getParameter("quantidade");
			
			String valor = request.getParameter("valor");
			
			
			
			
			try {
				String msg = null;
				boolean salva = true;
				
				if(valor == null || valor.isEmpty()) {
					msg = "informe o valor do produto";
					salva = false;
					
				}else if (quantidade == null || quantidade.isEmpty()) {
					msg = "Quantidade deve ser informada";
					salva = false;

				}else if (produto == null || produto.isEmpty()) {
					msg = "o Produto deve ser informado";
					salva = false;

				}
				
			
					
			BeanItem item = new BeanItem();
			
		
		item.setProduto(produto);
		
		item.setId(!id.isEmpty()? Long.parseLong(id):null);
		
		if(quantidade!=null && !quantidade.isEmpty()) {
			item.setQuantidade(Double.parseDouble(quantidade));
		
		}
		
		if (valor != null && !valor.isEmpty()) {
			item.setValor(Double.parseDouble(valor));
			
		}
		if(msg!=null) {
			request.setAttribute("msg", msg);
			
		}else if(id==null || id.isEmpty()) {
			daoItem.salvarItem(item);
			
		}else if (id!=null && !id.isEmpty() && salva) {
			daoItem.atualizarProduto(item);
		}if(!salva) {
			
			request.setAttribute("item", daoItem);
		}
		
		
				 	RequestDispatcher view = request.getRequestDispatcher("CadastroProduto.jsp");
				request.setAttribute("item", daoItem.listaItens());
				view.forward(request, response);
				
						
			 
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}
	
}
	}

		
		
			
	
		
		




