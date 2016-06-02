package chapter4TDD;

public class FootballTeam implements Comparable<FootballTeam> {

	private int gamewon;
	public FootballTeam(int gameWon) {
		// TODO Auto-generated constructor stub
		if (gameWon < 0) {
	        throw new IllegalArgumentException(
	            "illegal game: [" + gameWon + "]");
	    }
		
		this.gamewon = gameWon;
	}

	public int getGameWon() {
		// TODO Auto-generated method stub
		return this.gamewon;
	}

	@Override
	public int compareTo(FootballTeam o) {

		if (this.gamewon > o.getGameWon()) {
			return 1;
		} else if (this.gamewon < o.getGameWon()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
