import java.util.*;
public class TooLong {
	 
	static class  ExceptionLineTooLong extends Exception{
		
		ExceptionLineTooLong(String s){
			super(s);
		}
	}

	public static  void Sentence(String se) throws ExceptionLineTooLong {
		 Scanner sc = new Scanner(System.in);
		 se = sc.nextLine();
		 
		if (se.length() > 80) {
			 throw new ExceptionLineTooLong("The strings is too long.");
		 }else {
			 System.out.println(se);
		 }	 
	}
	
	public static void main(String[] args)  {
		
		try {	
			Sentence(null);
		}	
		catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
	}

}
