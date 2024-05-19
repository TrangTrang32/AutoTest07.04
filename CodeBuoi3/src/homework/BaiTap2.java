package homework;

import java.util.Scanner;

/*Nhập vào một dãy số từ bàn phím, nếu gặp số nào chia hết cho cả 2 và 3 
thì in ra dòng chữ “Điều kiện thoát xảy ra!” và thoát chương trình mặc dù chưa hết dãy số. */
public class BaiTap2 {
	public static int soChiaHet(int num)
	{
		if(num % 2 == 0 && num % 3 == 0)
			return num;
		return num;	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean temp = false;
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
			if(a[i] % 2 == 0 && a[i] % 3 == 0)
			{
				soChiaHet(a[i]);
				System.out.print("Điều kiện thoát xảy ra!");
				temp = true;
				break;
			}
		}
		
		if(temp !=true)
			System.out.println("Các phần tử mảng không có số nào chia hết cho cả 2 và 3");
	}
}
