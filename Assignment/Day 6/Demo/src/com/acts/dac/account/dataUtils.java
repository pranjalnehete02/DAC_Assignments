package com.acts.dac.account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dataUtils {

	public static List<Account> dataUt() {
		Scanner sc=new Scanner(System.in);
		List<Account> acc=new ArrayList<Account>();
		
	
		acc.add(new Account(1, "akash",LocalDate.parse("2020-10-10") ,1000 ));
		acc.add(new Account(2, "akash1",LocalDate.parse("2020-07-10") ,1200 ));
		acc.add(new Account(3, "akash2",LocalDate.parse("2020-09-10") ,1500 ));
		acc.add(new Account(4, "akash3",LocalDate.parse("2020-08-10") ,1100 ));
		return acc;
		
	}
	
}
