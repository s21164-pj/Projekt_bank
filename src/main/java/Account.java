import javax.validation.ConstraintValidator;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Account extends User{
    @Size(min = 26, max = 26)
    private String accountNumber;

    private String login;
    private String password;
    private long balance;
    private boolean status;

    public Account(int id, int age, String name, String secondName, int phoneNumber, String email, @Size(min = 26, max = 26) String accountNumber, String login, String password, long balance, boolean status) {
        super(id, age, name, secondName, phoneNumber, email);
        this.accountNumber = accountNumber;
        this.login = login;
        this.password = password;
        this.balance = balance;
    }



    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Your acount balance = " + this.balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("You don't have that much money");
        }else {
            balance -= amount;
            System.out.println("your acount balance = " + this.balance);
        }
    }
}
