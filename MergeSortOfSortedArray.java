package sortings;

public class MergeSortOfSortedArray {

	int[] merge(int[] array1, int[] array2) {
		int m = array1.length;
		int n = array2.length;

		int[] c = new int[m + n];
		// i for array1 tracking, j for array2 tracking and k for upcoming sorted array
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (array1[i] < array2[j]) {
				// increment the index
				c[k++] = array1[i++];
			} else
				c[k++] = array2[j++];
		}
		// there might be some remaining element in one of the array but we dont know
		// which one has.
		// so we need to check for both
		while (i < m) {
			c[k++] = array1[i++];
		}
		while (j < n) {
			c[k++] = array2[j++];
		}
		// return array after merged.
		return c;
	}
}
