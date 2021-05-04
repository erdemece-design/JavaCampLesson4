
public class PurchaseGame implements GameManager{

	@Override
	public void addGame(Games game, Players player) {
		System.out.println("new game has been added");
		System.out.println("game named "+ game.getNameGame());
		System.out.println("comment : "+ game.getComment());
		System.out.println("unit price of game"+game.getUnitPrice());
		

			
		
	}



}
