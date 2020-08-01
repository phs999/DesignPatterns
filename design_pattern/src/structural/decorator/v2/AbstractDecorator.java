package structural.decorator.v2;

public abstract class AbstractDecorator extends AbstractBatterCake{
	
	private AbstractBatterCake battercake;
	
	public AbstractDecorator(AbstractBatterCake batterCake) {
		this.battercake=batterCake;
	}
	
	//public abstract void dosomthing();
	
	@Override
	protected String getDesc() {
		return this.battercake.getDesc();
	}

	@Override
	protected int price() {
		return this.battercake.price();
	}

}
