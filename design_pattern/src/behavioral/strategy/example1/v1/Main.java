package behavioral.strategy.example1.v1;

public class Main {

	public static void main(String[] args) {
		 PromotionActivity promotionActivity618=new PromotionActivity(new LiJianPromotionStrategy());
         PromotionActivity promotionActivity1111=new PromotionActivity(new FanXianPromotionStrategy());
         promotionActivity618.executePromotionStrategy();
         promotionActivity1111.executePromotionStrategy();
	}

}
