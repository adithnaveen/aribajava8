package com.ariba.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Account{
	private int accId;
	private double balance;
	private String custName;
	private String sex;
	
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", balance=" + balance + ", custName=" + custName + ", sex=" + sex + "]";
	}
	public Account(int accId, double balance, String custName, String sex) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.custName = custName;
		this.sex = sex;
	}
	
	
	
	
}


public class LambdaEx6 {

	
	public static void main(String[] args) {
		List<Account> accountList = new ArrayList<Account>();
		
		accountList.add(new Account(101, 3434, "Kumar", "male"));
		accountList.add(new Account(33, 3987, "Larry", "male"));
		accountList.add(new Account(44, 8877, "Scott", "male"));
		accountList.add(new Account(23, 5566, "Becky", "female"));
		accountList.add(new Account(1, 3312, "jeena", "female"));
		accountList.add(new Account(31, 7798, "Tim", "male"));
		
		
		// we have to filter, we need a list of only Males 
		List<Account> onlyMaleList = AccountPredicate.filterAccounts(
					accountList, AccountPredicate.onlyMale());
		
		onlyMaleList.forEach(System.out :: println);
		
		System.out.println("-------------- People with balance over 3500----------------");
		List<Account> onBalanceCheck = AccountPredicate.filterAccounts(accountList, AccountPredicate.onBalanceCheck(3500));
		onBalanceCheck.forEach(System.out :: println);
		
		Predicate<Account> onlyMaleAboveAmt = AccountPredicate.onlyMale().and(
				AccountPredicate.onBalanceCheck(3500));
		
		System.out.println("------------ only male and above 3500----------------");
		List<Account> onlyMaleAboveAmtList = 
					AccountPredicate.filterAccounts(accountList, onlyMaleAboveAmt);
		onlyMaleAboveAmtList.forEach(System.out :: println);

		
		
		// building female predicat negating male predicate 
		Predicate<Account> onlyFemale = AccountPredicate.onlyMale().negate();
		System.out.println("------------------- only Female----------------- ");
		List<Account> onlyFemaleList = AccountPredicate.filterAccounts(accountList, onlyFemale);
		onlyFemaleList.forEach(System.out :: println);
		
		//////////////////// sorting, this will sort in ascending order 
		System.out.println("----------------- Sorting Customer Names Asc Order----------------");
		accountList.sort(Comparator.comparing(Account:: getCustName));
		accountList.forEach(System.out :: println);
		
		
		// another way to sort, based on balance 
		System.out.println("-------------- Sorting based on Balance ---------------- ");
		accountList.sort(Comparator.comparing(acc -> acc.getBalance()));
		accountList.forEach(System.out :: println);

		
		System.out.println("------------------- Order by Sex then By Balance ---------------- ");
		
		// comparing with multiple fields 
		Comparator<Account>  orderBySexByBalance =
				Comparator.comparing(Account :: getSex)
					.thenComparing(Comparator.comparing(Account:: getBalance));
		
		accountList.sort(orderBySexByBalance);
		accountList.forEach(System.out :: println);
		
	}
	
	
	static class AccountPredicate{
		// List of Predicates 
		public static Predicate<Account> onlyMale(){
			return p -> p.getSex().equals("male");
		}
		
		public static Predicate<Account> onBalanceCheck(double balance){
			return p->p.getBalance() > balance;
		}
		
		// Filter 
		public static List<Account> filterAccounts(List<Account> accounts,
					Predicate<Account> predicate ){
			
			return accounts.stream().filter(predicate).collect(Collectors.<Account>toList());
		}
		
		
	}
	
	
}
























