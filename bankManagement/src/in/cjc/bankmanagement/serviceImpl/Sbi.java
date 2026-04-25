package in.cjc.bankmanagement.serviceImpl;

import java.util.Scanner;

import in.cjc.bankmanagement.model.Account;
import in.cjc.bankmanagement.service.RBI;

public class Sbi implements RBI {

	Account ac = new Account();

	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.print("Enter Account No: ");
		int acno = sc.nextInt();
		if (acno > 9999999 && acno <= 99999999) {
			ac.setAccNo(acno);
		} else {
			System.out.println("Invalid Account Number..");
		}

		System.out.print("Enter Name: ");
		String name = sc.next();
		ac.setName(name);

		System.out.print("Enter MobNo:");
		String mobNo = sc.next();
		long l = Long.parseLong(mobNo);
		if (l > 999999999l && l <= 9999999999l) {
			ac.setMobNo(mobNo);
		} else {
			System.out.println("Invalid Mobile Number...");
		}

		System.out.print("Enter AadharNo: ");
		String adrNo = sc.next();
		int adr = Integer.parseInt(adrNo);
		if (adr > 0) {
			ac.setAdharNo(adrNo);
		} else {
			System.out.println("Invalid Adhar Number...");
		}

		System.out.print("Enter Gender: ");
		String gender = sc.next();
		ac.setGender(gender);

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		if (age >= 18 && age <= 105) {
			ac.setAge(age);
		} else {
			System.out.println("Invalid Age.Please Enter Valid Age.");
		}
		System.out.print("Enter Balance: ");
		double balance = sc.nextDouble();
		if (balance > 0) {
			ac.setBalance(balance);
		} else {
			System.out.println("Invalid Amount.Please Enter Valid Amount.");
		}
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Account No: " + ac.getAccNo());
		System.out.println("Name: " + ac.getName());
		System.out.println("Mob.No: " + ac.getMobNo());
		System.out.println("AdharNo: " + ac.getAdharNo());
		System.out.println("Gender: " + ac.getGender());
		System.out.println("Age: " + ac.getAge());
		System.out.println("Balance: " + ac.getBalance());

	}

	@Override
	public void depositeMoney() {

		System.out.print("Enter Ammount: ");
		double amount = sc.nextDouble();

		double balance = ac.getBalance();
		balance = amount + balance;

		ac.setBalance(balance);
		System.out.println("Rs." + amount + "/- deposited successfully...!");
	}

	@Override
	public void withdrawal() {
		System.out.print("Enter Ammount: ");
		int amount = sc.nextInt();

		double balance = ac.getBalance();
		if (balance > 1000 && amount <= 25000) {
			balance = balance - amount;
			ac.setBalance(balance);
			System.out.println("Rs." + amount + "/- withdraw successfully...!");
		} else {
			System.out.println("Insufficient balance...");
		}

	}

	@Override
	public void balanceCheck() {
		System.out.println("Available Balance: " + ac.getBalance());

	}

}
