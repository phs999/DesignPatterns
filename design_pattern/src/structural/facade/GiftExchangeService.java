package structural.facade;

/**
 * 积分兑换礼物的外观类，实现与这几个子系统的具体交互
 * @author phs
 *
 */
public class GiftExchangeService {
	//使用Spring IOC的方式注入，此处省略
	private QualifyService qualifyService;
	private PointsPaymentService pointsPaymentService;
	private ShippingService shippingService;
	
	public void setQualifyService(QualifyService qualifyService) {
		this.qualifyService = qualifyService;
	}
	public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
		this.pointsPaymentService = pointsPaymentService;
	}
	public void setShippingService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public void giftExchange(PointsGift pointsGift) {
		if (qualifyService.isAvailable(pointsGift)) {//积分足够、库存足够
			if (pointsPaymentService.pay(pointsGift)) {//积分支付正常
				String shippingOderNo = shippingService.ShipGift(pointsGift);
				System.out.println("下单成功，订单号是："+shippingOderNo);
			}
		}
	}
	
	
	

}
