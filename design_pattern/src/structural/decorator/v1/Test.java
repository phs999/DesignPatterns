package structural.decorator.v1;

public class Test {
	public static void main(String[] args) {
		BatterCake batterCake=new BatterCake();
		System.out.println(batterCake.getDesc()+" 销售价格："+batterCake.price());
		BatterCake batterCakeWithEgg=new BatterCakeWithEgg();
		System.out.println(batterCakeWithEgg.getDesc()+" 销售价格："+batterCakeWithEgg.price());
		BatterCake batterCakeWithEggSausage=new BatterCakeWithEggSausage();
		System.out.println(batterCakeWithEggSausage.getDesc()+" 销售价格："+batterCakeWithEggSausage.price());
	}
	
}
