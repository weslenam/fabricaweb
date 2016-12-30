package br.com.fb.balflex;

import br.com.fb.balflex.entidade.Usuario;
import br.com.fb.balflex.persistencia.jdbc.UsuarioDao;

public class Teste {

	public static void main(String[] args) {
		
		// add();
		update();
		// delete();
		
	}

	public static void add(){

		// TODO Auto-generated method stub
		Usuario u = new Usuario();	
		u.setNome("franciel");
		u.setLogin("franciel");
		u.setSenha("123456");

		UsuarioDao uDao = new UsuarioDao();
		uDao.add( u );		
		
	}

	public static void delete(){

		// TODO Auto-generated method stub
		Usuario u = new Usuario();	
		u.setId(1);

		UsuarioDao uDao = new UsuarioDao();
		uDao.delete( u );		
		
	}	
	
	public static void update(){

		// TODO Auto-generated method stub
		Usuario u = new Usuario();	
		u.setNome("franasdasdciel");
		u.setLogin("franasdasdciel");
		u.setSenha("123456");
		u.setId(2);

		UsuarioDao uDao = new UsuarioDao();
		uDao.update( u );		
		
	}

}
