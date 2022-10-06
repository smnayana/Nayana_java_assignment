package com.valtech.traning.corejava.d1;

public abstract class Vehicle {
	
	public  void start() {
		System.out.println("start button pressed........");
	}
	public  void stop() {
		System.out.println("stop button pressed..........");
	
}
	public abstract void accelerate();
	
	public abstract void applyBreak();
	
	public void driveSomeDistance() {
		start();
		accelerate();
		applyBreak();
		stop();
	}
	
	public static void main(String[] arg) {
		Vehicle  v = new electricvehicle();
		v.driveSomeDistance();
	
}

 
}
