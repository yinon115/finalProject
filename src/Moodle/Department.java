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

    @Override
    public String toString() {
        String str= "Department{" +
                "name='" + name + "the roles are\n";
        for (int i=0; i<roles.size(); i++){
            str+=roles.get(i).getName()+"\n";
        }
        return str;

    }
}
