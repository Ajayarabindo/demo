package org.multipleAbstraction;
import org.abstraction.*;
public class Indian implements Rbi,Hdfc {

	@Override
	public void simple() {
		System.out.println("simple");
	}

	@Override
	public void compound() {
		System.out.println("compound");		
	}

	@Override
	public void interest() {
		System.out.println("4%");		
	}

	@Override
	public void principle() {
		System.out.println("10000");		
	}
public static void main(String[] args) {
	Indian i = new Indian();
	i.simple();
	i.compound();
	i.interest();
	i.principle();
	hdfc h = new hdfc();
	h.interest();
	h.principle();
	h.abs();
	
}
}
