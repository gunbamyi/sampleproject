package com.javaex;
public class Account {
	private String accountNo;
	private int balance;

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public Account(String acc) {
		acc = "312-89562-123456";
		System.out.println(acc + "계좌가 생성되었습니다.");
	}
	public void deposit(int money) {
		// 예금액
		if (money <= 0) {
			System.out.println("0원이상 입력해 주세요");
		} else {
			balance += money;
		}
		System.out.println(this.getBalance());
	}
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		if (balance < money) {
			System.out.println("잔액이 부족합니다");
		} else {
			balance -= money;
		}
	}
	public void showBalance() {
		System.out.println(this.getBalance());
	}
}
