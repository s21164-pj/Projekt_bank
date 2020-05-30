public class Account extends User{
    public long accountNumber;
    private String login;
    private String password;
    private long balance;

    public Account(int id, int age, String name, String secondName, int phoneNumber, String email, long accountNumber, String login, String password, long balance) {
        super(id, age, name, secondName, phoneNumber, email);
        this.accountNumber = accountNumber;
        this.login = login;
        this.password = password;
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
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
}
