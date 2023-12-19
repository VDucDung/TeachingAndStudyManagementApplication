package Actors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Classrooms implements Serializable {

    //properties
    private String clID;
    private String clName;
    private String clPlace;
    private String clTime;
    private ArrayList<Student> students; 
    

   
    //constructors
    public Classrooms() {
    }

    public Classrooms(String clID, String clName, String clPlace, String clTime, ArrayList<Student> students) {
        this.clID = clID;
        this.clName = clName;
        this.clPlace = clPlace;
        this.clTime = clTime;
        this.students = students;
    }

    //getters
     public ArrayList<Student> getStudents() {
        return students;
    }
    public String getClID() {
        return clID;
    }

    public String getClName() {
        return clName;
    }

    public String getClPlace() {
        return clPlace;
    }

    public String getClTime() {
        return clTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.clID);
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
        final Classrooms other = (Classrooms) obj;
        return Objects.equals(this.clID, other.clID);
    }

}
