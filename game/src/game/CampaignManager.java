package game;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya eklendi.");
		
	}

	@Override
	public void upDate(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya silindi.");
	}

	public void discount(Campaign campaign) {
		System.out.println("%" + campaign.getDiscount() + " indirim uygulandý.");
	}
}
