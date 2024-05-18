package day7;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SumArray {
	public static void inputArray(double a[], int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < n; i++)
		{
			System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
			a[i] = sc.nextDouble();
		}
	}
	public static void sumArray(double []a, int n) {
		double sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += a[i];
		}
		DecimalFormat format = new DecimalFormat("0.##");
		System.out.println("\nTổng các phần tử trong mảng là: "+ format.format(sum));
		
	}
	public static void showArray(double []a, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < n; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số phần tử mảng: ");
		n = scanner.nextInt();
		double a[] = new double[n];
		System.out.println("----Nhập mảng----");
		inputArray(a,n);
		System.out.println("Hiển thị mảng: ");
		showArray(a,n);
		//Tính tổng các phần tử trong mảng
		sumArray(a,n);

	}

}
