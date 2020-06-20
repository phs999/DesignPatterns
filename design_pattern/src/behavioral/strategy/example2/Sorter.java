package behavioral.strategy.example2;

public class Sorter {
	
<<<<<<< HEAD
	public static void sort(Cat [] array) {
		for (int i = 0; i < array.length-1; i++) {
			int minPos=i;
			for (int j = i+1; j < array.length; j++) {
				minPos=array[j].compareTo(array[minPos])<0 ? j:minPos;
=======
	public static void sort(int [] array) {
		for (int i = 0; i < array.length-1; i++) {
			int minPos=i;
			for (int j = i+1; j < array.length; j++) {
				minPos=array[j]<array[minPos] ? j:minPos;
>>>>>>> 4d7b15255dc3cea88940ddce0cebd3afc0dfd840
			}
			swap(array,i,minPos);
			
		}
	}

	private static void swap(Cat[] array,int i,int j) {
		Cat temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
