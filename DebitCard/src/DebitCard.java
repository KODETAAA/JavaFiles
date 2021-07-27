import java.util.Scanner;

public class DebitCard extends Name {
	Scanner sc = new Scanner(System.in);
	//private String Name;
	private String Number;
	private float Balance;
	private String Name;
	
	public DebitCard() {
	}
	
	public DebitCard(String name, String number, float balance ) {
		this.Name = name;
		this.Number = number;
		this.Balance = balance;
	}
	
	public void setName(String name) {
			Name = name;
	}
	public String getName() {
		return Name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
		//String.format(".2f", Balance);
	}
	
	public float inquireBalance(){
		return getBalance();
	}
	
	public void depositCash(float amount) {
		
		if(amount> 0) {
			this.Balance += amount;
		
		}
	}
	
	boolean withdrawCash(float amount) {
		if(Balance >= amount) {
			Balance -= amount;
			return true;
		}else {
			System.out.println("INSUFFICIENT FUND\n");
			return false;
		}
	}
	
	public float Interest(float rate) {

		 rate = getBalance() * (rate/100);
		
		 System.out.println("Interest Incurred: " + rate);
		
		 setBalance(getBalance() + rate);
		 
		 //System.out.println("New Balance: "+ getBalance());
		return Balance;
	}

	@Override
	public String toString() {
		return "Enter Name: " + getName() + "\nEnter card number: " + getNumber() + "\nEnter Balance: " + getBalance();
	}
	
	
	
	
}
