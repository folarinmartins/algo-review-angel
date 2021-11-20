package angel.java;

public class MergeSort implements Sort {
	@Override
	public int[] sort(int[] array) {
		return mergeSort(array, 0, array.length - 1);
	}

	public int[] mergeSort(int[] array, int lo, int hi) {

		int length = hi - lo + 1;
		if (length <= 1) {
			return new int[] { array[lo] };
		}
		if (length == 2 && array[lo] <= array[hi]) {
			return new int[] { array[lo], array[hi] };
		}
		if (length == 2) {
			return new int[] { array[hi], array[lo] };
		}

		int[] leftSort = mergeSort(array, lo, lo + (int) Math.floor(length / 2));
		int[] rightSort = mergeSort(array, lo + (int) Math.floor(length / 2) + 1, hi);

		return merge(leftSort, rightSort);
	}

	public int[] merge(int[] leftArray, int[] rightArray) {
		int j = 0, k = 0;
		int array[] = new int[leftArray.length + rightArray.length];
		for (int i = 0; i < array.length; i++) {
			if (j < leftArray.length && k < rightArray.length) {
				if (leftArray[j] <= rightArray[k]) {
					array[i] = leftArray[j];
					j++;
				} else {
					array[i] = rightArray[k];
					k++;
				}
			} else if (j < leftArray.length) {
				array[i] = leftArray[j];
				j++;
			} else if (k < rightArray.length) {
				array[i] = rightArray[k];
				k++;
			}
		}
		return array;
	}
}
