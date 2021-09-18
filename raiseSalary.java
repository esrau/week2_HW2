package week2;

public class raiseSalary {

    double finalSalary;

    public double raise(double salary, int workYear) {
        if (workYear == 1) {
            finalSalary = salary + (salary * 0.05);
            return finalSalary;
        } else if (workYear == 2) {
            finalSalary = salary + (salary * 0.10);
            return finalSalary;
        } else if (workYear == 3) {
            finalSalary = salary + (salary * 0.15);
            return finalSalary;
        } else if (workYear == 4) {
            finalSalary = salary + (salary * 0.20);
            return finalSalary;
        } else if (workYear >= 5) {
            finalSalary = salary + (salary * 0.25);
            return finalSalary;
        } else {
            finalSalary = salary;
            return finalSalary;
        }
    }
}
