
public class CampaingProvider implements CampaignManager {

	@Override
	public void discount(Campaing campaign) {
	System.out.println("made to game with discount rate  ");
	System.out.println(campaign.getCampaingRate());
	
	}

	@Override

	public void addCampaing(Campaing campaing, Games game) {
		System.out.println("has been add the game"+ game.getNameGame());
		
		
	}

	@Override
	public void deleteCampaing(Campaing campaing, Games game) {
		System.out.println("current discount is abolished");
		System.out.println("has been deleted" + game.getNameGame());
		
	}
	
}
