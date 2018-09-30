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
   * Verify the deposit is a non-negative amount and add it to the account.
   * @param amnt amount of the money to be deposited.
   * @return true add the amount to the account.
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
   * Verify if enough money is in the account to cover the withdraw, and if so, deduct it from the account.
   * @param amount the amount of money to be withdrawn.
   * @return true deduct amount of withdraw from account.
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