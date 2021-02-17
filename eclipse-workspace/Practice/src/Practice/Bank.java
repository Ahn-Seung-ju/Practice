package Practice;



import java.util.ArrayList;
import java.util.List;

public class Bank {
    
    private List<Account> accounts;
    private int totalAccount;
    
    //계좌 추가
    Bank(){
        accounts = new ArrayList<Account>();
    }
    
    public void addAccount(String accountNo, String name) {
        accounts.add(new Account(accountNo, name));
        totalAccount++;
    }
    
    
    //계좌 번호로 찾기
    public Account getAccount(String accountNo){
        Account value = null;
        for(Account act: accounts) {
            if(act.getAccountNo().equals(accountNo)) {
                value = act;
            }
        }
        System.out.println(value);
        return value;
    }
    
    //계좌 이름으로 찾기
    public List<Account> findAccounts(String name){
        List<Account> value = new ArrayList<Account>();
        for(Account act : accounts) {
            if(act.getName().equals(name)) {
                value.add(act);
            }
        }
        System.out.println(value);
        return value;
    }
    
    //계좌 목록
    public List<Account> getAccounts(){
        for(Account act : accounts) {
            System.out.println(act);
        }
        return accounts;
    }
    
    //계좌 갯수
    public int getTotalAccount() {
        System.out.println("총 계좌 갯수: " + totalAccount);
        return totalAccount;
    }

}
