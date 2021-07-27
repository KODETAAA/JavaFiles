public class Book implements ReadingMaterial{
	private String code;
	private String title;
	private Author author;
	private String category;
	private int pages;

	public Book(){}
	public Book(String code, String title, Author author,String category,int pages){
		this.code = code;
		this.title = title;
		this.author = author;
		this.category = category;
		this.pages = pages;
	}

	public Book(String code, String title, Author author,int pages){
		this(code,title,author,"Computer",pages);
	}
	//Setters
	public void setCode(String code){
		this.code = code;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(Author author){
			this.author = author;
	}
	public void setCategory(String category){
			this.category = category;
	}
	public void setPages(int pages){
			this.pages = pages;
	}

	//Getters
	public String getCode(){
		return code;
	}
	public String getTitle(){
		return title;
	}
	public Author getAuthor(){
		return author;
	}
	public String getCategory(){
		return category;
	}
	public int getPages(){
		return pages;
	}

	//This class implements all the methods of the ReadingMaterials.
	public String copyrightNotice(){
		return "Copyright 202";
	}

	public int pageCount(){
		return pages;
	}

	public String toString(){
		return "Author: "+ getAuthor() +"\nBook: "+ getTitle() +"\nCode: "+ getCode() +"\nCategory: "+ getCategory() +"\nPages: "+ getPages();
	}
	//public abstract void display();
	//public abstract String displayMe();

}