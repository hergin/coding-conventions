package edu.bsu.cs.hergin.cs691.checkstyle;

public class atM {

  private double balance;

  public double get_balance() {
    return balance;
  }

  /*
   * This class is licensed with GPL.
   */
  
  public atM(double initialBalance) {
    this.balance = initialBalance;
  }
  
  /**
   * Deposits money into account.
   * @param amnt amount of money to be deposited.
   * @return true.
   */
  public boolean deposit(double amnt) {
    if (amnt < 0) {
      return false;
    }
    this.balance += amnt;
    return true;
  }

  // This class does withdraw.
  /**
   * Withdraws money from account.
   * @param amount the amount of money to be withdrawn.
   * @return true.
   */
  public boolean withDraw(double amount) {
    if (amount < 0) {
      return false;
    }
    if (this.balance < amount) {
      return false;
    }
    this.balance -= amount; 
    return true;
  }
  
  public void doNothing() {
  }

}