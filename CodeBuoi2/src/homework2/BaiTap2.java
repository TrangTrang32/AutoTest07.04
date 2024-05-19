package homework2;

import java.util.Scanner;

public class BaiTap2 {
	public static void sumArray(int a[], int n)
	{
		int sum = 0;
		//a = new int[n];
		for(int i = 0; i < n; i++)
		{
			sum += a[i];
		}
		System.out.printf("Tổng các phần tử trong mảng là: "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số phần tử mảng: ");
		n = scanner.nextInt();
		int a[] = new int[n];
		//Nhập n phần tử trong mảng
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.printf("Nhập phần tử thứ " + i + ": ");
			a[i] = scanner.nextInt();
		}
		sumArray(a,n);
		/*int sum = 0;
		for(int i = 0; i < n; i++)
			sum += a[i];
	    System.out.printf("Tổng các phần tử trong mảng là: "+ sum);*/
	}

}
