package com.mirkamolcode.questionnaire;

import java.util.Date;

public class QurestionnairePerson {
    private String name;
    private String email;
    private Date dob;

    public QurestionnairePerson(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDob() {
        return dob;
    }
}
