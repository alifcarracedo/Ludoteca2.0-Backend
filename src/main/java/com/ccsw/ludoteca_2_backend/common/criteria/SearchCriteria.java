package com.ccsw.ludoteca_2_backend.common.criteria;

public class SearchCriteria {

    private String key;
    private String operation;
    private Object value;

    public SearchCriteria(String key, String operation, Object value) {

        this.key = key;
        this.operation = operation;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> f4d1771501bb51e1a2092298bfe78b0f04398474
=======
}
>>>>>>> b837e79d0928484b12c6d3ea3aba5b41750c23a8
