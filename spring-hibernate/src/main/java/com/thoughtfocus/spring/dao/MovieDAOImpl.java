package com.thoughtfocus.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thoughtfocus.spring.dto.MovieDTO;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveMovie(MovieDTO dto) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}
	
	public List<Object[]>getAllMovies(){
		 String getallmovies = "SELECT Movie FROM MovieDTO as Movie";
		 Session session = null;
		 List<Object[]> list = null;
			
			try {
				session = sessionFactory.openSession();
				Query query;
				query = session.createQuery(getallmovies);
				list = (List<Object[]>) query.list();
				}catch(HibernateException e) {
					e.printStackTrace();
				}finally {
					if(session!=null) {
						session.close();
					}
				}
			return list;
			}
	
	public void updateBudgetByName(String name, long budget) {
		String updatebudgetbynamequery = "UPDATE MovieDTO SET budget=:bud WHERE name=:nme";
		Session session = null;
		Transaction transaction = null;
		try {
	    session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Query query;
		query = session.createQuery(updatebudgetbynamequery);
		query.setParameter("nme",name);
		query.setParameter("bud",budget);
		query.executeUpdate();
		transaction.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
			
		}
	
	public void deleteDataById(int id) {
		String deletebyidquery = "DELETE FROM MovieDTO WHERE id=:id";
		Session session = null;
		Transaction transaction = null;
		try {
	    session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Query query;
		query = session.createQuery(deletebyidquery);
		query.setParameter("id",id);
		query.executeUpdate();
		transaction.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
			
		}
		

}
