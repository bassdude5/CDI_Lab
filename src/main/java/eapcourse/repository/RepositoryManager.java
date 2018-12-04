package eapcourse.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import eapcourse.domain.SimpleProperty;

public class RepositoryManager {

	@Inject
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<SimpleProperty> queryCache() {
		return em.createQuery("FROM eapcourse.domain.SimpleProperty").getResultList();
	}
}
