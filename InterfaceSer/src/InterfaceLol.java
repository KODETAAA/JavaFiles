import java.util.Arrays;
import java.util.Scanner;

interface InterfaceLol {
	 public void Dname();
	 public int count();
	 //public String toString();
	 public int max = 3;
	 
	  class Jname implements InterfaceLol{
		  private String[] name;
		  private int count;
		  
		  public Jname() {
			  
		  }
		  
		  public Jname(int max) {
			  name = new String[max];
			  count = 0;
		  }
		  
		  public String[] getName() {
			return name;
		}

		public void Dname() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = 0;
			int k = max;
			String yname;
			
			String[] name2 = new String[k];
			
			
			
			for(n = 0 ; n < name2.length ; n++) {
				
				System.out.println("Enter words:");
				yname = sc.nextLine();
							name2[n] = yname;		
					
				}
					for(int j = 0 ; j < k ; j++) {
						System.out.println("\n"+ name2[j]);
					}
				}
			
		
		

		@Override
		public int count() {
			// TODO Auto-generated method stub
			return 0;
		}
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		Jname jk = new Jname();
		
		//System.out.println("Enter the other name:");
		//oname = sc.nextLine();
		
		jk.Dname();
		
		
		
		
	}

}
