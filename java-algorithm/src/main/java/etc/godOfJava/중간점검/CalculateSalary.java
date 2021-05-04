package etc.godOfJava.중간점검;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        long salary = 0;
        switch (employee.getType()) {
            case 1:
                salary = (long) (employee.getSalary() * 0.05);
                break;
            case 2:
                salary = (long) (employee.getSalary() * 1.1);
                break;
            case 3:
                salary = (long) (employee.getSalary() * 1.2);
                break;
            case 4:
                salary = (long) (employee.getSalary() * 1.3);
                break;
            case 5:
                salary = employee.getSalary() * 2;
                break;
        }
        return salary;
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
        employees[1] = new Employee("KimManager", 2, 100000000);
        employees[2] = new Employee("WhanDesign", 3, 70000000);
        employees[3] = new Employee("ParkArchi", 4, 80000000);
        employees[4] = new Employee("LeeDevelop", 5, 60000000);

        for (int i = 0; i < 5; i++) {
            System.out.println(employees[i].getName() + "=" + getSalaryIncrease(employees[i]));
        }
    }
}
