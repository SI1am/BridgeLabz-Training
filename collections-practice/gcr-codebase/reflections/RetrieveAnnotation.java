//Retrieve Annotations at Runtime: Create a custom annotation @Author(name="Author Name"). Apply it to a class and use Reflection to retrieve and display the annotation value at runtime.

package reflections;
import java.lang.reflect.*;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@interface Author{
	String name();
}


@Author(name="Chetan bhagat")
class Book {
	String name;
	Book (String name){
		this.name=name;
	}
}

public class RetrieveAnnotation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		@Author(name="JK-Rowling")
//		Book b1=new Book("Harry Potter");
//		
//		@Author(name="Shivam")
//		Book b2=new Book("Power");

		Author author = Book.class.getAnnotation(Author.class);
//		Author author1=b1.getClass().getAnnotation(Author.class);
		System.out.println("Author name: " + author.name());
//		System.out.println("Author name: " + author1.name());
		


	}

}
