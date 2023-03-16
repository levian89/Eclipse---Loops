package com.in28minutes.loops;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(30);

		player.printSquaresUpToLimit();
		// For limit 30, output will be 1 4 9 16 25

		player.printCubesUpToLimit();
		// For limit 30, output will be 1 8 27
	}

}
