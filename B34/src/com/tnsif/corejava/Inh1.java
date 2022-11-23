package com.tnsif.corejava;
public class Inh1 extends Inh{
	public void sample2() {
	System.out.println("Child Class");}

	public static  void main(String args[]) {
		Inh1 O =new Inh1();
		O.sample();
		O.sample2();
	}

}
