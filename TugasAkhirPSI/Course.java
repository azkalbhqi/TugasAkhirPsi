package com.TugasAkhirPSI;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private String courseDescription;
    private String coursePrice;
    private static List<Course> courses = new ArrayList<>();

    // Constructor, getters, and setters

    public static void addCourse(Course course) {
        courses.add(course);
    }

    public static List<Course> getCourses() {
        return courses;
    }
   
    public Course(String courseName, String courseDescription, String coursePrice) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.coursePrice = coursePrice;
    }
    
        public String getCourseName() {
            return courseName;
        }
    
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    
        public String getCourseDescription() {
            return courseDescription;
        }
    
        public void setCourseDescription(String courseDescription) {
            this.courseDescription = courseDescription;
        }
    
        public String getCoursePrice() {
            return coursePrice;
        }
    
        public void setCoursePrice(String coursePrice) {
            this.coursePrice = coursePrice;
        }
    
        public void displayCourseInfo() {
        System.out.println("===========================================");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Course Price: Rp" + coursePrice);
    }

    // Method to display all courses (assuming a list of courses)
    public static void displayAllCourses() {
        for (Course course : courses) {
            course.displayCourseInfo();
        }
    }


    }