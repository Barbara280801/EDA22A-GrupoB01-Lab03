public class SameStack {
	public static void main(String[] args) {
		// Sección de prueba
		int[] h1 = {10, 1, 1, 2, 3, 3, 5, 6};
		int[] h2 = {2, 3, 4, 3, 1, 4, 9};
		int[] h3 = {3, 2, 4, 3, 7, 1, 1, 1};
		
		int maxHeight = equalStacks(h1, h2, h3);
		imprimir(arrHeights(h1), arrHeights(h2), arrHeights(h3), maxHeight);
	} 
	public static void imprimir(int[] h1, int[] h2, int[] h3, int maxH) {
		System.out.println("La altura máxima es " + maxH);
		System.out.println("Las alturas se reducen de la siguiente manera:");
		System.out.println("\t" + (h1[h1.length - 1]) + " - " + (h1[h1.length - 1] - maxH) + " = " + maxH);
		System.out.println("\t" + (h2[h2.length - 1]) + " - " + (h2[h2.length - 1] - maxH) + " = " + maxH);
		System.out.println("\t" + (h3[h3.length - 1]) + " - " + (h3[h3.length - 1] - maxH) + " = " + maxH);
	}
	public static int equalStacks(int[] h1, int[] h2, int[] h3) {
		int[] sums = new int[3];
		int[] arr1 = arrHeights(h1); 
		int[] arr2 = arrHeights(h2); 
		int[] arr3 = arrHeights(h3); 
		int maxHeight = 0;
		for (int n1 : arr1) {
			for (int n2 : arr2) {		
				if (n1 < n2) break;
				if (n2 == n1) {
					for (int n3 : arr3) {
						if (n1 < n3) break;
						if (n3 == n1)
							maxHeight = n1;
					}
				}
			}
		}
		return maxHeight;
	}
	public static int[] arrHeights(int[] h) {
		int[] heightsArr = new int[h.length];
		int sum = 0;
		for (int i = 0; i < h.length; i++) {
			sum += h[i];
			heightsArr[i] = sum; 
		}
		return heightsArr; 
	} 
}

