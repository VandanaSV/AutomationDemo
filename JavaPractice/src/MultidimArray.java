import java.util.Arrays;

public class MultidimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 0, 8, 3 } };
		int min=a[0][0]	;
		  for (int i=0;i<a.length;i++) 
		  { 
			  for (int j=0;j<a[i].length;j++) 
			  {
				  if(a[i][j]<min)
				  {
					  min=a[i][j];
				  }
			  }
		  }
		  System.out.println("Min value of matrix: "+min);
		printMatrix(a);
		
	}

	public static void printMatrix(int a[][]) {
		for (int[] i : a) {
			System.out.println(Arrays.toString(i));
		}
	}

}
