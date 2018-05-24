package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		/*Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);
		
		Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
		
		savacc1.showInfo();
		
		System.out.println("---------------------------------");
		
		chkacc1.showInfo();
		
		System.out.println("*********************************");
		
		*/
		
		
		// Read a CSV file then create new accounts based on that data
		
		String file = "C:\\Users\\Andrzej\\Desktop\\Bankaccount\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("Error reading account type");
			}
		}
	
	for (Account acc : accounts) {
		System.out.println("\n******************");
		acc.showInfo();
		}
		
	}
}


