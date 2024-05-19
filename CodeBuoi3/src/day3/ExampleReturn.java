package day3;
import java.util.Scanner;

public class ExampleReturn {
	//So sánh 2 số dùng return
	public static int soLonHon(int n1, int n2)
	{
		if(n1 > n2)
			return n1;
		else
			return n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Số lớn hơn là: "+soLonHon(1344545,67667878));

	}

}
