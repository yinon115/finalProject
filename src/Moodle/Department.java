package Moodle;

import java.util.Vector;

public class Department {
    private String name;
    private Vector<Role> roles;

    public Department (String name){
        this.name = name;
        roles= new Vector<Role>();
    }

    public String getName() {
        return name;
    }
}
