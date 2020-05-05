package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    private void setName(String aName) {
        name = aName;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int aStudentID) {
        studentId = aStudentID;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        studentId = aNumberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

}