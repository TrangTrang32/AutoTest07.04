package ex2;

import java.util.Scanner;

public class Bai2 {
	public static void printLargeNumber(double n1, double n2)
	{
		if(n1 > n2)
			System.out.print("Số lớn hơn là: "+n1);
		else
			System.out.print("Số lớn hơn là: "+n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		n1 = scanner.nextDouble();
		System.out.println("Nhap so thu hai: ");
		n2 = scanner.nextDouble();
		printLargeNumber(n1, n2);

	}

}
