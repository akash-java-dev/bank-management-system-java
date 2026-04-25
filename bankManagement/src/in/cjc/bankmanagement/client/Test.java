package in.cjc.bankmanagement.client;

import java.util.Scanner;

import in.cjc.bankmanagement.service.RBI;
import in.cjc.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {

		RBI bank = new Sbi();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To SBI...");
		int choice = 10;
		do {
			System.out.println();
			System.out.println("Options");
			System.out.println();
			System.out.println("1-For create Account.");
			System.out.println("2-For All details.");
			System.out.println("3-For deposite money.");
			System.out.println("4-For withdrawl money.");
			System.out.println("5-For check balance.");
			System.out.println("0-For Exit.");
			System.out.println();
			System.out.print("Your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				bank.createAccount();
				break;
			}

			case 2: {

				bank.displayAllDetails();
				break;
			}

			case 3: {
				bank.depositeMoney();
				break;
			}

			case 4: {
				bank.withdrawal();
				break;
			}

			case 5: {
				bank.balanceCheck();
				break;
			}

			default:
				System.out.println("Thanks for Banking with us....");
			}
		} while (choice != 0);
	}
}
