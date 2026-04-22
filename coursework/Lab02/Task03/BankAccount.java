package Task3;

public class BankAccount {

    private double balance;
    private String accountHolder;

    public BankAccount(double balance, String accountHolder){

        this.balance = balance;
        this.accountHolder = accountHolder;

    }

    public boolean deposit (double amount){
        if (amount > 0){
            balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdrawal (double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

}
