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

  /**this method use to add money to account and show the account have positive money.
   * 
   * @param amnt is the money that people want put on the account.
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
  /**this method use to take money from the account and show false when balance lower than 0.
   * 
   * @param amount is the money that people want it take from the account.
   * @return
   */
  public boolean withDrwa(double amount) {
    if (amount < 0) {
      return false;
    }
    if (this.balance < amount) {
      return false;
    }
    this.balance -= amount;
    return true;
  }

  public void doNothing(){
  }

}