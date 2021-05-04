
public class Games {
	private int gamesId;
	private String nameGame;
	private String comment;
	private double unitPrice;
	
	
	
	public Games(int gamesId, String nameGame, String comment, double unitPrice) {
		super();
		this.gamesId = gamesId;
		this.nameGame = nameGame;
		this.comment = comment;
		this.unitPrice = unitPrice;
	}



	public int getGamesId() {
		return gamesId;
	}



	public void setGamesId(int gamesId) {
		this.gamesId = gamesId;
	}



	public String getNameGame() {
		return nameGame;
	}



	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
}
