package Moodle;

import java.time.LocalTime;

public class Employees {
    protected String name;
    protected String id;
    protected int yearofbirth;
    protected Department department;
    protected Role role;
    protected Preference preference;
    protected double salary;
    protected LocalTime favoritestart;
    protected LocalTime favoritefinish;

    public Employees (String name,String id,Department department,int yearofbirth, Role role, Preference preference,int salary,LocalTime favoritestart){
        this.department=department;
        this.id=id;
        this.name=name;
        this.yearofbirth=yearofbirth;
        this.role=role;
        this.preference=preference;
        this.salary=salary;
        this.favoritestart=favoritestart;
        this.favoritefinish=favoritestart.plusHours(9);
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Preference getPreference() {
        return preference;
    }

    public String getId() {
        return id;
    }
    
    public Role getRole() {
        return role;
    }

    public double calculateSalaryIfNotChangable() {
        if (preference.equals(Preference.REGULAR)) {
            double salaryy = 9 * 0.2 * 10;
            return salaryy;
        } else if (preference.equals(Preference.HOME)) {
            double salaryy = -1 * 0.2 * 9 * 10;
            return salaryy;
        } else if (preference.equals(Preference.EARLY)) {
            int calculateGoodTime = Math.abs(department.getStartTime().getHour() - favoritestart.getHour());
            double salaryFromGoodTime = 0.2 * 9 * 10;
            int calculateRegularTime = 9 - Math.abs(calculateGoodTime);
            double salaryFromRegularTime = 10 * calculateRegularTime;
            return salaryFromGoodTime + salaryFromRegularTime;
        } else {
            int calculateGoodTime = Math.abs(favoritestart.getHour() - department.getStartTime().getHour());
            double salaryFromGoodTime = 0.2 * 9 * 10;
            int calculateRegularTime = 9 - Math.abs(calculateGoodTime);
            double salaryFromRegularTime = calculateRegularTime * 10;
            return salaryFromGoodTime + salaryFromRegularTime;
        }

    }

    private double syncSalary() {
        if (preference.equals(Preference.HOME))
            return -1 * 9 * 0.2 * 10;
         else if (preference.equals(Preference.REGULAR)) {
            int calculateBadTime = Math.abs(department.getStartTime().getHour() - favoritestart.getHour());
            double calculateBadSalary = -1 * 0.2 * calculateBadTime * 10;
            int calculateRegularTime = 9 - calculateBadTime;
            double calculateRegularSalary = calculateRegularTime * 10;
            return calculateBadSalary + calculateRegularSalary;
        }
         else if (preference.equals(Preference.EARLY)) {
            if (department.getStartTime().getHour() < 8) {
                int calculateGoodTime = Math.abs(8 - department.getStartTime().getHour());
                double calculateGoodSalary = calculateGoodTime * 0.2 * 10;
                int calculateRegularTime = 9 - calculateGoodTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateGoodSalary + calculateRegularSalary;
            }
            else if (department.getStartTime().getHour() >= 8) {
                int calculateBadTime = Math.abs(department.getStartTime().getHour() - favoritestart.getHour());
                double calculateBadSalary = calculateBadTime * -1 * 0.2 * 10;
                int calculateRegularTime = 9 - calculateBadTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateBadSalary + calculateRegularSalary;
            }
        }
         else if (preference.equals(Preference.LATE)) {
            if (department.getStartTime().getHour() >= 8) {
                int calculateGoodTime = Math.abs(department.getStartTime().getHour() - favoritestart.getHour());
                double calculateGoodSalary = calculateGoodTime * 0.2 * 10;
                int calculateRegularTime = 9 - calculateGoodTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateGoodSalary + calculateRegularSalary;
            } else if (department.getStartTime().getHour() < 8) {
                int calculateBadTime = Math.abs(8 - department.getStartTime().getHour());
                double calculateBadSalary = -1 * calculateBadTime * 0.2 * 10;
                int calculateRegularTime = 9 - calculateBadTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateBadSalary + calculateRegularSalary;
            }
        }
        return 0;
    }
    private double regularSalary() {
        if (preference.equals(Preference.HOME)) {
            return 0.1 * 9 * 10;
        } else {
            return 0.2 * 9 * 10;
        }
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
