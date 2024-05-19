package day3;
import java.util.Scanner;
public class BubbleSort {
	//Sắp xếp dãy số tăng dần bằng thuật toán nổi bọt - Bubble Sort
	public static void sort(int a[])
	{
		int temp;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length - 1; j++)
			{
				if(a[j]> a[j+1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}			
		}
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
		System.out.printf("Dãy số được sắp xếp theo thứ tự tăng dần là: ");
		sort(a);
		for (int i = 0; i < n; i++)
			System.out.print(a[i]+"   "); 
	}

}
