
public class Main {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student jimin = new Student(); // 주소를 호출해야함 (멤버변수)
		Input input = new Input(); input.input(jimin);
		Calc calc = new Calc();   calc.calc(jimin);
		Output output = new Output(); output.output(jimin);
		
		
		System.out.println("성적관리프로그램 끝");
	}
}
