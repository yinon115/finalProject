package Controller;

import Moodle.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Vector;

public class Controller implements CompanyUI {

    private Company company;

    @Override
    public void addEmployee(String name, String lastName, int id, Preference preference, LocalTime time, LocalDate birthday, double salary, Role role, Department department, int kind) throws IdException {

    }

    @Override
    public void addDepartment(String name, int kind) {

    }

    @Override
    public void addRole(String name, int kind) {

    }

    @Override
    public void showWorkers() {

    }

    @Override
    public void changeRole(Role role, LocalTime time) {

    }

    @Override
    public void changeDepartment(Department department, LocalTime time) {

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Vector<Department> getDepartment(){
        return company.getDepartments();
    }

    public Vector<Role> getRole(Department department){
        int numofdep= company.getDepartments().indexOf(department);
        return company.getDepartments().get(numofdep).getRoles();
    }

}
