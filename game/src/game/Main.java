package game;

public class Main {

	public static void main(String[] args) {
		
		
		Game game = new Game(1, "gameName", 100);
		Customer customer = new Customer(1, "firstName", "lastName", 2001, "1234");
		Campaign campaign = new Campaign(1, "campaignName", 10);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.upDate(game);
		gameManager.delete(game);
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.add(customer);
		customerManager.upDate(customer);
		customerManager.delete(customer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.upDate(campaign);
		campaignManager.delete(campaign);
		campaignManager.discount(campaign);
		
		
	}

}
