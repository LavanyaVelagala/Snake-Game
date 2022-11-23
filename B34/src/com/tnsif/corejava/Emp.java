package com.tnsif.corejava;
public class Emp{   
  String a="Hello a instanse variable";;
  static String b="Hello a static variable";
  void print() {
	  String c="Hello a local variable";
	  System.out.println(c);
  }
public static void main(String args[]){  
     Emp O =new Emp();      
     System.out.println (O.a);
     
     O.print();
     System.out.println(O.b);
}
}

