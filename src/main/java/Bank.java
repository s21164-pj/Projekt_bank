import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private String BankId;
    private List<Account> accountList = new ArrayList<Account>();

    public Bank(String bankName, String bankId, List<Account> accountList) {
        this.bankName = bankName;
        BankId = bankId;
        this.accountList = accountList;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankId() {
        return BankId;
    }

    public void setBankId(String bankId) {
        BankId = bankId;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
