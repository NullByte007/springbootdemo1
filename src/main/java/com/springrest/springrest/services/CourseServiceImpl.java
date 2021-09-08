package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	// List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
		/*
		 * list = new ArrayList<>(); list.add(new
		 * Course(144,"JAVA Course","This is a basic Java Course")); list.add(new
		 * Course(145,"Python Course","This is a basic Python Course"));
		 */
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();	
	}



	@Override
	public Course getCourse(Long courseId) {
		/*
		 * Course c=null; for(Course cc:list) { if(cc.getId()==courseId) { c = cc;
		 * break; } }
		 */
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long courseId) {
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}
	
	

}
