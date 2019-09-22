package br.usjt.usjt_hibernate;

import javax.persistence.EntityManager;

import br.usjt.usjt_hibernate.model.Usuario;
import br.usjt.usjt_hibernate.repository.JPAUtil;

public class TesteBuscaUsuarioComPerfil {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.find(Usuario.class, 3L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
	}
}
