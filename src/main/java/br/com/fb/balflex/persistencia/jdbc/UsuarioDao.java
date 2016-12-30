package br.com.fb.balflex.persistencia.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fb.balflex.entidade.Usuario;

public class UsuarioDao {
	
	private Connection con = ConexaoFactory.getConnection();
	
	public void add(Usuario u){
		
		String sql = "INSERT INTO usuario(nome,usuario,senha) VALUES(?,?,?)";
		
		try {
			PreparedStatement p = con.prepareStatement(sql);
			
			p.setString(1, u.getNome() );
			p.setString(2, u.getLogin() ); 
			p.setString(3, u.getSenha() );
			
			p.executeQuery();
			p.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delete( Usuario u ){

		String sql = "DELETE FROM usuario WHERE id=?";
		
		try {
			PreparedStatement p = con.prepareStatement(sql);
			
			p.setInt(1, u.getId() );			
			
			p.executeQuery();
			p.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}	
	
	public void update( Usuario u ){

		String sql = "UPDATE usuario set nome=?, usuario=?,senha=? WHERE id=?";
		
		try {
			PreparedStatement p = con.prepareStatement(sql);
			
			p.setString(1, u.getNome() );
			p.setString(2, u.getLogin() ); 
			p.setString(3, u.getSenha() );
			p.setInt(4, u.getId() );			
			
			p.executeQuery();
			p.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}