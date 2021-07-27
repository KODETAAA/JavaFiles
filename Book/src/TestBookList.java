import java.util.*;
public class TestBookList extends BookList{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//int max = 0;
		int choice = 0;
		int count = 1;

		BookList library = new BookList();


		Author author[] = new Author[5];
		Book books[] = new Book[5];



		do{
			
			System.out.println("[1] Add a Book");
			System.out.println("\n[2] Delete a Boo");
			System.out.println("\n[3] Find Book");
			System.out.println("\n[4] Display Book List");
			System.out.println("\n[5] Exit");
			System.out.print("\nYour choice: ");
			choice = scanner.nextInt();

			switch(choice){
				case 1:
					scanner.nextLine();

					//author info
					String fname;
					String middleN;
					char mname;
					String lname;
					System.out.print("Input Author First Name: ");
					fname = scanner.nextLine();
					//author fname
					System.out.print("Input Author Middle Name: ");
					middleN = scanner.nextLine();
					mname = middleN.charAt(0);
					//author midname
					System.out.print("Input Author Last Name: ");
					lname = scanner.nextLine();
					//author lastname
					author[count] = new Author(fname, mname, lname);
					System.out.println("Author Name: "+ author[count].toString() +"\n");

					//book info
					//set author
					String code;
					String title;
					String category;
					int pages = 0;

					System.out.print("Book Code: ");
					code = scanner.nextLine();
					//set book code
					System.out.print("Book Title: ");
					title = scanner.nextLine();
					//set book title
					System.out.print("Book Category: ");
					category = scanner.nextLine();
					//set book category
					System.out.print("Book Pages: ");
					pages= scanner.nextInt();
					//set book pages

					books[count] = new Book(code,title,author[count],category,pages);
					System.out.println("\nBook Information: \n"+ books[count].toString() +"\n\n");
					library.addBook(books[count]);
					count++;

					break;

				case 2:
					scanner.nextLine();
					int remove = 0;
					System.out.println("Please choose which book to remove:");
					System.out.println("Current books: ");
					library.displayList();
					System.out.print("\n");


					System.out.print("Index of Book to be Removed: ");
					remove = scanner.nextInt();

					library.removeBook(remove);
					System.out.println("Current books: ");
					library.displayList();
					System.out.print("\n");

					break;

				case 3:
					scanner.nextLine();
					int bookF;
					System.out.println("Find a book");
					library.displayList();
					System.out.print("\n");
					System.out.print("Book you search: ");
					bookF = scanner.nextInt();
					System.out.print("\n");
					if(library.search(books[bookF]) >= 0){
						System.out.println("Book you were searching for: ");
						System.out.println(books[bookF]);
						System.out.print("\n");
					}
					else{
						System.out.println("Book not found");
						System.out.print("\n");
					}



					break;
				case 4:
					System.out.println("CURRENT BOOKS: ");
					library.displayList();
					System.out.println("\n");
					break;
				case 5:
					System.exit(0);
					
				default: 
			}
		}while(choice <= 5);
	}
}