
public class Sort1 {
	static void sort1(Employeer1[] emp) {
		for (int i = 0;i <= emp[0].ioint - 1; i++) {
			for (int j = 0;j <= emp[0].ioint - 1; j++) {
				if (emp[j].num > emp[j + 1].num) {
					double temp = emp[j].tax;
					emp[j].tax = emp[j + 1].tax;
					emp[j + 1].tax = temp;
					int temp1 = emp[j].num;
					emp[j].num = emp[j + 1].num;
					emp[j + 1].num = temp1;
					temp1 = emp[j].grade;
					emp[j].grade = emp[j + 1].grade;
					emp[j + 1].grade = temp1;
					temp1 = emp[j].ho;
					emp[j].ho = emp[j + 1].ho;
					emp[j + 1].ho = temp1;
					temp1 = emp[j].num;
					emp[j].sudang = emp[j + 1].sudang;
					emp[j + 1].sudang = temp1;
					temp1 = emp[j].getpay;
					emp[j].getpay = emp[j + 1].getpay;
					emp[j + 1].getpay = temp1;
					temp1 = emp[j].realpay;
					emp[j].realpay = emp[j + 1].realpay;
					emp[j + 1].realpay = temp1;
				}
			}
		}
	}
}
