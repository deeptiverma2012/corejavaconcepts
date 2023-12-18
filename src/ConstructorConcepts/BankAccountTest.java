package ConstructorConcepts;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("ICICI0123", 10000);
	   System.out.println( ba.getBalance());
	   ba.deposite(1000);
	   System.out.println( ba.getBalance());
	   ba.withdrawl(2000);
	   System.out.println( ba.getBalance());
	   ba.deposite(10000);
	   System.out.println( ba.getBalance());
	   ba.withdrawl(5000);
	   System.out.println( ba.getBalance());
	   

	}

}
