import java.text.DecimalFormat;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		Account account = new Account("Acct-001","Juan dela Cruz", 5000.0f);
		System.out.println(account.toString());
		
		System.out.println("Withdrawal Amount: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Balance: "+df.format(account.getBalance()));
	}

}
