package behavioral.strategy.example1.v2;
/**
 * 立减促销策略
 * @author phs
 *
 */
public class LiJianPromotionStrategy implements PromotionStrategy{

	@Override
	public void doPromotion() {
		System.out.println("立减策略，直接在原价格基础上减去配置的立减金额");
	}

}
