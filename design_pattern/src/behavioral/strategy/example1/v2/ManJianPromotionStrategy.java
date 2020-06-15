package behavioral.strategy.example1.v2;

/**
 * 满减促销策略
 * @author phs
 *
 */
public class ManJianPromotionStrategy implements PromotionStrategy{

	@Override
	public void doPromotion() {
		System.out.println("满减促销，满200减20");
	}
	

}
