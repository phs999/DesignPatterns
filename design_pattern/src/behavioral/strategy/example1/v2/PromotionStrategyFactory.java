package behavioral.strategy.example1.v2;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
	private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP=new HashMap<String, PromotionStrategy>();
	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
	}
	
	private static final PromotionStrategy NON_PROMOTION=new EmptyPromotionStrategy();
	private PromotionStrategyFactory() {
		
	}
	
	public static PromotionStrategy getPromotionStrategy(String promotionKey) {
		PromotionStrategy promotionStrategy=PROMOTION_STRATEGY_MAP.get(promotionKey);
		return promotionStrategy==null ?  NON_PROMOTION : promotionStrategy;
	}
	
	
	  private interface PromotionKey{ 
		  String LIJIAN="LIJIAN"; 
		  String MANJIAN="MANJIAN"; 
		  String FANXIAN="FANXIAN"; 
	  }
	 
		/*
		 * private enum PromotionKey{ LIJIAN,MANJIAN,FANXIAN }
		 */
	

}
