package com.acts.dac.account;

import java.util.Comparator;

public class SortByName implements Comparator<Account>{

	@Override
	public int compare(Account a1, Account a2) {
		// TODO Auto-generated method stub
		return a1.getAccName().compareTo(a2.getAccName());
	}

}
