package day5_Overloading;

public class Adder {
	//Tính tổng 2 số nguyên
	public static void add(int a, int b) {
		System.out.println(a+b);
		
	}
	//Tính tổng 3 số nguyên
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	//Tính tổng 3 số thập phân
		public static void add(double a, double b, double c) {
			System.out.println(a+b+c);
			
		}
}
