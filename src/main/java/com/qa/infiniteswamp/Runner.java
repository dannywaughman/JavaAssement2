package com.qa.infiniteswamp;

import java.util.Scanner;

public class Runner extends PlayerPosition {

	public static void main(String[] args) {

		PlayerPosition playerPosition = new PlayerPosition();
		ExitPosition exitPosition = new ExitPosition();

		Scanner playerName = new Scanner(System.in);
		Scanner playerDirection = new Scanner(System.in);

		distance = Math.round(Math.sqrt(
				(ExitPosition.getExitX() - PlayerPosition.getX1()) * (ExitPosition.getExitX() - PlayerPosition.getX1())
						+ (ExitPosition.getExitY() - PlayerPosition.getY1())
								* (ExitPosition.getExitY() - PlayerPosition.getY1()))); // overly long pythagoras for
																						// distance to exit

		System.out.println("Hello. What is your name?");

		String name;
		name = playerName.nextLine();

		System.out.println("Hello " + name + ". It seems you are trapped in an infinite swamp.");
		System.out.println("There is one exit, but the grey foggy clouds have blinded you.");
		System.out.println("You conveniently find a convinient magic compass in your pocket, it reads the following..");
		System.out.println("");
		System.out.println("The exit is " + distance + "m away");
		System.out.println("Y-Coordinate: " + y1);
		System.out.println("X-Coordinate: " + x1);
		System.out.println("");
		System.out.println("Lets figure out where the exit is!");
		System.out.println("Would you like to move North, East, South or West?");

		String direction;
		direction = playerDirection.nextLine().toString();

		if (playerDirection.nextLine().toString() == "North") {
			moveNorth();
			System.out.println("Distance to exit: " + distance + "m");
		} else if (playerDirection.nextLine().toString() == "South") {
			moveSouth();
			System.out.println("Distance to exit: " + distance + "m");
		} else if (playerDirection.nextLine().toString() == "East") {
			moveEast();
			System.out.println("Distance to exit: " + distance + "m");
		} else if (playerDirection.nextLine().toString() == "West") {
			moveWest();
			System.out.println("Distance to exit: " + distance + "m");
		} else {
			System.out.println("Please enter North, East, South or West: ");
		}
//		System.out.println("Y: " + y1);
//		System.out.println("X: " + x1);
//		System.out.println("Distance to exit: " + distance + "m"); // if statements not correct?
																	// input North etc keeps user input open
	}
}
