public class Account{
    private String accntNumber;
    private String accntName;
    private double balance;
    
    public Account(){}
    public Account(String num, String name, double bal){
        accntNumber = num;
        accntName = name;
        balance = bal;
    }
    
    public String getAccntNumber() {
		return accntNumber;
	}
    
    public String getAccntName() {
		return accntName;
	}
    
    public Double getDouble() {
    	return balance;
    }
    
    public double getBalance(){
    	
    	return balance;}

	public void withdraw(double amount)  {
		try {
			
			if(amount <= getBalance()) {
				balance = balance - amount;
			}
			else{
				System.out.printf("Insufficient: Insufficient funds.\n");
			}	
		}catch(Exception e) {
		        System.out.println(getBalance());
		}
		
	}
	
	public String toString(){
		return "Entered Name: " +getAccntName() +"\n" + "Enter AcctNum: " +getAccntNumber() + "\n"+ " Balance: " +getBalance();
	}
}