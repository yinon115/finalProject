package Moodle;

import java.util.Vector;

public class Company {
    private final int efficient = 10;
    Vector<Department> departments = new Vector<Department>();
    Vector<Employees> base_salary = new Vector<Employees>();
    Vector<Employees> base_sales_salary = new Vector<Employees>();
    Vector<Employees> hours_salsary = new Vector<Employees>();



    public Vector<Department> getDepartments() {
        return departments;
    }
}
