package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {
    CourseDao courseDao;

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
