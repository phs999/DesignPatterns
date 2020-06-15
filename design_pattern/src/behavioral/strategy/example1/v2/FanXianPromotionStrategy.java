package behavioral.strategy.example1.v2;

/**
 * 返现促销策略
 * @author phs
 *
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("返现促销，返回的金额存放到用户的账户余额中");
	}

}
