package br.usjt.usjt_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_hibernate.model.Usuario;
import br.usjt.usjt_hibernate.repository.JPAUtil;

public class TesteAtualizaUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = manager.find(Usuario.class, 1L);
		u.setNome(u.getNome() + " da Silva");
		u.setEmail("anasilva@usjt.br");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
