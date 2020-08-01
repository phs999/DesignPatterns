package structural.decorator.v2;

//煎饼
public class BatterCake extends AbstractBatterCake{
	@Override
	protected String getDesc() {
		return "煎饼";
	}
	@Override
	protected int price() {
		return 8;
		
	}
}
