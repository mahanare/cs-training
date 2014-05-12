package basics.nitya.exceptions;

public class BankDemo {
	
	public static void main(String[] args){
		
		CheckingAccount c = new CheckingAccount(100);
		System.out.println("Depositing 007$");
		c.deposit(007.00);
		try{
			System.out.println("Withdrawing 004$");
			c.withDraw(004.00);
			System.out.println("Withdrawing 003$");
			c.withDraw(004.00);			
		}catch(InsufficientFundsException e){
			System.out.println("Sorry ur short by:$ "+e.getAmount());
			e.printStackTrace();
			
		}
		
	}

}
