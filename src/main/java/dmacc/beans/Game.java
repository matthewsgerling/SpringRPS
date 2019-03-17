package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game() {
		super();
	}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	private void determineWinner() {
		String winner = "Computer";
		if(player1.equals("rock") && computerPlayer.equals("scissors")) {
			winner = "player";
		}else if(player1.equals("rock") && computerPlayer.equals("lizard")) {
			winner = "player";
		}else if(player1.equals("scissors") && computerPlayer.equals("paper")) {
			winner = "player";
		}else if(player1.equals("scissors") && computerPlayer.equals("lizard")) {
			winner = "player";
		}else if(player1.equals("paper") && computerPlayer.equals("rock")) {
			winner = "player";
		}else if(player1.equals("paper") && computerPlayer.equals("spock")) {
			winner = "player";
		}else if(player1.equals("lizard") && computerPlayer.equals("spock")) {
			winner = "player";
		}else if(player1.equals("lizard") && computerPlayer.equals("paper")) {
			winner = "player";
		}else if(player1.equals("spock") && computerPlayer.equals("rock")) {
			winner = "player";
		}else if(player1.equals("spock") && computerPlayer.equals("scissors")) {
			winner = "player";
		}
		
		if(player1.equalsIgnoreCase(computerPlayer)) {
			winner = "Tie";
		}
		this.setWinner(winner);
	}

	private void setComputerPlayer() {
		Random num = new Random();
		int answer = num.nextInt(5) + 1;
		String player = null;
		if(answer == 1) {
			player = "rock";
		}else if (answer == 2) {
			player = "paper";
		}else if (answer == 3) {
			player = "scissers";
		}else if (answer == 4) {
			player = "lizard";
		}else if (answer == 5) {
			player = "spock";
		}
		this.setComputerPlayer(player);
	}	
}