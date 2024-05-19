package homework;

import java.util.Scanner;

public class BaiTap3 {
	//1.	Tìm giá trị nhỏ nhất của mảng số nguyên được nhập vào từ bàn phím.
	public static int findMin(int a[])
	{
		int min = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(min > a[i])
				min = a[i];
		}
		return min;
	}
	//2.	Tìm giá trị lớn nhất của mảng số thập phân được nhập vào từ bàn phím.
	public static double findMax(double a[])
	{
		double max = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số phần tử mảng: ");
		n = scanner.nextInt();
		int a[] = new int[n];
		//Nhập n phần tử trong mảng số nguyên
		System.out.println("Nhập các phần tử cho mảng số nguyên: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.printf("Nhập phần tử thứ " + (i+1) + ": ");
			a[i] = scanner.nextInt();
		}
		System.out.printf("Số nhỏ nhất trong mảng là: "+ findMin(a));
		//Nhập n phần tử trong mảng số thập phân
		double b[] = new double[n];
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\nNhập các phần tử cho mảng số thập phân: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.printf("Nhập phần tử thứ " + (i+1) + ": ");
			b[i] = scanner1.nextDouble();
		}
		System.out.printf("Số lớn nhất trong mảng là: "+ findMax(b));

	}

}
