package demo16;

import java.util.function.BiFunction;

interface Addable{
	public static float add (int a, float b) {
		return a+b;
		}
	public static float add (float a, float b) {
		return a+b;
		}
	public static String add (String a, String b) {
		return a+b;
		}
	public static int add (int a, int b) {
		return a+b;
		}
}
public class Example1 {
public static void main(String[] args) {
	BiFunction<Integer,Float,Float> add1 = Addable :: add;
	Float r1 = add1.apply(20, (float) 10.32);
			System.out.println(r1);
    BiFunction<Float,Float,Float> add2 = Addable :: add;
    Float r2 = add2.apply(40f, (float) 13.32);
			System.out.println(r2);
	BiFunction<String,String,String> add3 = Addable :: add;
	String r3 = add3.apply("good","morning");
			System.out.println(r3);
	BiFunction<Integer,Integer,Integer> add4 = Addable :: add;
	Integer r4 = add4.apply(122,100);
			System.out.println(r4);
}
}