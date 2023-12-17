package Actors;

import java.io.Serializable;
import java.util.Objects;

public class Teacher implements Serializable {

    //properties
    private String tcID;
    private Account tcAccount;
    private String tcName;
    private String tcPhoneNumber;
    private String tcEmail;

    //constructors
    public Teacher() {
    }

    public Teacher(String tcID, Account tcAccount, String tcName, String tcPhoneNumber, String tcEmail) {
        this.tcID = tcID;
        this.tcAccount = tcAccount;
        this.tcName = tcName;
        this.tcPhoneNumber = tcPhoneNumber;
        this.tcEmail = tcEmail;
    }

    //getters
    public String getTcID() {
        return tcID;
    }

    public Account getTcAccount() {
        return tcAccount;
    }

    public String getTcName() {
        return tcName;
    }

    public String getTcPhoneNumber() {
        return tcPhoneNumber;
    }

    public String getTcEmail() {
        return tcEmail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.tcID);
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
        final Teacher other = (Teacher) obj;
        return Objects.equals(this.tcID, other.tcID);
    }

}
