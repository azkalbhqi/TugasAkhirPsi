package com.TugasAkhirPSI;

import java.util.ArrayList;
import java.util.List;

class Admin{
    private String adminName;
    private String adminPassword;
    

    public Admin(String adminName, String adminPassword){
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getAdminName() {
        return adminName;
    }
                                
    public void addCourse(String courseName, String courseDescription, String coursePrice) {
        Course newCourse = new Course(courseName, courseDescription, coursePrice);
        Course.addCourse(newCourse);
        System.out.println("Course added successfully!");
    }


    

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

}
