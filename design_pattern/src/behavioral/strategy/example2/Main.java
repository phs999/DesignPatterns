package behavioral.strategy.example2;

public class Main {

	public static void main(String[] args) {
		//int [] array= {3,25,2,6,8,1};
		//Cat [] array= {new Cat(2, 2),new Cat(1, 1),new Cat(4, 4)};
		Dog[] array= {new Dog(5),new Dog(3),new Dog(2),new Dog(9)};
		Sorter.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
