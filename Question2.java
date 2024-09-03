class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be greater than zero.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: "+ amount);
        } else {
            System.out.println("Deposited amount must be greater than zero.");
        }
    }

    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl amount: "+ amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawl amount must be greater than zero.");
        }
    }

    public void displayBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);
        myAccount.displayBalance();

        myAccount.deposit(500);
        myAccount.displayBalance();

        myAccount.withdrawl(200);
        myAccount.displayBalance();

        myAccount.withdrawl(2000); 
        myAccount.displayBalance();
    }
}