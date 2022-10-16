package org.abstraction;

public class hdfc extends Rbi {
	@Override
	public void interest() {
		System.out.println("2%");
		super.interest();
	}
	@Override
	public void abs() {
		System.out.println("this is abstraction");
	}
	public static void main(String[] args) {
		hdfc h = new hdfc();
		h.interest();
		h.principle();
		h.abs();
	}
}
