import java.util.Scanner;

public class Input1 {
	static void input1(Employeer1 [] emp) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <emp.length ; i++) {
			emp[i] = new Employeer1(); //한명의 학생 주소를 생성해서 학생주소배열에 넣는다.
			System.out.print("\n사원번호 : ");
			emp[i].num	= sc.nextInt();
			System.out.print("급 : ");
			emp[i].grade = sc.nextInt();
			System.out.print("호 : ");
			emp[i].ho = sc.nextInt();
			System.out.print("수당 : ");
			emp[i].sudang = sc.nextInt();
			sc.nextLine();
			System.out.print("입력/출력(I/O) : ");
			emp[i].io = sc.nextLine();
			if(emp[i].io.charAt(0) == 'O' ) {
				emp[0].ioint = i;
				System.out.println(emp[0].ioint);
				break;
			}
			else {
				emp[0].ioint = emp.length;
			}
		}
	}
}
