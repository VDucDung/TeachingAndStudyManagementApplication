package BaseClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class SubjectClass implements Serializable {

    //properties
    private String clID;
    private String clName;
    private String clPlace;
    private String clTime;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Group> grList = new ArrayList<>();

    //constructors
    public SubjectClass() {
    }

    public SubjectClass(String clID, String clName, String clPlace, String clTime, ArrayList<Student> students) {
        this.clID = clID;
        this.clName = clName;
        this.clPlace = clPlace;
        this.clTime = clTime;
        this.students = students;

    }

    public SubjectClass(String clID, String clName, String clPlace, String clTime) {
        this.clID = clID;
        this.clName = clName;
        this.clPlace = clPlace;
        this.clTime = clTime;
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

    public ArrayList<Group> getGrList() {
        return grList;
    }
    public void setGrList(ArrayList<Group> grList) {
        this.grList = grList;
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
        final SubjectClass other = (SubjectClass) obj;
        return Objects.equals(this.clID, other.clID);
    }

}
