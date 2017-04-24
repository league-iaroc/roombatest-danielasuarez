package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(200,200);
	sleep(1000);
	driveDirect(100,500);
	sleep(1000);
	driveDirect(480,500);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(300,300);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(300,500);
	sleep(1000);
	
	

	
	}

	public void loop() {
	
	}
}
