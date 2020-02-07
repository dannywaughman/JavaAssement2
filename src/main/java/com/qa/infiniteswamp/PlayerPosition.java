package com.qa.infiniteswamp;

public class PlayerPosition {

	static float x1 = Math.round((10 * Math.random())); // starting position x coordinate (rounded)
	static float y1 = Math.round((10 * Math.random())); // starting position y coordinate (rounded)
	static float distance;

	// MOVING METHODS
	public static void moveNorth() {
		System.out.println("You move North!");
		y1 = y1 + 1;
		distance = Math.round(Math.sqrt(
				(ExitPosition.getExitX() - PlayerPosition.getX1()) * (ExitPosition.getExitX() - PlayerPosition.getX1())
						+ (ExitPosition.getExitY() - PlayerPosition.getY1())
								* (ExitPosition.getExitY() - PlayerPosition.getY1())));
	}

	public static void moveSouth() {
		System.out.println("You move South!");
		y1 = y1 - 1;
		distance = Math.round(Math.sqrt(
				(ExitPosition.getExitX() - PlayerPosition.getX1()) * (ExitPosition.getExitX() - PlayerPosition.getX1())
						+ (ExitPosition.getExitY() - PlayerPosition.getY1())
								* (ExitPosition.getExitY() - PlayerPosition.getY1())));
	}

	public static void moveEast() {
		System.out.println("You move East!");
		x1 = x1 + 1;
		distance = Math.round(Math.sqrt(
				(ExitPosition.getExitX() - PlayerPosition.getX1()) * (ExitPosition.getExitX() - PlayerPosition.getX1())
						+ (ExitPosition.getExitY() - PlayerPosition.getY1())
								* (ExitPosition.getExitY() - PlayerPosition.getY1())));
	}

	public static void moveWest() {
		System.out.println("You move West!");
		x1 = x1 - 1;
		distance = Math.round(Math.sqrt(
				(ExitPosition.getExitX() - PlayerPosition.getX1()) * (ExitPosition.getExitX() - PlayerPosition.getX1())
						+ (ExitPosition.getExitY() - PlayerPosition.getY1())
								* (ExitPosition.getExitY() - PlayerPosition.getY1())));
	}

	public static float getX1() {
		return x1;
	}

	public static void setX1(float x1) {
		PlayerPosition.x1 = x1;
	}

	public static float getY1() {
		return y1;
	}

	public static void setY1(float y1) {
		PlayerPosition.y1 = y1;
	}

}
