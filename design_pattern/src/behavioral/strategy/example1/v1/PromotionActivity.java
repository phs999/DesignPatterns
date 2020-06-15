package behavioral.strategy.example1.v1;

/**
 * 促销活动类
 * @author phs
 *
 */
public class PromotionActivity {
	private PromotionStrategy promotionStrategy;
	
	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy=promotionStrategy;
	}
	
	public void executePromotionStrategy() {
		
		promotionStrategy.doPromotion();
	}
}
