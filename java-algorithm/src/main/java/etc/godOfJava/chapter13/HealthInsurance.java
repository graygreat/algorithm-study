package etc.godOfJava.chapter13;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0),
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);

    private final int maxSalary;
    private final double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        if (salary < 1000) {
            return LEVEL_ONE;
        }
        if (salary < 2000) {
            return LEVEL_TWO;
        }
        if (salary < 3000) {
            return LEVEL_THREE;
        }
        if (salary < 4000) {
            return LEVEL_FOUR;
        }
        if (salary < 5000) {
            return LEVEL_FIVE;
        }
        return LEVEL_SIX;
    }

    public static void main(String[] args) {
        int[] salaryArray = new int[]{1500, 5500, 8800};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(salaryArray[i] + " = " + insurances[i] + ", " + insurances[i].getRatio());
        }
    }

}
