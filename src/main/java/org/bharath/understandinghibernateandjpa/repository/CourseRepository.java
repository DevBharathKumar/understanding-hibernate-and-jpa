package org.bharath.understandinghibernateandjpa.repository;

import javax.persistence.EntityManager;

import org.bharath.understandinghibernateandjpa.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	@Autowired
	EntityManager em;
	
	public Course findById(Long id){
		return em.find(Course.class, id);
	}
	
	
}
