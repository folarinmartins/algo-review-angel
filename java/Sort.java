package angel.java;

public interface Sort {
	public int[] sort(int[] array);

	public default int[] swap(int[] array, int lo, int hi) {
		int prevLo = array[lo];
		array[lo] = array[hi];
		array[hi] = prevLo;
		return array;
	}
}
