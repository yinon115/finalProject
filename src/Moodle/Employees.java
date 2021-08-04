package Moodle;

public class Employees {
    protected String name;
    protected String id;
    protected int yearOfBirth;
    protected Department department;
    protected Role role;
    protected Preference preference;
    protected double salary;
    protected int favoritestart;
    protected int favoritefinish;

    public Employees (String name, String id, Department department, int yearOfBirth, Role role, Preference preference, int salary, int favoritestart) throws Exception {
        this.department=department;
        setId(id);
        setBirthyear(yearOfBirth);
        this.name=name;
        this.role=role;
        this.preference=preference;
        this.salary=salary;
        this.favoritestart=favoritestart;
        this.favoritefinish=favoritestart+9;
    }

    public String getName() {
        return name;
    }

    private boolean checkId(String id) {
        for (int i = 0; i < id.length(); i++){
            if (id.charAt(i) < 0 || id.charAt(i) > 9) {
                return false;
            }
        }
        return true;
    }

    public void setId(String id)throws Exception {
        if (id.length() != 9 && !checkId(id) ){
            throw new Exception("enter valid id");
        }
        this.id = id;
    }
    public void setBirthyear(int birthYear) throws Exception {
        if ( birthYear < 0 ) {
            throw new Exception ("Enter Valid Birth Year");
        }
        this.yearOfBirth = birthYear;
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

    public double unchangeSalary() {
        if (preference.equals(Preference.REGULAR)) {
            double salaryy = 9 * 0.2 * 10;
            return salaryy;
        } else if (preference.equals(Preference.HOME)) {
            double salaryy = -1 * 0.2 * 9 * 10;
            return salaryy;
        } else if (preference.equals(Preference.EARLY)) {
            int profitTime = Math.abs(department.getStartTime() - favoritestart);
            double profitTimeSalary = 0.2 * 9 * 10;
            int regularTime = 9 - Math.abs(profitTime);
            double regularTimeSalary = 10 * regularTime;
            return profitTimeSalary + regularTimeSalary;
        } else {
            int calculateGoodTime = Math.abs(favoritestart - department.getStartTime());
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
            int calculateBadTime = Math.abs(department.getStartTime() - favoritestart);
            double calculateBadSalary = -1 * 0.2 * calculateBadTime * 10;
            int calculateRegularTime = 9 - calculateBadTime;
            double calculateRegularSalary = calculateRegularTime * 10;
            return calculateBadSalary + calculateRegularSalary;
        }
         else if (preference.equals(Preference.EARLY)) {
            if (department.getStartTime() < 8) {
                int calculateGoodTime = Math.abs(8 - department.getStartTime());
                double calculateGoodSalary = calculateGoodTime * 0.2 * 10;
                int calculateRegularTime = 9 - calculateGoodTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateGoodSalary + calculateRegularSalary;
            }
            else if (department.getStartTime() >= 8) {
                int calculateBadTime = Math.abs(department.getStartTime() - favoritestart);
                double calculateBadSalary = calculateBadTime * -1 * 0.2 * 10;
                int calculateRegularTime = 9 - calculateBadTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateBadSalary + calculateRegularSalary;
            }
        }
         else if (preference.equals(Preference.LATE)) {
            if (department.getStartTime() >= 8) {
                int calculateGoodTime = Math.abs(department.getStartTime() - favoritestart);
                double calculateGoodSalary = calculateGoodTime * 0.2 * 10;
                int calculateRegularTime = 9 - calculateGoodTime;
                double calculateRegularSalary = calculateRegularTime * 10;
                return calculateGoodSalary + calculateRegularSalary;
            } else if (department.getStartTime() < 8) {
                int calculateBadTime = Math.abs(8 - department.getStartTime());
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
                ", department=" + department.getName() +
                ", role='" + role.getName() + '\'' +
                ", preference=" + preference.name() +
                ", salary=" + salary;
    }
}
