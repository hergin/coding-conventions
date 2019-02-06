package edu.bsu.cs.hergin.checkstyle;

import java.util.*;

public class atM {

	private double balance;

	public double get_balance() {
		return balance;
	}

/*
 * This class is licensed with GPL.
 */
	
	public atM(double ___initial_balance) {
		this.balance = ___initial_balance;
	}

	public boolean deposit(double amnt) {
		if (amnt < 0)
			return false;
	
		this.balance += amnt;
		return true;
	}

	// this class does withdraw
	public boolean withDRWa(double amount) {
		if (amount < 0) {
			return false;
		}
		if (this.balance < amount) {
			return false;
		}
		this.balance -= amount; return true;
	}
	
	public void doNothing() 
	{
		
		
	}
	
}