package org.bharath.understandinghibernateandjpa.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.bharath.understandinghibernateandjpa.entity.Course;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class CourseRepositoryTest {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Test
	void testFindById() 
	{
		Course course = this.repository.findById(1000l);
		assertEquals("Spring JPA", course.getName());
	}

}
