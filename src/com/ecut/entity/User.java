package com.ecut.entity;

import java.io.Serializable;

/**
 * @author Amy
 * @date 2019-07-03 18:45
 * @description:
 */
public class User implements Serializable {

    private int id;

    private String name;

    public User(int id , String name){
        this.id = id ;
        this.name = name ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
