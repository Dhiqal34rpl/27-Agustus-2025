public class Bond {
    public String name;
    public double balance, rate;
    public int term, monthsRemaining;

    // Konstruktor
    public Bond(String name, double balance, double rate, int term) {
        this.name = name;
        this.balance = balance;
        this.rate = rate;
        this.term = term;
        this.monthsRemaining = term;
    }

    // Method untuk menghitung bunga bulanan
    public void earnInterest() {
        if (monthsRemaining > 0) {
            balance += balance * rate / 12;
            monthsRemaining--;
            System.out.printf("Balance: $%.2f%n", balance);
            System.out.printf("Rate: %.2f%%%n", rate * 100);
            System.out.println("Months Remaining: " + monthsRemaining);
        } else {
            System.out.println("Bond Matured");
        }
    }

    // Method untuk menampilkan informasi bond
    public void displayInfo() {
        System.out.println("Bond Name: " + name);
        System.out.printf("Initial Balance: $%.2f%n", balance);
        System.out.printf("Annual Rate: %.2f%%%n", rate * 100);
        System.out.println("Term (months): " + term);
        System.out.println("Months Remaining: " + monthsRemaining);
    }
}

