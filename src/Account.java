public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        System.out.println("Empty constructor");
    }
    public Account(int accountNumber, double accountBalance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters");
        this.phoneNumber = phone;
        this.email = email;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = accountBalance;


    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        accountBalance += deposit;
        System.out.println("Deposit of $" + deposit + " made. New balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawal) {
        if (accountBalance - withdrawal < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in you account.");
        } else {
            accountBalance -= withdrawal;
            System.out.println("Withdrawal of $" + withdrawal + " made. New balance is $" + accountBalance);
        }
    }

}
