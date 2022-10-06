package com.valtech.training.corejava.d2;

import com.valtech.traning.corejava.d1.Animal;

public class Anon {
	
	public static void main(String[] args) {
		Animal a=new Animal() {
			
			int counter =0;
			

			@Override
			public void makeSound() {
				// TODO Auto-generated method stub
				counter ++;
				System.out.println("Anon......"+counter);
			}
		};
		a.makeSound();
		a.makeSound();
	}

}
