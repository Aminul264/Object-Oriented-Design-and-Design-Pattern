import  java.math.BigDecimal;
public class Chequing  implements  IAccount{
    private int accountNumber;
    private BigDecimal balance;

    public Chequing(int accountNumber,BigDecimal initAmount) {
        this.accountNumber=accountNumber;
        this.balance=initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

        this.balance=this.balance.add(amount);
        System.out.println("Deposited balance : "+amount);
        System.out.println(" Successfully Deposited ");

    }

    @Override
    public void withdraw(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO)<=0){
            System.out.println("Invalid withdrawal amount");
        }else{
            balance=balance.subtract(amount);
            System.out.println("Withdraw successful");
            System.out.println("Withdrawal amount : "+amount);
        }
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO)<=0){
            System.out.println("Invalid transfer amount");
        }else{
            balance=balance.subtract(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer Balance : "+amount);
        }
    }

    @Override
    public int getAccountNumber() {

        return accountNumber;
    }
    public BigDecimal getBalance(){
        return  balance;
    }
}

