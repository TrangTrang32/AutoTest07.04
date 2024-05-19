package day5_TinhLuong;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lương của bác sĩ 1: "+ Double.valueOf(Salary.tinhLuong(1.3)).longValue());
		System.out.print("\nLương của bác sĩ 2: "+ Double.valueOf(Salary.tinhLuong(1.3, 2)).longValue());
		System.out.print("\nNhập Loại 1 - bác sĩ chuyên khoa hoặc Loại 2 - bác sỹ đa khoa: ");
		int loai = scanner.nextInt();
		System.out.print("\nLương của bác sĩ 3: "+ Double.valueOf(Salary.tinhLuong(1.3, 2, loai)).longValue());
	}

}
