package behavioral.strategy.example2;


public class Main {

	public static void main(String[] args) {
		//int [] array= {3,25,2,6,8,1};
		//Cat [] array= {new Cat(2, 2),new Cat(1, 1),new Cat(4, 4)};
		Dog[] array= {new Dog(5),new Dog(3),new Dog(2),new Dog(9)};
		Sorter<Dog> sorter=new Sorter<Dog>();
		//定义通过speed比较dog对象的大小，通过这种形式，可以定义不同的比较策略
		sorter.sort(array,(o1,o2)-> {
				if (o1.speed<o2.speed) {
					return -1;
				}else if (o1.speed>o2.speed) {
					return 1;
				}else {
					return 0;
				}
		});

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
