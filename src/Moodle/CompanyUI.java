package Moodle;

import java.time.LocalDate;
import java.time.LocalTime;

public interface CompanyUI {
    public void addEmployee(String name, String lastName, int id, Preference preference, LocalTime time, LocalDate birthday, double salary, Role role, Department department, int kind) throws IdException;

    public void addDepartment(String name, int kind);

    public void addRole(String name, int kind);

    public void showWorkers();

    public void changeRole(Role role, LocalTime time);

    public void changeDepartment(Department department, LocalTime time);
}
