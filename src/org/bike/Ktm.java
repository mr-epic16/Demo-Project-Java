package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost(int a) {
		System.out.println("Price is "+a);
		
	}

	@Override
	public void speed(int b,String name) {
		
		System.out.println("Bike speed "+(b+name));
	}
	
		private void cost(float c) {
			System.out.println("ktm Bike price is "+(c));

		}
		private void speed(String name1) {
		
System.out.println("Bike Kph "+name1);
		}
	
public static void main(String[] args) {
	Ktm c = new Ktm();
	c.cost(300000f);
	c.speed("200");
	c.cost(200000);
	c.speed(125,"kph");
}
}
