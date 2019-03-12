/**
 * 
 */
package com.biswa.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biswa.demo.entity.LoginEntity;

/**
 * @author BISWA
 *
 */
@Repository
public class LoginDAOImpl implements LoginDAO {
	
	private static final String GET_QUERY="SELECT COUNT(*) FROM LOGIN_TAB WHERE USERNAME= :userName and PASSWORD= :password";

	@Autowired
	private EntityManager em;
	
	@Override
	public int authenticate(LoginEntity entity) {

		int eid=0;
		Query query=null;
		
		//execte or update
		em.getTransaction().begin();
		query=em.createNamedQuery(GET_QUERY);
		query.setParameter(1,entity.getUserName());
		query.setParameter(2,entity.getPassword());
		em.getTransaction().commit();
		return 0;
	}

}
