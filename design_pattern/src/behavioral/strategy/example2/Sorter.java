package behavioral.strategy.example2;

public class Sorter {
	
	public static void sort(int [] array) {
		for (int i = 0; i < array.length-1; i++) {
			int minPos=i;
			for (int j = i+1; j < array.length; j++) {
				minPos=array[j]<array[minPos] ? j:minPos;
			}
			swap(array,i,minPos);
			
		}
	}

	private static void swap(int[] array,int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
