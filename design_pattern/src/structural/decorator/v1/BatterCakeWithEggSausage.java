package structural.decorator.v1;
//煎饼加蛋加香肠
public class BatterCakeWithEggSausage extends BatterCakeWithEgg{

	@Override
	public String getDesc() {
		return super.getDesc()+" 加一根香肠";
	}

	@Override
	public int price() {
		return super.price()+2;
	}
	
}
