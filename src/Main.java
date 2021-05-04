
public class Main {
	public static void main(String[] args) {
	 Logger[] loggers= {new MailLogs()};
	
	PlayerManagers playerManagers = new PlayerManagers(loggers);
	
	Players players = new Players(9, "erdem", "ece", "3333333", "1998", "erdem_ece", "6666");
	
	Games game = new Games(1, "nfs", "race", 50);
	PurchaseGame gameManager1 = new PurchaseGame();
	
	Campaing campaign = new Campaing(1, "new discount for person", 20);
	
	CampaingProvider campaignManager = new CampaingProvider();
	
	
	}
}
