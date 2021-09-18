package week2;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        System.out.println("Please enter base salary:");
        Scanner scanner = new Scanner(System.in);
        double baseSalary = scanner.nextInt();
        double bonus = 500;
        double weeklySalary;
        double weekdaySalaryAddition = 0;
        double weekendSalaryAddition = 0;
        double salaryDeduction = 0;
        int weekendWork = 0;
        double finalSalary;

        if (baseSalary < 1000) {
            System.out.println("Base salary must be grater than 1000");
        }
        double hourlySalary = (baseSalary / 40);
        System.out.println("Please enter weekday working hour:");
        int weekdayWorkingHour = scanner.nextInt();
        System.out.println("Please enter weekend working hour:");
        int weekendWorkingHour = scanner.nextInt();


        int totalWorkingHour = (weekdayWorkingHour + weekendWorkingHour);

        if ((weekdayWorkingHour < 40) && (totalWorkingHour > 40)) {
            weekendWork = totalWorkingHour - 40;
            weekendSalaryAddition = (weekendWork * hourlySalary) * 2;
        }
        if ((weekdayWorkingHour >= 40) && (weekendWorkingHour >= 0)) {
            weekdaySalaryAddition = ((weekdayWorkingHour - 40) * hourlySalary) * 1.5;
            weekendSalaryAddition = (weekendWorkingHour * hourlySalary) * 2;
        }
        if (totalWorkingHour < 40) {
            salaryDeduction = (40 - totalWorkingHour) * hourlySalary;
        }
        if (totalWorkingHour >= 40) {
            if(weekendWorkingHour >= 10){
                weeklySalary = (baseSalary + weekdaySalaryAddition + weekendSalaryAddition + bonus);
                System.out.println("Weekly salary is : " + weeklySalary);
            }
            else{
                weeklySalary = (baseSalary + weekdaySalaryAddition + weekendSalaryAddition);
                System.out.println("Weekly salary is : " + weeklySalary);
            }
        }
        else{
            weeklySalary = (baseSalary - salaryDeduction);
            System.out.println("Weekly salary is : " + weeklySalary);
        }

        System.out.println("Please enter working year: ");
        int workYear = scanner.nextInt();
        raiseSalary raise = new raiseSalary();
        scanner.close();
        finalSalary = (raise.raise(baseSalary, workYear) + (baseSalary*4));
        System.out.println("Your monthly salary is " + finalSalary);
    }
}
