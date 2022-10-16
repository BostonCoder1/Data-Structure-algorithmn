package sortings;

public class mergeSortDriver {

	public static void main(String[] args) {
		int []A = {2,8,15};
		int []B = {5,9,12,17};
		MergeSortOfSortedArray obj = new MergeSortOfSortedArray();
		
		
		for(int i: obj.merge(A, B)) {
			System.out.print(i + " ");
		}
		System.out.println();
		

	}

}
