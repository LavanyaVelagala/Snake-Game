package collections;


import java.util.*;
public class ListC11 {
  public static void main(String[] args) {
	  
		  List<String> a1 = new ArrayList<String>();
		  a1.add("Red");
		  a1.add("Green");
		  a1.add("Orange");
		  a1.add("White");
		  a1.add("Black");
		  a1.removeAll(a1);
		  System.out.println(a1);
 }
}