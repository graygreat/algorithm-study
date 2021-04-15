package etc.godOfJava;

// Chapter 5
public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println(salaryManager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthSalary = yearlySalary / 12.0;
        double tax = calculateTax(monthSalary);
        double nationalPension = calculateNationalPension(monthSalary);
        double healthInsurance = calculateHealthInsurance(monthSalary);

        double minusTotal = tax + nationalPension + healthInsurance;

        monthSalary -= minusTotal;
        return monthSalary;
    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary * 0.125;
        System.out.println(tax);
        return tax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationalPension = monthSalary * 0.081;
        System.out.println(nationalPension);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthInsurance = monthSalary * 0.135;
        System.out.println(healthInsurance);
        return healthInsurance;
    }
}
