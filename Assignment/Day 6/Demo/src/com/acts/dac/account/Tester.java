package com.acts.dac.account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Add account 2. Print all accounts 3. Sort by account no desc 4. Sort by
//* accName 5. Sort by Date of opening 6. Sort by balance desc 7. exit

public class Tester {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		List<Account> acc = dataUtils.dataUt();

		do {

			System.out.println("Menu");
			System.out.println("1. Add Account");
			System.out.println("2. Print all accounts");
			System.out.println("3. Sort by account no desc");
			System.out.println("4. Sort by accName");
			System.out.println("5. Sort by Date of opening");
			System.out.println("6. Sort by balance desc");
			System.out.println("7. exit");

			System.out.println("Enter Choice");
			int choice = sc.nextInt();

			

			switch (choice) {
			case 1:
				System.out.println("Enter AccNo...");
				int accNo = sc.nextInt();
				System.out.println("Enter AccName...");
				String accName = sc.next();
				System.out.println("Enter Date...");
				String date = sc.next();
				
				LocalDate date1= null; 
				try {
					date1 = Validation.dateValidation(date);
					
					
				} catch (InvalidDateException e) {
					System.out.println(e.getMessage());
					continue;
				}
				System.out.println("Enter bal...");
				double bal1 = sc.nextDouble();
				
				try {
					bal1 = Validation.balanceValidation(bal1);
					
					
				} catch (InvalidDateException e) {
					System.out.println(e.getMessage());
					continue;
				}
				
				acc.add(new Account(accNo, accName, date1, bal1));
				System.out.println("Added Succesfully..accName..");
				break;

			case 2:
				
				acc.forEach((s)->System.out.println(s));
				break;

			case 3:

				System.out.println("Sorted AccNo...");
				Collections.sort(acc);
				acc.forEach(System.out::println);
				
				break;

			case 4:
				System.out.println("Sorted accName...");
				Collections.sort(acc, new SortByName());
				acc.forEach(System.out::println);
				break;

			case 5:
				System.out.println("Sorted DOO...");
				Collections.sort(acc, (a1,a2)->a1.getDob().compareTo(a2.getDob()));
				for(Account a:acc) {
					System.out.println(a);
				}

				break;

			case 6:
				System.out.println("Sorted balance...");
				Collections.sort(acc, (a1,a2)->Double.compare(a1.getBal(), a2.getBal()));
				for(Account a:acc) {
					System.out.println(a);
				}
				break;

			case 7:
				System.out.println("Visit Again...!");
				flag = false;
				break;

			default:
				break;
			}

		} while (flag);

	}
}
