package homework_bai3;

import java.util.Scanner;

public class Tester extends NhanVien {
	private double phuCap;
	private int luong;
	
	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	@Override
	public void nhap()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Phụ cấp tester: " );
		setPhuCap(sc.nextDouble());
		System.out.print("Lương cơ bản tester: " );
		setLuong(sc.nextInt());
	}
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.print(" có phụ cấp: "+ getPhuCap() + " và lương cơ bản là: "+getLuong());
	}

}
