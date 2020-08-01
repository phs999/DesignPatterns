package structural.decorator.v2;
//加香肠 装饰
public class SausageDecorator extends AbstractDecorator{

	public SausageDecorator(AbstractBatterCake batterCake) {
		super(batterCake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc()+"加一根香肠";
	}

	@Override
	protected int price() {
		// TODO Auto-generated method stub
		return super.price()+2;
	}
	
	

}
