import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사원이 총 몇명입니까?");
		int su = sc.nextInt();
		sc.nextLine();
		Employeer1 [] employeer = new Employeer1[su];
		
		Input1.input1(employeer);
		
		Calc1.calc(employeer);
		Sort1.sort1(employeer);
		
		Output1.output1(employeer);
		
	}
}
