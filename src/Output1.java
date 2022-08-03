
public class Output1 {
	static void output1(Employeer1 [] emp) {
		System.out.println("                         <<급여 관리 프로그램>>                             ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
		System.out.println("------------------------------------------------------------------------------");
		for (int i = 0; i < emp.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
					emp[i].num, emp[i].grade, emp[i].ho, emp[i].sudang, emp[i].getpay, emp[i].losepay, emp[i].realpay);
		}
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("입력데이타 출력");
		for(int i=0; i<3; i++) {
				System.out.println(emp[i].num+"\t"+ emp[i].grade+"\t"+emp[i].ho+"\t"+emp[i].sudang);
		}
	}
}
