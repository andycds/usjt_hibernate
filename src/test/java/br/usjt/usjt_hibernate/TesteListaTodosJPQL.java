package br.usjt.usjt_hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.usjt_hibernate.model.Usuario;
import br.usjt.usjt_hibernate.repository.JPAUtil;

public class TesteListaTodosJPQL {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List <Usuario> usuarios = query.getResultList();
		System.out.println("--------------------------------");
		for (Usuario u : usuarios) {
			System.out.println(u);
		}
		System.out.println("--------------------------------");
		manager.close();
		JPAUtil.close();
	}
}
