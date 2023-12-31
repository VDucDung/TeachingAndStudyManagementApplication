package BaseClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Student implements Serializable, Comparable<Student> {

    //properties
    private String stID;
    private Account stAccount;
    private String stName;
    private String stGender;
    private String stClass;
    private String stDepartment;
    private String stBatch;
    private String stPhoneNumber;
    private String stEmail;
    private String stAddress;

    //construtctors
    public Student() {
    }

    public Student(String stID, String stName) {
        this.stID = stID;
        this.stName = stName;
    }
    
    public Student(String stID, Account stAccount, String stName, String stGender, String stClass, String stDepartment, String stBatch) {
        this.stID = stID;
        this.stAccount = stAccount;
        this.stName = stName;
        this.stGender = stGender;
        this.stClass = stClass;
        this.stDepartment = stDepartment;
        this.stBatch = stBatch;
    }

    public Student(String stID, Account stAccount, String stName, String stGender, String stClass, String stDepartment, String stBatch, String stAddress, String stPhoneNumber) {
       this.stID = stID;
        this.stAccount = stAccount;
        this.stName = stName;
        this.stGender = stGender;
        this.stClass = stClass;
        this.stDepartment = stDepartment;
        this.stBatch = stBatch;
        this.stAddress = stAddress;
        this.stPhoneNumber = stPhoneNumber;
    }

    //getters
    public String getStID() {
        return stID;
    }

    public Account getStAccount() {
        return stAccount;
    }

    public String getStName() {
        return stName;
    }

    public String getStGender() {
        return stGender;
    }

    public String getStClass() {
        return stClass;
    }

    public String getStDepartment() {
        return stDepartment;
    }

    public String getStBatch() {
        return stBatch;
    }

    public String getStPhoneNumber() {
        return stPhoneNumber;
    }

    public String getStEmail() {
        return stEmail;
    }

    public String getStAddress() {
        return stAddress;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.stID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.stID, other.stID);
    }

    @Override
    public int compareTo(Student o) {
        return this.getStName().compareTo(o.getStName());
    }

}
