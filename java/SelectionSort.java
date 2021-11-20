package angel.java;

public class SelectionSort implements Sort {
	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
		}
		return array;
	}
}