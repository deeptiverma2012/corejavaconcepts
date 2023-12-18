package EncapsulationConceps;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setAccountNumber("HDFC01235674");
		ba.setOwner("Deepti");
		ba.setBalance(500000);
	    //System.out.println(ba.getaccountNumber());
		ba.printStatement();
		
	
	   ba.deposite(500000);
	   System.out.println(ba.getBalance());
	
	   ba.withdrawl(520);
	   System.out.println(ba.getBalance());
	   ba.printStatement();

	}

}
