package model;

import java.io.Serializable;

public class ObjectOK implements Serializable {
    static final long serialVersionUID = 1L;
    private Object value;

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public ObjectOK (Object value){
        this.value = value;
    }

    public ObjectOK(){
        super();
    };
}