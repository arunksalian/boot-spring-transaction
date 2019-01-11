package com.slin.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

public abstract class AbstractDao {

	@PersistenceContext(type=PersistenceContextType.TRANSACTION, unitName="slave")
	protected EntityManager entityManager;
	
	@PersistenceContext(type=PersistenceContextType.TRANSACTION, unitName="master")
	protected EntityManager entityManagerMaster;
	
}
