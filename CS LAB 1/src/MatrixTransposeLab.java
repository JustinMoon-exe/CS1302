public class MatrixTransposeLab {
	public static void main(String[] args) {

		int[][] my2D_wide= {{21,32,23,34},{13,14,15,16}};
		
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

		int[][] matmult = new int[my2D_tall[0].length][my2D_wide.length];
		DotProd2D(my2D_wide, my2D_tall, matmult);

		System.out.println("\nTransposed Matrix: ");
		PrintVect2D(my2D_tall);

		System.out.println("\nDot Product of Matricies: ");
		PrintVect2D(matmult);
		
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

	public static int[][] DotProd2D(int[][] wide, int[][] tall, int[][] matmult ) {
		for(int i = 0; i < wide.length; i++){
			for (int j = 0; j < tall[0].length; j++) {
				for (int k = 0; k < wide[0].length; k++) {
					matmult[i][j] += wide[i][k] * tall[k][j];
				}
			}
		}
		return(matmult);
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