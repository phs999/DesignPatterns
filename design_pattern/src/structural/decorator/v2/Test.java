package structural.decorator.v2;

public class Test {
	public static void main(String[] args) {
		AbstractBatterCake batterCake;
		batterCake=new BatterCake();
		batterCake=new EggDecorator(batterCake);
		batterCake=new EggDecorator(batterCake);
		batterCake=new SausageDecorator(batterCake);
		System.out.println(batterCake.getDesc()+" 销售价格："+batterCake.price());
	}
	
}
