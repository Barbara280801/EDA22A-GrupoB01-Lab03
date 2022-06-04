public class SameStack {
	public static int equalStacks(int[] h1, int[] h2, int[] h3) {
		int[] sums = new int[3];
		int[] arr1 = arrHeights(h1); 
		int[] arr2 = arrHeights(h1); 
		int[] arr3 = arrHeights(h1); 
		int maxHeigth;
		for (int n1 : arr1) {
			for (int n2 : arr2) {		
				if (n1 < n2) break;
				if (n2 == n1) {
					for (int n3 : arr3) {
						if (n1 < n3) break;
						if (n3 == n1)
							maxHeigth = n1;
					}
				}
			}
		}
		return maxHeigth;
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

