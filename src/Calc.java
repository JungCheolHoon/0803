
public class Calc {
	void calc(Student student) {
		student.tot = student.kor + student.eng + student.mat;
		student.avg = student.tot/3;
		
		switch((int)(student.avg)/10) {
		case 10 :		
		case 9 :		student.grade ='A' ; break;
		case 8 :		student.grade ='B' ; break;
		case 7 :		student.grade ='C' ; break;
		case 6 :		student.grade ='D' ; break;
		default :		student.grade ='F' ; break;
		}
	}
}
