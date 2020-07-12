package structural.facade;

/**
 * 积分支付子系统
 * @author phs
 *
 */
public class PointsPaymentService {
	public boolean pay(PointsGift pointsGift) {
		System.out.println("支付"+pointsGift.getName()+" 积分成功。");
		return true;
	}
}
