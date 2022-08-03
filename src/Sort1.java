
public class Sort1 {
	static void sort1(Employeer1[] emp) {
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = 0; j < emp.length - 1; j++) {
				if (emp[j].num > emp[j + 1].num) {
					Employeer1 temp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = temp;
				}
			}
		}
	}
}
