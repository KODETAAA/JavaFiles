/*Write a class named Author with the following attributes:
firstName, lastName and middleInitial.
Provide getter/setter methods for the lastName.
Override the toString method of the Object class.
It will follow the format
<firstName> <middleInitial>. <lastName>
for example: Sigurado N. Pasar for its string representation.*/

public class Author{
	private String fname;
	private char mname;
	private String lname;

	public Author(){}

	public Author(String fname, char mname, String lname){
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}

	//getter & setter for First Name
	public void setFname(String fname){
			this.fname = fname;
		}

		public String getFname(){
			return this.fname;
	}

	//Getters and Setters for Middle Name
	public void setMname(char mname){
			this.mname = mname;
		}

		public char getMname(){
			return this.mname;
	}

	//Getters and Setters for Last Name
	public void setLname(String lname){
		this.lname = lname;
	}

	public String getLname(){
		return this.lname;
	}

	public String toString(){
		return getFname() + " " + getMname() + ". " + getLname();
	}
}