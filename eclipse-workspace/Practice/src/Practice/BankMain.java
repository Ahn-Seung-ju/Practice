package Practice;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.addAccount("13123", "안승주");
        bank.addAccount("12323", "안승주");
        bank.addAccount("12123", "안승주");
        bank.addAccount("1212", "안승주");
        
        bank.getAccounts();
        bank.getAccount("1212");
        bank.getAccount("13123").deposit(1000000000);
        bank.getAccount("13123").getTransations();

    }

}
