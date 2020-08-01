package structural.decorator.v2;
//加蛋 装饰
public class EggDecorator extends AbstractDecorator{

	public EggDecorator(AbstractBatterCake batterCake) {
		super(batterCake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc()+"加一个鸡蛋";
	}

	@Override
	protected int price() {
		return super.price()+1;
	}
	
	

}
