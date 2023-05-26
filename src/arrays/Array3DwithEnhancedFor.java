package arrays;

public class Array3DwithEnhancedFor {
	public static void main(String[] args) {

		int a[][][] = new int[4][4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					a[i][j][k] = i + j + k;
				}
			}
		}

		for (int x[][] : a) {
			for (int y[] : x) {
				for (int z : y) {
					System.out.print(z + " ");
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}

}
