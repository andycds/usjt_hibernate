package br.usjt.usjt_hibernate;

import javax.persistence.EntityManager;

import br.usjt.usjt_hibernate.model.Perfil;
import br.usjt.usjt_hibernate.repository.JPAUtil;

public class TesteBuscaPerfilComUsuarioAssociado {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Perfil p = manager.find(Perfil.class, 4L); //coloque aqui um id existente no banco
		System.out.println(p.getUsuario().getNome());
		manager.close();
		JPAUtil.close();
	}
}
