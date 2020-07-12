package structural.facade;

public class Test {
	public static void main(String[] args) {
		PointsGift pointsGift = new PointsGift("音响");
		GiftExchangeService giftExchangeService=new GiftExchangeService();
		giftExchangeService.giftExchange(pointsGift);
	}

}
