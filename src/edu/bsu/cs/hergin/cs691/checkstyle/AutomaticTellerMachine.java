package edu.bsu.cs.hergin.cs691.checkstyle;

public class AutomaticTellerMachine {

  private double balance;

  public double get_balance() {
    return balance;
  }

  /*
  * This class is licensed with GPL.
  */

  public AutomaticTellerMachine(double initialBalance) {
    this.balance = initialBalance;
  }

  /**
  * Adds money to account.
  * @param amnt amount of money to add
  * @return
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
  * @param amount amount of money to withdraw
  * @return
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