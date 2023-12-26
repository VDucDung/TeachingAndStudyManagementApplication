package BaseClasses;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

public class Group implements Serializable {

    //properties
    private String grID;
    private int grSlotNumber;
    private String grEvaluation;
    private ArrayList<Student> memberList = new ArrayList<>();

    //constructors
    public Group() {
    }

    public Group(String grID, int grSlotNumber, String grEvaluation) {
        this.grID = grID;
        this.grSlotNumber = grSlotNumber;
        this.grEvaluation = grEvaluation;
    }

    public Group(int grSlotNumber) {
        this.grSlotNumber = grSlotNumber;
    }

    //getters
    public String getGrID() {
        return grID;
    }

    public int getGrSlotNumber() {
        return grSlotNumber;
    }

    public String getGrEvaluation() {
        return grEvaluation;
    }

    public ArrayList<Student> getMemberList() {
        return memberList;
    }

    //setters
    public void setGrEvaluation(String grEvaluation) {
        this.grEvaluation = grEvaluation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.grID);
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
        final Group other = (Group) obj;
        return Objects.equals(this.grID, other.grID);
    }

}
