import java.util.*;

public class Match{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n;
			int fact = 1;
			int count = sc.nextInt();
			
			if(count > 0) {
				for(n = 1;n<=count;n++){
					fact = fact * n;
				}
				System.out.println(fact);
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		catch (Exception e) {
			System.out.println("InputMismatchException");
		}
	}
}