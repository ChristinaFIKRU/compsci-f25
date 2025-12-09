// Christina F
// Program test account
// 11/4/25

public class TestAccount{
    public static void main (String[] args){
        AccountClass ac = new AccountClass (1122, 20000); 
        ac.setAnnualInterestRate(4.5);
        ac.withdraw(2500);
        ac.deposit(3000);

        System.out.println("Balance: $" + ac.getBalance());
        System.out.println("Monthly Interest: $" + ac.getMonthlyInterestRate());
        System.out.println("Date Created:" + ac.getDateCreated());
        
        

    }
}