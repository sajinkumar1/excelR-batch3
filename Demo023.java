import java.util.Scanner;

class TaxCalculator {
    public double calculateAnnualSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    public double calculateDeductions(double hra, double pf) {
        return (hra + pf) * 12;
    }

    public double calculateTaxableIncome(double annualSalary, double deductions) {
        return annualSalary - deductions;
    }

    public double calculateTax(double taxableIncome) {
        double tax = 0;
        if (taxableIncome > 1000000) {
            tax += (taxableIncome - 1000000) * 0.30;
            taxableIncome = 1000000;
        }
        if (taxableIncome > 500000) {
            tax += (taxableIncome - 500000) * 0.20;
            taxableIncome = 500000;
        }
        tax += taxableIncome * 0.10;
        return tax;
    }
}

public class Demo023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxCalculator calculator = new TaxCalculator();

        System.out.print("Enter monthly salary: ");
        double monthlySalary = sc.nextDouble();
        System.out.print("Enter monthly HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter monthly PF: ");
        double pf = sc.nextDouble();

        double annualSalary = calculator.calculateAnnualSalary(monthlySalary);
        double deductions = calculator.calculateDeductions(hra, pf);
        double taxableIncome = calculator.calculateTaxableIncome(annualSalary, deductions);
        double tax = calculator.calculateTax(taxableIncome);

        System.out.println("Total Tax Payable: Rs " + tax);
        sc.close();
    }
}