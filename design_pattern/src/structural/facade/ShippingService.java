package structural.facade;

/**
 * 物流子系统
 * @author phs
 *
 */
public class ShippingService {
	public String ShipGift(PointsGift pointsGift) {
		//物流系统数据对接
		System.out.println(pointsGift.getName()+" 进入物流系统");
		String shippingOrderNo = "666";
		return shippingOrderNo;
	}
}
