package library;
import java.util.*;
public class BuyBooks {
	public static void main(String[] args) {
		ArrayList<Books> lib=new ArrayList<Books>();
		Books b1=new Books("HP & Chamber of Secrets","J K Rowling","Bloomsbury",500); 
		Books b2=new Books("HP & Order of Phoenix","J K Rowling","Bloomsbury",300);
		Books b3=new Books("HP & Chamber of Secrets","J K Rowling","Bloomsbury",600); 
		lib.add(b1);lib.add(b2);
		lib.add(b3);
		
		
		
		for (Books b: lib) 
			System.out.println(b); 
		
		Collections.sort(lib, new Comparator<Books>(){

			  public int compare(Books o1, Books o2)
			  {
				  return Integer.compare(o1.price, o2.price);
			  }
			});
		System.out.println("After Sorting");
		for (Books b: lib) 
			System.out.println(b); 
		
		
	}
}
