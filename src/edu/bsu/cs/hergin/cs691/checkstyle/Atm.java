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
   * This class deposits to the amount.
   * @param amnt is a double
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
  * This class will withdraw the amount.
  * @param amount is a double
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