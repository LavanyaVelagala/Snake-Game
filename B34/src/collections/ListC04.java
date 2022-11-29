package collections;


import java.util.*;
public class ListC04 {
  public static void main(String[] args) {
  List<String> a1 = new ArrayList<String>();
  a1.add("Red");
  a1.add("Green");
  a1.add("Orange");
  a1.add("White");
  a1.add("Black");
  System.out.println(a1);
  a1.add(0,"Blue");
  a1.add(4,"Purple");
  System.out.println(a1);
  }
}
