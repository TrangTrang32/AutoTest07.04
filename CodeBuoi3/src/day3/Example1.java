package day3;
import java.util.Scanner;

public class Example1 {
	public static void inSoLonHon(int n1, int n2)
	{
		//String result = (n1 >  n2) ? "Số lớn hơn là: " + n1 : "Số lớn hơn là: " +n2;
		int result = (n1 >  n2)? n1 : n2;
		System.out.printf("Số lớn hơn là: " +result);
	}
	public static void inSoChanLe(int num)
	{
		String result = (num % 2 == 0)? num + " là số chẵn" : num + " là số lẻ";
		System.out.print("\n"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số thứ nhất: ");
		int n1= scanner.nextInt();
		System.out.printf("Nhập số thứ hai: ");
		int n2= scanner.nextInt();
		//in số lớn hơn
		inSoLonHon(n1,n2);
		//in số chẵn lẻ của số thứ nhất
		inSoChanLe(n1);
	}

}
