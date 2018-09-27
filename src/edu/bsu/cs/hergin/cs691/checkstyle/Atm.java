package edu.bsu.cs.hergin.cs691.checkstyle;


public class Atm {

  private double balance;

  public double get_balance() {
    return balance;
  }

  /*
  * This class is licensed with GPL.
  */

  public Atm(double initialBalance) {
    this.balance = initialBalance;
  }
  
  /**
   * Deposits money into account.
   * @param amnt The sum of money
   */
  
  public boolean deposit(double amnt) {
    if (amnt < 0) {
      return false;
    }

    this.balance += amnt;
    return true;
  }

  // this class does withdraw
  
  /**
   * Withdraws money from account.
   * @param amount The sum of money
   */
  
  public boolean withdraw(double amount) {
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