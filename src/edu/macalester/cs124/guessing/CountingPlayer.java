package edu.macalester.cs124.guessing;

public class CountingPlayer {

	public int myguess = 50;
	
	public void startNewGame() {
		myguess = 50;
	}

	public int nextGuess() {
		return myguess;
	}

	public int guessWasLow() {
		myguess = ((myguess + 100)/2);
		return myguess;
	}

	public int guessWasHigh() {
		myguess = myguess/2;
		return myguess;
	}
}
