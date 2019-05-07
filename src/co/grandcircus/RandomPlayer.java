package co.grandcircus;
import java.util.Random;

public class RandomPlayer extends Player {

	Random num = new Random();
	
	@Override
	public String getName() {
		return "TheSharks";
	}

	@Override
	public Roshambo generateRoshambo() {
		int rand = num.nextInt(3);
		switch (rand) {
		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}

}
