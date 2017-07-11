package  wty.cqupt.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import wty.cqupt.dao.IDeptDao;
import wty.cqupt.entity.Dept;

public class DeptDao implements IDeptDao {
	
	// ����ע��
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Dept findById(int id) {
		return (Dept) sessionFactory.getCurrentSession().get(Dept.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Dept").list();
	}

}
