package day3;

import java.util.Scanner;
//Vòng for đa khởi tạo
public class Example2 {
	public static void sumArray(int a[], int n)
	{
		int i, sum = 0;
		for(i = 0, sum = 0; i < n; sum+=a[i], i++)
		{}
		System.out.printf("Tổng các phần tử trong mảng là: "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số phần tử mảng: ");
		n = scanner.nextInt();
		int a[] = new int[n];
		//Nhập n phần tử trong mảng
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.printf("Nhập phần tử thứ " + (i+1) + ": ");
			a[i] = scanner.nextInt();
		}
		sumArray(a,n);

	}

}
