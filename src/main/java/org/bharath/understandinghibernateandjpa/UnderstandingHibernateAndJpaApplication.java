package org.bharath.understandinghibernateandjpa;

import org.bharath.understandinghibernateandjpa.entity.Course;
import org.bharath.understandinghibernateandjpa.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnderstandingHibernateAndJpaApplication implements CommandLineRunner
{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(UnderstandingHibernateAndJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Course course = repository.findById(1000l);
		logger.info("Course is -> {} ",course);
	}

}
