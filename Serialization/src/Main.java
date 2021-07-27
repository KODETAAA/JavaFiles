/* PROBLEM: Computer
 ** AUTHOR: PSALM XXIII V. ALONZO
 ** @DATE: FEBRUARY 16, 2021
 */

import java.io.*;
import java.util.*;

public class Main{
	static String cpu;
	static String gpu;
	static String motherboard;
	static String ram;
	static String warranty;

	public static void main(String[] args)throws Exception{
		int i = 0;
		int n = 0;
	
		Scanner sc = new Scanner(System.in);
		
		
		if(i != -1) 
		System.out.println("Enter number of transsactions: ");
		i = sc.nextInt();
		computerParts com[] = new computerParts[i];
		
		try {
		for(n = 0 ; n < com.length;++n) {
		com[n] = new computerParts(cpu,gpu,motherboard,ram,warranty);
			 

		
			System.out.println("Enter Cpu:");
			cpu = sc.next();
			com[n].setCpu(cpu);
		
		
			System.out.println("Enter Gpu:" );
			gpu = sc.next();
			com[n].setGpu(gpu);
			
			
			System.out.println("Enter Motherboard:" );
			motherboard = sc.next();
			com[n].setMotherboard(motherboard);
			
			
			System.out.println("Enter RAM:" );
			ram = sc.next();
			com[n].setRam(ram);
			
			
			System.out.println("Enter WarrantyID:\n" );
			warranty = sc.next();
			com[n].setWarrantyid(warranty);
			
		}
		
			
		//Serialization
		File data = new File("File.txt");
		System.out.println("Success");
		FileOutputStream fileOutput = new FileOutputStream(data);
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(com);
		com = null;
		
		//Deserialization
		FileInputStream fileInput = new FileInputStream(data);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
			
		com = (computerParts[]) objectInputStream.readObject();
		
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		for(computerParts e : com)
			System.out.println(e);
			
		
		    
		
	}

}
