
    public class AccountTest {
    private double balance;
    private double rate; // annual interest rate
    private int monthsRemaining;

    public AccountTest(double balance, double rate, int monthsRemaining) {
        this.balance = balance;
        this.rate = rate;
        this.monthsRemaining = monthsRemaining;
    }

    public void earnInterest() {
        if (monthsRemaining > 0) {
            balance += balance * rate / 12;
            monthsRemaining--;
            System.out.printf("Balance: $%.2f%n", balance);
            System.out.println("Rate: " + rate);
            System.out.println("Months Remaining: " + monthsRemaining);
        } else {
            System.out.println("Bond Matured");
        }
    }

    public static void main(String[] args) {
        AccountTest account = new AccountTest(1000, 0.12, 6);
        for (int i = 0; i < 7; i++) {
            account.earnInterest();
        }
    }
}

