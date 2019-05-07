package co.grandcircus;

public class RockPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	
	@Override
	public String getName() {
		return "TheJets";
	}

}
