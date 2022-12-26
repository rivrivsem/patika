package patikaDesignPattern;

public class Account {
    private float balance;
    public void deposit(float amount){
        if (amount>0)
         balance+=amount;
    }
    public void witdraw(float amount){
        if (amount>0)
            balance-=amount;

    }
    public void setBalance(float balance){
        if (balance>0)
        this.balance=balance;
    }
    public float getBalance(){
        return balance;
    }
}
