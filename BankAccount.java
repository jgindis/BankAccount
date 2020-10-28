public class BankAccount {

  private int ID;
  private String pw;
  private double balance;

  public BankAccount(int accountID, String password) {
    ID = accountID;
    pw = password;
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return ID;
  }

  public void setPW(String password) {
    pw = password;
  }

  public boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      return true;
    } else return false;
  }

}
