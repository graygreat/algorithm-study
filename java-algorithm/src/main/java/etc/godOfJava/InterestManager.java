package etc.godOfJava;

// Chapter 6
public class InterestManager {

    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();
        for (int day = 10; day <= 370; day += 10) {
            double totalAmount = interestManager.calculateAmount(day, 1000000);
            System.out.printf("%d일째 : %f\n", day, totalAmount);
        }
    }

    public double getInterestRate(int day) {
        if (day <= 90) {
            return 0.5;
        } else if (day >= 91 && day <= 180) {
            return 1;
        } else if (day >= 181 && day <= 364) {
            return 2;
        } else {
            return 5.6;
        }
    }

    public double calculateAmount(int day, long amount) {
        double interest = getInterestRate(day);
        double totalAmount = amount + amount * (interest / 100);
        return totalAmount;
    }
}
