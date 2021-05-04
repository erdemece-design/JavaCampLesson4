
public class Campaing {
	private int campaingId;
	private String campaingName;
	private int campaingRate;
	
	
	public Campaing(int campaingId, String campaingName, int campaingRate) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingRate = campaingRate;
	}


	public int getCampaingId() {
		return campaingId;
	}


	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}


	public String getCampaingName() {
		return campaingName;
	}


	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}


	public int getCampaingRate() {
		return (int) (campaingRate * 0.2);
	}


	public void setCampaingRate(int campaingRate) {
		this.campaingRate = campaingRate;
	}
}
