package Practice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    
    private String accountNo;
    private String name;
    private long balance;
    private List<Transaction> transactions;
    
    
    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        transactions = new ArrayList<Transaction>();
    }
    
    
    
    
    public String getAccountNo() {
        return accountNo;
    }




    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
                + transactions + "]";
    }




    //계좌 입금
    public void deposit(long amount) {
        Transaction t = new Transaction();
        balance += amount;
        
        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm:ss");
        Date datetime = new Date();
        
        String sdfdat = sdfdate.format(datetime);
        String sdftim = sdftime.format(datetime);
        
        t.setAmount(amount);
        t.setBalance(balance);
        t.setKind("입금");
        t.setTransactionDate(sdfdat);
        t.setTransactionTime(sdftim);
        transactions.add(t);
        
    }
    //계좌 출금
    public void withdraw(long amount) {
        Transaction t = new Transaction();
        balance -= amount;
        
        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm:ss");
        Date datetime = new Date();
        
        String sdfdat = sdfdate.format(datetime);
        String sdftim = sdftime.format(datetime);
        
        t.setAmount(amount);
        t.setBalance(balance);
        t.setKind("출금");
        t.setTransactionDate(sdfdat);
        t.setTransactionTime(sdftim);
        transactions.add(t);
        
    }
    
    //잔고 확인
    public long getBalance() {
        
        
        
        return balance;
    }
    
    //거래내역
    public List<Transaction> getTransations(){
        
        for(Transaction t : transactions) {
            System.out.println(t);
        }
        
        return transactions;
    }
    

}
