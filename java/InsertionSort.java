package angel.java;

public class InsertionSort implements Sort {
	public int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i], j = i;
			while (j > 0 && array[j - 1] > key) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = key;
		}
		return array;
	}
}
