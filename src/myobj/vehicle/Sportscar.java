package myobj.vehicle;

import myobj.vehicle.Sportscar;

public class Sportscar {
	
	public Sportscar (int engine) {
		this.engine = engine;
		this.distance = 0;
	}

	public static void main(String[] args) {

		Sportscar csr = new Sportscar(10000);

		csr.size = 1500;
		csr.velocity = 120;
		csr.engine = 10000;
		csr.distance = 0;
		csr.color = "pink";

		csr.drive();
		
		for (int i=1; i<1000; ++i) {
			csr.drive();
		}
	}

	int size;
	int velocity;
	int engine;
	int distance;
	String color;

	void drive() {

		if(engine <100) {
			System.out.println("no engine left");
			System.exit(0);
		}
		engine-=100;
		distance+=100;
		System.out.println(engine + " engine left, drived " + distance + "m");
		
	}
}