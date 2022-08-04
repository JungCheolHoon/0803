import java.util.Arrays;

public class Practice_2 {
	public static void main(String[] args) {
		int [][] A = { {1,2},{3,4,} } ;
		int [][] B = { {5,6},{7,8,} } ;
		int [][] hapResults = new int[2][2] ;
		int [][] gopResults = new int[2][2] ;
		
		System.out.println("<<<<<행렬의합>>>>>");
		matrixAdd(A, B, hapResults);
		matrixPrint(hapResults);
		
		System.out.println("<<<<<행렬의곱>>>>>");
		matrixMultiple(A,B,gopResults);
		matrixPrint(gopResults);
		
	}
	static void matrixMultiple(int [][] A, int [][]B, int [][] results) {
		for(int i = 0 ; i < A.length ; i++) {
			for(int j = 0 ; j < A[i].length ; j++) {
				for(int k = 0 ; k < A[i].length ; k++) {
					results[i][j] += A[i][k] * B[k][j];
				}
				
			}
		}
	}
	
	static void matrixAdd(int [][] A, int [][] B, int [][] results) {
		for(int i = 0 ; i <A.length;i++) {
			for(int j = 0 ; j < A.length ; j++) {
				results[i][j] = A[i][j] + B[i][j];
			}
		}
	}
	
	static void matrixPrint(int [][] results ) {
		for(int i = 0 ; i <2;i++) {
			System.out.println(Arrays.toString(results[i]));
		}
	}
}
