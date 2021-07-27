import java.util.*;
public class BookList{
	int count;
	int max;
	ArrayList<Book> mybook = new ArrayList<Book>();

		
	public BookList(){
		this.max = ReadingMaterial.MAX_CONTENT;
	}

	
	public BookList(int max){
		this.count = count;
		this.max = max;
	}

	
	public boolean addBook(Book book){
		count++;
		return mybook.add(book);
	}

	
	public int search(Book book){
		if(mybook.contains(book) == true){
			return mybook.indexOf(book);
		}
		else{
			return -1;
		}
	}

	
	public void removeBook(int index){
		mybook.remove(index);
	}

	public void getBook(int index){
		mybook.get(index);
	}

	
	public void displayList(){
		int i = 1;
		for(Book books: mybook){

			System.out.println("["+ i +"]"+ books);
			i++;
		}


	}
	
	public void display(){
		int i = 1;
		for(Book books: mybook){

			System.out.println("["+ i +"]"+ books.getTitle());
			++i;
		}


	}


}