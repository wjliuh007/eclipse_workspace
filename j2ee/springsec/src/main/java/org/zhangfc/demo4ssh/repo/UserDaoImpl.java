package org.zhangfc.demo4ssh.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.engine.spi.TypedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zhangfc.demo4ssh.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public int save(User u) {
		return (Integer) sessionFactory.getCurrentSession().save(u);
	}

	public List<User> findAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		return criteria.list();
	}

	@Override
	public List<User> findAllAdmin() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		criteria.add(new Criterion() {

			@Override
			public String toSqlString(Criteria arg0, CriteriaQuery arg1)
					throws HibernateException {
				return "role_id = 2";
			}

			@Override
			public TypedValue[] getTypedValues(Criteria arg0, CriteriaQuery arg1)
					throws HibernateException {
				return null;
			}
		});
		return criteria.list();
	}

}
