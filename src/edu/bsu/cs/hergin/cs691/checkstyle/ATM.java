package edu.bsu.cs.hergin.cs691.checkstyle;

/**
 * 
 * @author nwhite
 *
 */
public class ATM {

  private double balance;

  public double get_balance() {
    return balance;
  }

  /*
   * This class is licensed with GPL.
   */
  public ATM(double initialBalance) {
    this.balance = initialBalance;
  }

  /**
   * 
   * @param amnt specifies the amount to be deposited.
   * @return
   */
  public boolean deposit(double amnt) {
    if (amnt < 0) {
      return false;
    }

    
    this.balance += amnt;
    return true;
  }

  /**
   * 
   * @param amount specifies the amount to be withdrawn.
   * @return
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