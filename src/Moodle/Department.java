package Moodle;

import java.time.LocalTime;
import java.util.Vector;

public class Department {
    private String name;
    private Vector<Role> roles;
    private int startTime;
    private int finishTime;

    public Department (String name){
        this.name = name;
        roles= new Vector<Role>();
    }

    public String getName() {
        return name;
    }

    public Vector<Role> getRoles() {
        return roles;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void addRole (Role role){
        roles.add(role);
    }

    @Override
    public String toString() {
        String str= "Department{" +
                "name='" + name + "the roles are\n";
        for (int i=0; i<roles.size(); i++){
            str+=roles.get(i).getName()+"\n";
            str+= roles.get(i).toString();
        }
        return str;

    }
}
