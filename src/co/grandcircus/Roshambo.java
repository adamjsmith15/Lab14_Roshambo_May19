package co.grandcircus;

public enum Roshambo {
	
	ROCK, PAPER, SCISSORS;
	
	
	public String toString() {
		switch (this) {
		case ROCK:
			return "rock";
		case PAPER:
			return "paper";
		default:
			return "scissors";
		}
	}

}
