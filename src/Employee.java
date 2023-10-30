public class Employee {
   private static int i =0;
    private TotalName totalName;
    private int department;
    private int salary;
    private int id;


    public Employee(TotalName totalName, int department, int salary) {
        this.totalName = totalName;
        this.department = department;
        this.salary = salary;
        i++;
        this.id = i;
    }

    public TotalName getTotalName() {
        return totalName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getI() {
        return i;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                  totalName +
                " Отдел #" + department +
                ", зарплата " + salary +
                ", id " + id;
    }
}
