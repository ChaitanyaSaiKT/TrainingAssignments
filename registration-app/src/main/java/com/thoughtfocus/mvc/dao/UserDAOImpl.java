package com.thoughtfocus.mvc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thoughtfocus.mvc.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveUser(UserDTO user) {
		Session session = null;
		Transaction transaction = null;
		try {
			session =sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}
		return true;
	}
	
	@Override
	public boolean authenticate(String username, String password) {
		String hqlquery = "SELECT user FROM UserDTO as user WHERE username=:nm AND password=:pass";
		Session session = null;
		UserDTO dto = null;
		
		try {
			session = sessionFactory.openSession();
			Query query;
			query = session.createQuery(hqlquery);
			query.setParameter("nm",username);
			query.setParameter("pass",password);
			dto = (UserDTO) query.uniqueResult();
			}catch(HibernateException e) {
				e.printStackTrace();
			}finally {
				if(session!=null)
					session.close();
			}
		if(dto!=null) {
		return true;
		}
		else
		return false;
		}

}
