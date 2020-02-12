package com.roytuts.spring.mvc.hibernate.crud.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.mvc.hibernate.crud.entity.Teacher;

@Repository
@Transactional
public class TeacherDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Teacher getTeacher(final int id) {
		@SuppressWarnings("unchecked")
		TypedQuery<Teacher> q = sessionFactory.getCurrentSession().createQuery("from Teacher t where t.id = :id")
				.setParameter("id", id);

		return q.getSingleResult();
	}

	public List<Teacher> getTeachers() {
		@SuppressWarnings("unchecked")
		TypedQuery<Teacher> q = sessionFactory.getCurrentSession().createQuery("from Teacher");

		return q.getResultList();
	}

	public void addTeacher(final Teacher teacher) {
		sessionFactory.getCurrentSession().save(teacher);
	}

	public void updateTeacher(final Teacher teacher) {
		sessionFactory.getCurrentSession().saveOrUpdate(teacher);
	}

	public void deleteTeacher(final int id) {
		sessionFactory.getCurrentSession().createQuery("delete from Teacher t where t.id = :id").setParameter("id", id)
				.executeUpdate();
	}

}
