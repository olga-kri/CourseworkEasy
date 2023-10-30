public class Main {
    private static Employee[] employees = new Employee[10];

    //Создать статические методы, которые будут взаимодействовать с массивом b предоставлять результат:
    // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).

    public static void printAllIformation( Employee[] arr ) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц

    public static int calculateTotalSalary() {
        int sum =0;
        for (Employee employees: employees) {
            if (employees != null) {
                sum = sum + employees.getSalary();
            }
        }
    return sum;
    }


    // Найти сотрудника с минимальной зарплатой

    public static Employee findEmployeeWithMinSalary() {
        Employee thisEmploye = employees[0];
        int minSalary = thisEmploye.getSalary();
        for (Employee employees : employees) {
            if (employees.getSalary() < minSalary && employees != null) {
                minSalary = employees.getSalary();
                thisEmploye = employees;
            }

        }
        return thisEmploye;
    }

// Найти сотрудника с максимальной зарплатой

    public static Employee findEmployeeWithMaxSalary() {
        Employee thisEmploye = employees[0];
        int maxSalary = thisEmploye.getSalary();
        for (Employee employees : employees) {
            if (employees.getSalary() > maxSalary && employees != null) {
                maxSalary = employees.getSalary();
                thisEmploye = employees;
            }

        }
        return thisEmploye;
    }

    //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b)

    public static float calculateAverageSalary () {
        return calculateTotalSalary()/ Employee.getI();
    }

    // Получить Ф. И. О. всех сотрудников (вывести в консоль)

    public static void printAllNames() {
        for (Employee employees: employees) {
            System.out.println(employees.getTotalName());
        }
    }
    public static void main (String[] args) {
        TotalName robertBaratheon = new TotalName("Роберт", "Баратеон", "");
        TotalName stanisBaratheon = new TotalName( "Станис", "Баратеон","");
        TotalName renlyBaratheon = new TotalName( "Ренли", "Баратеон", "");
        TotalName tywinLanister = new TotalName( "Тайвин", "Ланистер", "");
        TotalName jaimeLanister = new TotalName( "Джейми", "Ланистер", "");
        TotalName cerrseiLanister = new TotalName("Серсея", "Ланистер", "");
        TotalName tyrionLanister = new TotalName("Тирион", "Ланистер","");
        TotalName dynerisTargarian = new TotalName("Дайнерис", "Таргариан","");
        TotalName brandonStark = new TotalName( "Брендон", "Старк","");
        TotalName jhonSnow = new TotalName( "Джон", "Сноу","");


      employees [0]  = new Employee(robertBaratheon, 1, 1000000);
      employees [1]  = new Employee(stanisBaratheon, 1, 200000);
      employees [2]  = new Employee(renlyBaratheon, 1, 250000);
      employees [3]  = new Employee(tywinLanister, 2, 3500000);
      employees [4]  = new Employee(jaimeLanister, 2, 880000);
      employees [5]  = new Employee(cerrseiLanister, 2, 1000000);
      employees [6]  = new Employee(tyrionLanister, 2, 350000);
      employees [7]  = new Employee(dynerisTargarian, 3, 50000);
      employees [8]  = new Employee(brandonStark, 4, 80000);
      employees [9]  = new Employee(jhonSnow, 5, 35000);

      printAllIformation(employees);
      System.out.println("Сумма зарплат всех сотрудников за месяц: " + calculateTotalSalary());
      System.out.println("У сотрудника " + findEmployeeWithMinSalary().getTotalName()+ " - самая маленькая зарплата (" + findEmployeeWithMinSalary().getSalary()+")");
      System.out.println("У сотрудника " + findEmployeeWithMaxSalary().getTotalName()+ " - самая большая зарплата (" + findEmployeeWithMaxSalary().getSalary()+")");
      System.out.println("Средняя зарплата всех сотрудников " + calculateAverageSalary());
      printAllNames();
    }
}
