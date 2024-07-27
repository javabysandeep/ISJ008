package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;

import java.util.List;

public class CourseService {
    CourseDao courseDao = new CourseDao();
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
