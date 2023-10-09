package model;

import java.io.Serializable;

public class StringOK implements Serializable {
    static final long serialVersionUID = 2L;
    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringOK (String value){
        this.value = value;
    }
}