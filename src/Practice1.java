
public class Practice1 {
	public static void main(String[] args) {
		int [] arrays = new int [100];
		int sum= 0 ;
		for(int i = 0 ; i <100 ; i ++) {
			arrays[i] = i+1;
			sum +=add(arrays[i]);
		}
		System.out.println(sum);
	}
	static int add(int array) {
		int sum = 0;
		for(int j = 1 ; j <=array; j++) {
			sum += j;
		}
		return sum;
	}
}
