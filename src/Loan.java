import java.util.Date;

public class Loan {
    double annualInterestRate = 2.5;
    int numberOfYears = 1;
    double loanAmount = 1000;
    java.util.Date loanDate = new Date();

    Loan(){}
    Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setAnnualInterestRate(){
        this.annualInterestRate = annualInterestRate;
    }
    public void setNumberOfYears(){
        this.numberOfYears = numberOfYears;
    }

    public double getMonthlyPayment(){
        return loanAmount * annualInterestRate / 12;
    }
    public double getTotalPayment(){
        return loanAmount * numberOfYears * annualInterestRate;
    }
}
