package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistence.jdbc.UsuarioDAO;
import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
		
	}
	
	public static void testCadastrar() {
		// Criando usuario
		Usuario usu = new Usuario();
		usu.setNome("Marcio Silva");
		usu.setLogin("marcio");
		usu.setSenha("marcio123");

		// Cadastrando usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");

	}
	
	public static void testAlterar() {
		// Criando usuario
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Marcio felipini");
		usu.setLogin("marcio2");
		usu.setSenha("marcio123456");

		// Cadastrando usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!");
	}
	
	public static void testExcluir() {
		// Criando usuario
		Usuario usu = new Usuario();
		usu.setId(7);
		
		// Cadastrando usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso!");
	}
	

}
