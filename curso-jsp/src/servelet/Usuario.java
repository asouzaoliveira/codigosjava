package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeanCursoJsp;
import dao.DaoUsuario;


@WebServlet("/salvarUsuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DaoUsuario daoUsuario = new DaoUsuario();
    
    public Usuario() {
        super();
       
    }

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
		String acao = request.getParameter("acao");
		String user = request.getParameter("user");
		
		if(acao.equalsIgnoreCase("delete")) {
			daoUsuario.delete(user);
			
			RequestDispatcher view = request.getRequestDispatcher("CadastroUsuario.jsp");
			request.setAttribute("usuario", daoUsuario.listar());
			view.forward(request, response);
			
		}else if(acao.equalsIgnoreCase("editar")) {
			
			BeanCursoJsp beanCursoJsp = daoUsuario.consultar(user);
			
			RequestDispatcher view = request.getRequestDispatcher("CadastroUsuario.jsp");
			request.setAttribute("user", beanCursoJsp);
			view.forward(request, response);
			
		} else if(acao.equalsIgnoreCase("listartodos")) {
			
			RequestDispatcher view = request.getRequestDispatcher("CadastroUsuario.jsp");
			request.setAttribute("usuario", daoUsuario.listar());
			view.forward(request, response);
			
		}
		
		
		
		
		}catch (Exception e) {
			e.printStackTrace();
			}
	
		
	}
	
		
	

	@Override
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao=request.getParameter("acao");
		
		if(acao!=null && acao.equalsIgnoreCase("reset")) {
			try {
				
				RequestDispatcher view = request.getRequestDispatcher("CadastroUsuario.jsp");
				request.setAttribute("usuario", daoUsuario.listar());
				view.forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		else {
			
			boolean salvar = true;
			String msg = null;
		
		String id = request.getParameter("id");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		
		BeanCursoJsp usuario = new BeanCursoJsp();
		usuario.setId(!id.isEmpty()? Long.parseLong(id): null);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setNome(nome);
		usuario.setTelefone(telefone);
		

		
		try {
			if(login == null || login.isEmpty()) {
				msg= "informe o login do usuario";	
				salvar = false;
				
			}
			else if(senha == null || senha.isEmpty()) {
				msg= "informe a senha do usuario";
				salvar = false;
				
			}
			else if(nome == null || nome.isEmpty()) {
				msg= "informe o nome do usuario";
				salvar = false;
				
			}
			else if(telefone == null || telefone.isEmpty()) {
				msg = "informe o telefone do usuario";
				salvar = false;
				
			}
			
			else if(id == null || id.isEmpty() && !daoUsuario.validarLogin(login)) {
				
				msg = "Usuario Duplicado";
				salvar = false;
				
				
			}else if(id == null || id.isEmpty() && !daoUsuario.validarSenha(senha)) {
				
				msg= "Senha Duplicada";
				salvar = false;
				
			}
			
			
			else if(id == null || id.isEmpty()&& daoUsuario.validarLogin(login) && daoUsuario.validarSenha(senha)) {
				if(msg==null) {
				
				
				daoUsuario.salvar(usuario);
				}
					
			}
			
			//atualizar usuario
			else if(id != null && !id.isEmpty()){
			 if(!daoUsuario.validarLoginUpdate(login, Long.parseLong(id))) {
				 msg= "usuario ja existe no banco de dados";
					salvar = false;
				 
					
				}else if(id != null && !id.isEmpty()) {
					
					if(!daoUsuario.validarSenhaUpdate(senha, Long.parseLong(id))) {
						msg= "senha duplicada no banco de dados";
					
						salvar = false;
					}
					
				}else if(id != null && !id.isEmpty()&& daoUsuario.validarSenhaUpdate(senha, Long.parseLong(id))&&daoUsuario.validarLoginUpdate(login, Long.parseLong(id))) {
					msg = null;
					salvar = true;
					
						
			}if(salvar && msg==null) {
				
				
				daoUsuario.atualizar(usuario);	
				}
			 
				
			}
	
			RequestDispatcher view = request.getRequestDispatcher("CadastroUsuario.jsp");
			request.setAttribute("usuario", daoUsuario.listar());
			view.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
	}

}
