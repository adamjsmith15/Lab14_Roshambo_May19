package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player player;
		String keepPlaying = "y";
		System.out.println("Welcome to Rock Paper Scissors! \n");
		System.out.print("Enter your name: ");
		String name = sc.next();
		UserPlayer user = new UserPlayer(name);
		System.out.print("\nWould you like to play against TheJets or TheSharks? (j/s): ");
		String teamChoice = sc.next();
		while(!(teamChoice.equalsIgnoreCase("j") || teamChoice.equalsIgnoreCase("s"))) {

			System.out.print("\nPlease select a team by either \"j\" or \"s\": ");
			teamChoice = sc.next();
		}
		if (teamChoice.equalsIgnoreCase("j")){
			player = new RockPlayer();
		}else {
			player = new RandomPlayer();
		}
		while (keepPlaying.equalsIgnoreCase("y")) {
			System.out.println(player.playRoshambo(user, player));
			
			System.out.print("\nPlay again? (y/n): ");
			keepPlaying = sc.next();
		}
			
		System.out.println("\n" + user);
		System.out.println("\nThanks for playing!");
		sc.close();
		
	}
	
	


}
