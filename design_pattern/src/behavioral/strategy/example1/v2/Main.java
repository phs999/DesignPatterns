package behavioral.strategy.example1.v2;

public class Main {

//	public static void main(String[] args) {
//		 PromotionActivity promotionActivity618=new PromotionActivity(new LiJianPromotionStrategy());
//         PromotionActivity promotionActivity1111=new PromotionActivity(new FanXianPromotionStrategy());
//         promotionActivity618.executePromotionStrategy();
//         promotionActivity1111.executePromotionStrategy();
//	}
//	public static void main(String[] args) {
//		 PromotionActivity promotionActivity=null;
//		 String promotionKey="LIJIAN";
//		 if ("LIJIAN".equals(promotionKey)) {
//			 promotionActivity=new PromotionActivity(new LiJianPromotionStrategy());
//		 }else  if ("FANXAIN".equals(promotionKey)) {
//			promotionActivity=new PromotionActivity(new FanXianPromotionStrategy());
//		}//...
//		 
//		 promotionActivity.executePromotionStrategy();
//	}
	public static void main(String[] args) {
		 String promotionKey="LIJIAN";
		 PromotionActivity promotionActivity=new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		 promotionActivity.executePromotionStrategy();
	}

}
