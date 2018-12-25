package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by GaoHangHang 2018-05-09 16:45
 **/
public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private short age;
    private Map<String, String> relationship;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Map<String, String> getRelationship() {
        return relationship;
    }

    public void setRelationship(Map<String, String> relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + ", relationship=" + relationship + "]";
    }
}

