package model;

import java.io.Serializable;

public class IntOK implements Serializable {
    static final long serialVersionUID = 3L;
    private int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntOK (int value){
        this.value = value;
    }
}