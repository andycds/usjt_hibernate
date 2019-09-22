package br.usjt.usjt_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_hibernate.model.Perfil;
import br.usjt.usjt_hibernate.repository.JPAUtil;

public class TesteRemovePerfilComUsuarioAssociado {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Perfil p = manager.find(Perfil.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
	}
}
