package Moodle;

public class Employees {
    private String name;
    private String id;
    private int yearofbirth;
    private Department department;
    private String role;
    private Preference preference;
    private int salary;

    public Employees (String name,String id,Department department,int yearofbirth, String role, Preference preference,int salary){
        this.department=department;
        this.id=id;
        this.name=name;
        this.yearofbirth=yearofbirth;
        this.role=role;
        this.preference=preference;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Preference getPreference() {
        return preference;
    }

    public String getId() {
        return id;
    }
    
    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department=" + department +
                ", role='" + role + '\'' +
                ", preference=" + preference +
                ", salary=" + salary;
    }
}
