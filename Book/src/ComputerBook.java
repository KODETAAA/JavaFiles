public class ComputerBook extends Book{
	private String area;
	private boolean isEBookAvailable;

	public ComputerBook(String area, boolean isEBookAvailable){
		this.area = area;
		this.isEBookAvailable = isEBookAvailable;
	}

	public ComputerBook(boolean isEBookAvailable){
		area = "Programming";
		this.isEBookAvailable = isEBookAvailable;
	}
	public ComputerBook(){
		this("Networking",true);
	}
	public boolean equals(Object obj){
		if(obj instanceof ComputerBook){
			ComputerBook cbook = (ComputerBook) obj;
				if(this.area == cbook.area && super.getCode() == cbook.getCode())
					return true;
				else
					return false;
			}
			else
				return false;
	}

	public void display(){
		System.out.println("Code: " + super.getCode() +"\nTitle:"
			+getTitle() + "\nAuthor:" + getAuthor() + "\nCategory:"
			+getCategory() + "\nPages:" + getPages());

	}
	public String displayMe(){
		return "";
	}
}