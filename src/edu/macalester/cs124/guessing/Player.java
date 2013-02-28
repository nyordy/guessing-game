package edu.macalester.cs124.guessing;

public class Player {

	public int myGuess;
	public int lowerBound;
	public int higherBound;
	
	public void startNewGame() {
		myGuess = 50;
		lowerBound = 0;
		higherBound = 100;
	}

	public int nextGuess() {
		return myGuess;
	}

	public int guessWasLow() {
		lowerBound = myGuess;
		myGuess = (int)((myGuess + higherBound)/2);
		return myGuess;
	}

	public int guessWasHigh() {
		higherBound = myGuess;
		myGuess = (int)((myGuess+lowerBound)/2);
		return myGuess;
	}
}
