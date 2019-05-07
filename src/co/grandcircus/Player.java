package co.grandcircus;

public abstract class Player {
	
	private String name;
	private int wins;
	private int losses;
	
	
	public Player(String name) {
		this.name = name;
		wins = 0;
		losses = 0;
	}
	
	public Player() {
		
	}


	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String playRoshambo(Player user, Player adver) {
		Roshambo ro = user.generateRoshambo();
		Roshambo bo = adver.generateRoshambo();
		System.out.println("\n" + user.getName() + ": " + ro);
		System.out.println(adver.getName() + ": " + bo);
		if(ro.equals(bo)) {
			return "Draw!";
		}else if(ro.equals(Roshambo.ROCK) && bo.equals(Roshambo.PAPER)) {
			user.setLosses(user.getLosses()+1);
			return adver.getName() + " wins!";
		}else if(ro.equals(Roshambo.ROCK) && bo.equals(Roshambo.SCISSORS)) {
			user.setWins(user.getWins()+1);
			return user.getName() + " wins!";
		}else if(ro.equals(Roshambo.PAPER) && bo.equals(Roshambo.SCISSORS)) {
			user.setLosses(user.getLosses()+1);
			return adver.getName() + " wins!";
		}else if(ro.equals(Roshambo.PAPER) && bo.equals(Roshambo.ROCK)) {
			user.setWins(user.getWins()+1);
			return user.getName() + " wins!";
		}else if(ro.equals(Roshambo.SCISSORS) && bo.equals(Roshambo.PAPER)) {
			user.setWins(user.getWins()+1);
			return user.getName() + " wins!";
		}else if(ro.equals(Roshambo.SCISSORS) && bo.equals(Roshambo.ROCK)) {
			user.setLosses(user.getLosses()+1);
			return adver.getName() + " wins!";
		}else {
			return null;
		}
		
	}



	public abstract Roshambo generateRoshambo();

}
