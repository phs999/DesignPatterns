package behavioral.strategy.example2;

public class Sorter {
	
	public static void sort(Comparable [] array) {
		for (int i = 0; i < array.length-1; i++) {
			int minPos=i;
			for (int j = i+1; j < array.length; j++) {
				minPos=array[j].compareTo(array[minPos])<0 ? j:minPos;
			}
			swap(array,i,minPos);
		}
	}

	private static void swap(Comparable[] array,int i,int j) {
		Comparable temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
