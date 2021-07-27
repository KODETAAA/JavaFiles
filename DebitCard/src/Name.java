
public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	public Name(String fname, String mname, String lname) {
		// TODO Auto-generated constructor stub
		this.firstName = fname;
		this.middleName = mname;
		this.lastName = lname;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return "First Name: " + getFirstName() + "Middle Name: " + getMiddleName() + "Last Name: " + getLastName();
	}
}
