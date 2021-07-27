import java.util.Scanner;
import java.math.BigDecimal;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Scanner sc = new Scanner(System.in);



			DebitCard card = new DebitCard("Psalm Alonzo", "10834", 1000.0f);

			System.out.println(card.toString());

			do {

			System.out.printf(card.toString());

			System.out.println("\n1DEBIT CARD TRANSACTION");
			System.out.println("[1] Deposit Cash");
			System.out.println("[2] Widthdraw Cash");
			System.out.println("[3] Inquire Balance");
			System.out.println("[4] Calculate Interest Rate");
			System.out.println("[5] Exit");
			System.out.println("\nEnter your choice: ");
			choice = sc.nextInt();



			switch(choice) {
			case 1:
					System.out.println("Enter Amount: ");
					float amount = sc.nextFloat();
					card.depositCash(amount);
					System.out.println(card.toString());
					break;
			case 2:
					System.out.println("Enter Widthdrawal: ");
					float widthdraw = sc.nextFloat();
					card.withdrawCash(widthdraw);
					System.out.println(card.toString());
					break;
			case 3:
					System.out.println(card.toString());
					break;
			case 4:
					System.out.println("Enter Rate: ");
					float rate = sc.nextFloat();
					card.Interest(rate);
					System.out.println(card.toString());
					break;
			case 5:
					System.exit(0);
					break;
			}

			choice++;

		}
			while(choice <= 5);
			}
	}


