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
		System.out.println(acc + "���°� �����Ǿ����ϴ�.");
	}
	public void deposit(int money) {
		// ���ݾ�
		if (money <= 0) {
			System.out.println("0���̻� �Է��� �ּ���");
		} else {
			balance += money;
		}
		System.out.println(this.getBalance());
	}
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		if (balance < money) {
			System.out.println("�ܾ��� �����մϴ�");
		} else {
			balance -= money;
		}
	}
	public void showBalance() {
		System.out.println(this.getBalance());
	}
}
