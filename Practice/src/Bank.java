import java.util.*;
public class Bank {
	private String accountFirstName;
	private String accountMiddleName;
	private String accountLastName;
	
	public Bank() {
		
	}
	public Bank(String newFirstName, String newMiddleName, String newLastName ) {
			
		this.accountFirstName = newFirstName;
		this.accountMiddleName = newMiddleName;
		this.accountLastName = newLastName;
	}
	public String getFirstName() {
		return accountFirstName;
	}
	public String getMiddleName() {
		return accountMiddleName;
	}
	public String getLastName() {
		return accountLastName;
	}
	
	public String toString() {
		return "FirstName:\t" +accountFirstName + "\n" +"MiddleName:\t" + accountMiddleName + "\n" +"LastName:\t" + accountLastName;
	}

	static class Details extends Bank {
		private double acctBalance;
		private double acctAmount;
		private double acctDeposit;
		
		
		public Details() {
		}
		
		public Details(String accountFirstName, String accountMiddleName, String accountLastName, int newBalance, int newAmount,double newDeposit) {
			super(accountFirstName,accountMiddleName,accountLastName);
			this.acctBalance = newBalance;
			this.acctAmount = newAmount;
			this.acctDeposit = newDeposit;
		}
		
		public double getBalance() {
			return acctBalance;
		}
		
		public double getAmount() {
			return acctAmount;
		}
		public double getDeposit() {
			return acctDeposit;
		}
		
		public String slip() {
			double result = 0;
			double plus = 0;
			String ans = "\n-------Come Again!--------";
			double widthdraw = 0;
		
			System.out.println("\n-----Widthdrawal Slip-----");
			if(getAmount() <= getBalance()) {
				result= acctBalance - acctAmount;
				System.out.println("Widthdrawed: "+ getAmount());	
				System.out.println("Remaining Balance: "+result);
			}else{
				System.out.println("\nInsufficient Funds\nRemaining Balance: " + getBalance());
			}
			
			if(getAmount() == 0) {
				result = acctDeposit + acctBalance;
					System.out.println("Deposit: "+result);
			}
			return ans;
		}
		
		
		//override
		public String toString() {
			return super.toString() + "\n" + "Balanace:\t" + acctBalance+ "\n" +"Amount:\t\t" +acctAmount +"\n"+ "Deposit:\t" + acctDeposit;
		
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details b = new Details("Psalm","Vallercer","Alonzo",5000,4500, 0);
		System.out.println(b);
		System.out.println(b.slip());
		
	}

}
