package com.valtech.traning.corejava.d1;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("bark");
	}
	public static void main(String[] args){
		Animal a=new Dog ();
		a.makeSound();
	}
		
}


