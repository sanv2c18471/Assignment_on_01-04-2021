package demo16;
interface oddeven{
	void result(int a);
}
public class Example2 {
public static void main(String[] args) {
	oddeven oe =(a)->{
		if (a%2 == 0) {
			System.out.println("even");
		}else {
		System.out.println("odd");
	}
	};
	oe.result(20);
	oe.result(5);
}
}
