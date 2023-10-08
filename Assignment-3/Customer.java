import java.math.BigDecimal;

public class Customer {
    public static void main(String[] args) {
        BankService myBankService = new BankService();


        //Create new savings and investment accounts
        int mySaving = myBankService.createNewAccount("saving",100200,
                new BigDecimal("500.00"));
        int myInvestment =
                myBankService.createNewAccount("investment",100201, new
                        BigDecimal("1000.00"));


        //check the balance of accounts
        IAccount savingAccount=myBankService.getAccount(mySaving);
        IAccount investmentAccount=myBankService.getAccount(myInvestment);
        Saving saving =(Saving)savingAccount;
        Investment investment=(Investment)investmentAccount;

        //before Transfer
        System.out.println("Before Transfer");
        System.out.println("Saving Account Balance: "+saving.getBalance());
        System.out.println("Investment Account Balance: "+investment.getBalance());

        //transfer money to saving to investment
        BigDecimal transferAmount= new BigDecimal("200.00");
        myBankService.transferMoney(myInvestment,mySaving,transferAmount);

        System.out.println("\nAfter Transfer");
        System.out.println("Saving Account Balance: "+saving.getBalance());
        System.out.println("Investment Account Balance: "+investment.getBalance());
        }
    }
