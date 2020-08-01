package structural.decorator.v1;
//煎饼加蛋
public class BatterCakeWithEgg extends BatterCake{

	@Override
	public String getDesc() {
		return super.getDesc()+"加一个蛋";
	}

	@Override
	public int price() {
		return super.price()+1;
	}
	
}
