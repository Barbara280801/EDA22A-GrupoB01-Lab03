public class SameStack {
	public static int equalStacks(int[] h1, int[] h2, int[] h3) {
		int[] sums = new int[3];
		int maxHeigth;
		int[] arr1 = arrHeights(h1); 
		int[] arr2 = arrHeights(h1); 
		int[] arr3 = arrHeights(h1); 
		for (int n1 : h1) {
			for (int n2 : h2) {		
				for (int n3 : h3) {
				}
			}
		}
	}
	public static int[] arrHeigths(int[] h) {
		int[] heightsArr = new int[h.length];
		int sum = 0;
		for (int i = 0; i < h.length; i++) {
			sum += h[i];
			heightsArr[i] = sum; 
		}
		return heightsArr; 
	} 
}

