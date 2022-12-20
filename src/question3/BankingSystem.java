package question3;

import java.util.Scanner;

// Exception class creation.

class UnsupportedTransactionException extends Exception{
	
	public UnsupportedTransactionException(String s) {
		
		super(s);
		
	}
	
}

// Banking class declaration.

public class BankingSystem {

	public static void main(String[] args) throws UnsupportedTransactionException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the choice of transaction.");
		System.out.println("credit");
		System.out.println("debit");
		System.out.println("balanceinquiry");
		System.out.println("pinchange");
		
		String input = scanner.next();
		
		BankingSystem ob = new BankingSystem();
		ob.transaction(input);

	}
	
	// Transaction function.
	
	public void transaction(String transactionType) throws UnsupportedTransactionException {
		
		switch(transactionType) {
		
		case "credit":
			
			System.out.println("credit transaction choosen");
			break;
			
		case "debit":
			
			System.out.println("debit transaction choosen");
			break;
			
		case "balanceinquiry":
			
			System.out.println("balanceinquiry transaction choosen");
			break;
			
		case "pinchange":
			
			System.out.println("pinchange transaction choosen");
			break;
			
		default:
		
			throw new UnsupportedTransactionException("Invalid entry");
		
		}
		
	}
	
	

}
