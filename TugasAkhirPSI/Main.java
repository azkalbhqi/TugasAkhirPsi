package com.TugasAkhirPSI;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Admin admin = new Admin("Azkal","Admin");
        User user = new User("Ilham", "password", "ilham@gmail.com");

        Course course1 = new Course("Coding Python", "python adalah ...", "100000");
        Course course2 = new Course("Coding Java", "java adalah ...", "200000");
        Course course3 = new Course("Coding SQL", "AQLadalah ...", "130000");
        Course.addCourse(course1);
        Course.addCourse(course2);
        Course.addCourse(course3);
        

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Admin");
            System.out.println("2. User"); // Placeholder for future features
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1://Admin
                    int adminOption;
                    String adminName = admin.getAdminName();
                    do {
                        System.out.println("Halo," + adminName);
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. Add Course");
                        System.out.println("2. See Course");
                        System.out.println("0. Back");
                        System.out.print("Enter your choice: ");

                        adminOption = input.nextInt();

                        switch (adminOption) {
                            case 1:
                                System.out.print("Enter Course Name: ");
                                String courseName = input.next();
                                System.out.print("Enter Course Description: ");
                                String description = input.nextLine();
                                input.next();
                                System.out.print("Enter Course Price (double): ");
                                
                                
                                String price = input.next();
                                input.nextLine(); 
                                admin.addCourse(courseName, description, price);
                                break;
                            case 2:
                                Course.displayAllCourses();
                                break;
                            case 0:
                                System.out.println("Back to Main Menu");
                                break;
                            default:
                                System.out.println("Invalid admin option. Please try again.");
                        }
                    } while (adminOption != 0);
                    break;
                case 2: //User
                do {
                    String username = user.getUsername();
                    System.out.println("halo,"+ username);
                    System.out.println("\nMain Menu:");
                    System.out.println("1. View Courses");
                    System.out.println("2. Buy Course");
                    System.out.println("3. View Purchased Courses");
                    System.out.println("0. Exit");
                    System.out.print("Enter your choice: ");
        
                    choice = input.nextInt();
        
                    switch (choice) {
                        case 1:
                            Course.displayAllCourses();
                            break;
                        case 2:
                            Course.displayAllCourses();

                            // Prompt user to choose a course
                            System.out.print("Enter the index of the course you want to buy: ");
                            int courseChoice = input.nextInt() - 1;
                            user.buyCourse(courseChoice);
                            break;
                        case 3:
                            user.getPurchasedCourses().forEach(Course::displayCourseInfo);
                            break;
                        case 0:
                            System.out.println("Exiting program...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 0);
                     
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        input.close(); // Close Scanner to avoid resource leaks
    }
}
                        
                            
                           

class Certificate{
    private String certificateId;
    private String certificateDate;
    private Course course;
    public String getCertificateId() {
        return certificateId;
    }
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    public String getCertificateDate() {
        return certificateDate;
    }
    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}

class Payment{
    private String paymentId;
    private String paymentStatus;
    private String amount;
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }

}

class Progress{
    private String progressId;
    private Course course;
    private double progressPercentage;
    public String getProgressId() {
        return progressId;
    }
    public void setProgressId(String progressId) {
        this.progressId = progressId;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public double getProgressPercentage() {
        return progressPercentage;
    }
    public void setProgressPercentage(double progressPercentage) {
        this.progressPercentage = progressPercentage;
    }
}