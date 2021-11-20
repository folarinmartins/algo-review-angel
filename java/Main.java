package angel.java;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		MergeSort selectionSort = new MergeSort();
		int[] array = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Initial array:" + Arrays.toString(array));
		System.out.println("Issorted: " + Main.isSorted(array));
		int[] sortedArray = selectionSort.sort(array);
		System.out.println("Final array:" + Arrays.toString(sortedArray));
		System.out.println("Issorted: " + Main.isSorted(sortedArray));
	}

	public static boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i])
				return false;
		}
		return true;
	}
}

// javac -cp angel/java/classes angel/java/*.java -d angel/java/classes/ &&
// java-cp angel/java/classes angel.java.Main 10 2 5 3 53 1 23