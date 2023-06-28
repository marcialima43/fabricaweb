package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.entidade.Usuario;

public class UsuarioDAO {
	private Connection conexao = ConexaoFactory.getConnection();

	public void cadastrar(Usuario usuario) {
		String sql = "insert into usuario(nome,login,senha) values(?,?,?)";
		
		try(PreparedStatement statment =    conexao.prepareStatement(sql)) {
			//criando statment
		
			statment.setString(1, usuario.getNome());
			statment.setString(2, usuario.getLogin());
			statment.setString(3, usuario.getSenha());
			//executando dados no banco
			statment.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usuario) {
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		try(PreparedStatement statment =    conexao.prepareStatement(sql)) {
			statment.setString(1, usuario.getNome());
			statment.setString(2, usuario.getLogin());
			statment.setString(3, usuario.getSenha());
			statment.setInt(4, usuario.getId());
			statment.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluir(Usuario usuario) {
		String sql = "delete from usuario where id=?";
		try (PreparedStatement statment =    conexao.prepareStatement(sql)) {
			statment.setInt(1, usuario.getId());
			statment.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
