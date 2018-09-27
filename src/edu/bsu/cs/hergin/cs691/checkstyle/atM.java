package edu.bsu.cs.hergin.cs691.checkstyle;

/**
 * Javadoc summary goes here. 
 * @author nwhite
 *
 */
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
   * A brief summary.
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
   * Also a summary.
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