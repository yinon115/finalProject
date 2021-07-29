package Moodle;

import java.util.Vector;

public class Role {
    private String name;
    private Vector<Employees> employees;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String str = "The employes in:"+name+"role are:\n";
        for (int i=0; i<employees.size(); i++){
            str+=employees.get(i).toString()+"\n";
        }
        return str;
    }
}
