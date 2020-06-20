package behavioral.strategy.example2;

public class Main {

	public static void main(String[] args) {
		int [] array= {3,25,2,6,8,1};
		Sorter.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
