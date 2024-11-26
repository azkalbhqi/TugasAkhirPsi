package com.TugasAkhirPSI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
    private String username;
    private String password;
    private String email;
    private String progress;
    private String courseUser;
    private String certificate;
    private static List<Course> courses = new ArrayList<>();
    private List<Course> purchasedCourses = new ArrayList<>();

    public User(
        String username,
        String password,
        String email
    ){
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProgress() {
        return progress;
    }
    public void setProgress(String progress) {
        this.progress = progress;
    }
    public String getCourseUser() {
        return courseUser;
    }
    public void setCourseUser(String courseUser) {
        this.courseUser = courseUser;
    }
    public String getCertificate() {
        return certificate;
    }
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void buyCourse(int courseIndex) {
        if (courseIndex >= 0 && courseIndex < Course.getCourses().size()) {
            Course courseToBuy = Course.getCourses().get(courseIndex);
            // Simulate payment processing (replace with actual payment logic)
            System.out.println("Processing payment for " + courseToBuy.getCourseName());
            // ... actual payment processing logic
    
            purchasedCourses.add(courseToBuy);
            System.out.println("Course purchased successfully!");
        } else {
            System.out.println("Invalid course choice.");
        }
    }

    public List<Course> getPurchasedCourses() {
        return purchasedCourses;
    }


}
