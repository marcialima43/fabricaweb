package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		//testCadastrar();
		//testAlterar();
		testExcluir();
		
	}
	public static void testCadastrar() {
		//criando usuario
				Usuario usuario = new Usuario();
				
				usuario.setNome("Regiane Almeida Oliveira");
				usuario.setLogin("regi.oli");
				usuario.setSenha("12345");
				
				
				//Cadastrando usuário no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usuario);
				
				System.out.println("usuário cadastrado com sucesso.");

	}
	public static void testAlterar() {
		//criando usuario
		Usuario usuario = new Usuario();
		
		usuario.setId(2);
		usuario.setNome("Romeu Silva Santos");
		usuario.setLogin("romeu.santos");
		usuario.setSenha("1234");
		
		
		//Alterando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usuario);
		System.out.println("usuário alterado com sucesso.");
	}
	public static void testExcluir() {
		//criando usuario
		Usuario usuario = new Usuario();
		
		usuario.setId(3);
		
		//Excluindo usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usuario);
		System.out.println("usuário excluído com sucesso.");
		
		
	}

}
