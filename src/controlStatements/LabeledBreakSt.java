package controlStatements;

public class LabeledBreakSt {
	public static void main(String[] args) {

		
		//if we use break it comes out of the loop it doesnt check next index value
		
		
		
//		 for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//
//				if (i == 3)
//					break; // unlabeled break statement
//
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}

		////

		sonu: for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {

				if (i == 3)
					break sonu; // labeled break statement

				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
