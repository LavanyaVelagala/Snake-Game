package collections;


import java.util.*;
public class ListC08 {
  public static void main(String[] args) {
	  
		  List<String> a1 = new ArrayList<String>();
		  a1.add("Red");
		  a1.add("Green");
		  a1.add("Orange");
		  a1.add("White");
		  a1.add("Black");
		  if (a1.contains("Black")){
			  System.out.println("Element is found");
		  }
		  else {
			  System.out.println("Element is not found");
		  }
 }
}