package demo16;
interface strlen{
	void length(String a);
}
public class Example3 {
public static void main(String[] args) {
	strlen sl = (a)->{
		int L = a.length();
		System.out.println(L);
	};
	sl.length("Welcome");
}
}
