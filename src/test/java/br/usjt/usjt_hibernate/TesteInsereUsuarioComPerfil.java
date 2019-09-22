package br.usjt.usjt_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_hibernate.model.Perfil;
import br.usjt.usjt_hibernate.model.Usuario;
import br.usjt.usjt_hibernate.repository.JPAUtil;

public class TesteInsereUsuarioComPerfil {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Perfil p = new Perfil();
		p.setDescricao("Perfil do José");
		manager.persist(p);
		Usuario u = new Usuario();
		u.setNome("José");
		u.setFone("11332244");
		u.setEmail("jose@usjt.br");
		u.setPerfil(p);
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
