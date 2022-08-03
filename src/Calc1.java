
public class Calc1 {
	static void calc(Employeer1[] emp) {

		int pay1 = 95000;
		int pay2 = 80000;
		for (int i = 0; i <= emp[0].ioint ; i++) {
			if (emp[i].grade == 1) {
				switch (emp[i].ho) {
				case 1:
					emp[i].getpay = 95000;
					break;
				case 2:
					emp[i].getpay = 92000;
					break;
				case 3:
					emp[i].getpay = 89000;
					break;
				case 4:
					emp[i].getpay = 86000;
					break;
				case 5:
					emp[i].getpay = 83000;
					break;
				}
			} else {
				switch (emp[i].ho) {
				case 1:
					emp[i].getpay = 80000;
					break;
				case 2:
					emp[i].getpay = 75000;
					break;
				case 3:
					emp[i].getpay = 70000;
					break;
				case 4:
					emp[i].getpay = 65000;
					break;
				case 5:
					emp[i].getpay = 60000;
					break;
				}
			}
			emp[i].allpay = emp[i].sudang + emp[i].getpay;
			if (emp[i].allpay >= 90000) {
				emp[i].tax = 0.012;
				emp[i].jojung = 1000;
			} else if (emp[i].allpay >= 80000) {
				emp[i].tax = 0.007;
				emp[i].jojung = 500;
			} else if (emp[i].allpay >= 70000) {
				emp[i].tax = 0.005;
				emp[i].jojung = 300;
			} else
				emp[i].tax = 0;
			emp[i].jojung = 0;

			emp[i].losepay = (int) (((double) emp[i].allpay * emp[i].tax) - (double) emp[i].jojung);

			emp[i].realpay = emp[i].allpay - emp[i].losepay;

			if (emp[i].io.charAt(0) == 'O') {
				break;
			}
		}

	}
}
