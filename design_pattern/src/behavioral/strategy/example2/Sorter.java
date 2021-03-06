package behavioral.strategy.example2;

public class Sorter <T>{
	
	public void sort(T [] array,Comparator<T> comparator) {
		for (int i = 0; i < array.length-1; i++) {
			int minPos=i;
			for (int j = i+1; j < array.length; j++) {
				minPos=comparator.compare(array[j], array[minPos])<0 ? j:minPos;
			}
			swap(array,i,minPos);
		}
	}


	private void swap(T[] array,int i,int j) {
		T temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
