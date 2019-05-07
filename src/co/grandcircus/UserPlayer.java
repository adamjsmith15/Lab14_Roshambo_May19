package co.grandcircus;

import java.util.Scanner;

public class UserPlayer extends Player {
	
	public UserPlayer(String name) {
		this.setName(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		Scanner sc = new Scanner(System.in);
		String userEntry = Validator.getString(sc, "\nRock, paper, or scissors (R/P/S): ");
		userEntry = userEntry.toLowerCase();
		while (!(userEntry.equalsIgnoreCase("r") || userEntry.equalsIgnoreCase("p") || userEntry.equalsIgnoreCase("s"))) {
			System.out.print("Please select either r for rock, p for paper, or s for scissors: ");
			userEntry = sc.next();
			userEntry = userEntry.toLowerCase();
		}
		switch (userEntry) {
		case "r":
			return Roshambo.ROCK;
		case "p":
			return Roshambo.PAPER;
		case "s":
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}

	@Override
	public String toString() {
		return String.format("Name: %-5s \nWins: %-5s \nLosses: %-5s", getName(), getWins(), getLosses());
	}

}
