package com.itshaala.servlets;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/courses")
public class GetAllCoursesServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        CourseController courseController = new CourseController();
        List<Course> courseList = courseController.findAll();
        PrintWriter writer = servletResponse.getWriter();
        writer.println(courseList);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
