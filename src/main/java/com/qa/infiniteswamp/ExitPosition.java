package com.qa.infiniteswamp;

public class ExitPosition {

	static float exitX = Math.round((10 * Math.random())); // exit position x coordinate 
	static float exitY = Math.round((10 * Math.random())); // exit position y coordinate

	static float exitP = Math.round(Math.sqrt((exitX * exitX) + (exitY * exitY))); // exit position from origin

	public static float getExitX() {
		return exitX;
	}

	public static void setExitX(float exitX) {
		ExitPosition.exitX = exitX;
	}

	public static float getExitY() {
		return exitY;
	}

	public static void setExitY(float exitY) {
		ExitPosition.exitY = exitY;
	}

	public static float getExitP() {
		return exitP;
	}

	public static void setExitP(float exitP) {
		ExitPosition.exitP = exitP;
	}
	
	

}
