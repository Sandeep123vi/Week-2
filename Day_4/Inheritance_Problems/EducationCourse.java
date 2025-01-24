package com.mycompany.inheritance;

class Course {

    //Attributes
    protected String courseName;
    protected int duration;
    //Constructor

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String setCourseName() {
        return courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int setDuration() {
        return duration;
    }

    public int getDuration() {
        return duration;
    }
    //Method to display about course

    public void display() {
        System.out.println("The course name is : " + courseName);
        System.out.println("The course duration is : " + duration);

    }
}
//create OnlineCourse class extends with Course

class OnlineCourse extends Course {
//Attributes

    protected String platform;
    protected boolean isRecorded;

    public String setPlateform() {
        return platform;
    }

    public String getPlateform() {
        return platform;
    }

    public boolean setIsRecorded() {
        return isRecorded;
    }

    public boolean getIsRecorded() {
        return isRecorded;
    }
//Constructor 

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.isRecorded = isRecorded;
        this.platform = platform;
    }
//Methos to display about course 

    public void display() {
        System.out.println("The course name is :" + courseName);
        System.out.println("The duration name is :" + duration);
        System.out.println("The plateform name is :" + platform);
        System.out.println("The record name is :" + isRecorded);
    }

}
//create PaidOnlineCourse clss extends OnlineCourse

class PaidOnlineCourse extends OnlineCourse {
    //Attributes

    private int fee;
    private int discount;
//Constructor 

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

//Method to display about PiadOnline Courses
    public void display() {
        System.out.println("Course name :" + courseName);
        System.out.println("Course duration :" + duration + " Weeks");
        System.out.println("Course platform :" + platform);
        System.out.println("Course discount:" + discount);
        System.out.println("Course fee  :" + fee);
        System.out.println("Course Record :" + isRecorded);

    }
}
// main class 

public class EducationCourse {

    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java", 6, "Youtube", true, 4500, 1000);
        course.display();

    }

}
