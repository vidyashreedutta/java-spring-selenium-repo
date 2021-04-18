package com.company.name.basics.collectns;

public class NamesDTO {

    private String fName;
    private String lName;

    public NamesDTO(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
