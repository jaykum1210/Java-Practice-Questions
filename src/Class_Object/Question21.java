package Class_Object;

class BankAccount {
    private double balance;
    void setBalance(double balance){
        if (balance<0){
            throw new IllegalArgumentException("Value is negative");
        }
        else{
            this.balance = balance;
        }
    }
    void getBalance(){
        System.out.println("Balance : " + balance);
    }
}

public class Question21 {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.setBalance(-100);
        ba.getBalance();
    }
}
