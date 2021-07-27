/*1.) Write an interface named ReadingMaterial with two(2)
abstract methods.
The first method named
copyrightNotice and the second method named pageCount that
returns the number of pages of the material.
Both methods have no parameters. It also has two constant
attributes, first one is named TAGLINE which contains the
value "I can do it! God bless." and the second one named
MAX_CONTENT which holds the value 100.*/

public interface ReadingMaterial{
	final static String TAGLINE = "I can do it! God bless.";
	final static int MAX_CONTENT = 100;

	public String copyrightNotice();
	public int pageCount();

}