package throwDemo;

public class AccountManager {
    private double balance;

    public  void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdrow(double amount) throws BalanceInsufficentException {
        if (balance>=amount){
            balance=getBalance()-amount;
        }else {
            throw new BalanceInsufficentException("Bakiye Yetersizdir");
        }
    }

    public double getBalance() {
        return balance;
    }
}
