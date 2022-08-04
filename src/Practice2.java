
public class Practice2 {
	public static void main(String[] args) {
		int [][] A = {
				{1,2},   //{5,6}
				{3,4}   //.{7,8}
		};
		int [][] B = {
				{5,6},
				{7,8}
		};
		int [][] C = {
				{5,7},
				{6,8}
		};
		int [][] sum = new int[2][2];
		int [][] gop = new int[2][2];
		System.out.println("행렬의합");
		for(int i = 0 ; i <2;i++) {
			for(int j = 0 ; j <2 ; j++) {
				sum[i][j] = A[i][j] + B[i][j];
				gop[i][j] = A[i][0]*C[j][0] + A[i][1]*C[j][1];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("행렬의곱");
		for(int i = 0 ; i <2;i++) {
			for(int j = 0 ; j <2 ; j++) {
			System.out.print(gop[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
