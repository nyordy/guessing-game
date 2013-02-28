package edu.macalester.cs124.guessing;
import java.util.Random;

public class GameMaster {
		public static final int LOW = 13;
		public static final int HIGH = 57;
		public static final int CORRECT = 30;
		
		private Random random = new Random();
		private int answer;

		private int count;
		
		public int submitGuess(int guess) {
			count++;
			if(guess < answer) {
				return LOW;
			}
			else if(guess > answer) {
				return HIGH;
			}
			else {
				return CORRECT;
			}
		}

		public int getGuessCount() {
			return count;
		}

		public void startNewGame() {
			count = 0;
			answer = random.nextInt(100);
		}
		
		
}
