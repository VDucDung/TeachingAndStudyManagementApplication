package Actors;

import java.io.Serializable;

public class Account implements Serializable {

    //properties
    private String acType;
    private String acUserPassword;

    //constructors
    public Account() {
    }

    public Account(String acType, String acUserPassword) {
        this.acType = acType;
        this.acUserPassword = acUserPassword;
    }

    //getters
    public String getAcType() {
        return acType;
    }

    public String getAcUserPassword() {
        return acUserPassword;
    }

}
