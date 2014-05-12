package basics.nitya.exceptions;

public class CheckingAccount {
	
	private double balance;
	private int num;
	public CheckingAccount(int num){
		this.num=num;
		}
	public void deposit(double amount){
		
		balance+=amount;
	
	}
	public void withDraw(double amount) throws InsufficientFundsException{
		if(amount<balance){
			balance-=amount;
			}
		else{
			double needmoney=amount-balance;
			throw new InsufficientFundsException(needmoney);
		}
	}
	
	public double getBalance(){
		return balance;
	}
	public int getNumber(){
		return num;
	}
}
