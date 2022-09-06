public class Lab1_StarterCode {

	public static void main(String[] args) {

			int[][] my2D_wide= {{21,32,23,34,25,56,88},{13,14,15,16,17,18,19}};
			System.out.println("Original Matrix: ");
			PrintVect2D(my2D_wide);
			int rows=0;
			int cols=0;
			
			// get the number of rows/cols with the attribute covered in lecture
			// reverse rows and cols to reserve memory in the correct 'shape' of the output 2D-vector
			// Uncomment the next two (2) lines of code to setup the receiving 2D-vector
			rows = my2D_wide.length;
			cols = my2D_wide[0].length;

			int[][] my2D_tall = new int[cols][rows];
			my2D_tall=Transpose2D(my2D_wide);
			
			System.out.println("\nTransposed Matrix: ");
			PrintVect2D(my2D_tall);
			
	}
	public static int[][] Transpose2D(int[][] vect) {
		//Uncomment the next two (2) lines of code to setup the 'trans' 2D-vector, properly
		int cols = vect[0].length;
		int rows = vect.length;
		int trans[][] = new int[cols][rows];

		//use nested loops similar to the 'PrintVect2D' below that transpose vect into trans
		for(int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++) {
				trans[j][i] = vect[i][j];
			}
		}

		return trans;
	}
	public static void PrintVect2D(int[][] vect) {
		System.out.print("{ ");
		for(int i=0; i<vect.length; i++) {
			if(i>0)
				System.out.print("  ");
			for(int j=0; j<vect[0].length; j++) {
				if(j<vect[0].length-1)
					System.out.print(vect[i][j]+", ");
				else
					System.out.print(vect[i][j]);
			}
			if(i<vect.length-1)
				System.out.println("");
			else
				System.out.println(" }");
		}
	}
}

