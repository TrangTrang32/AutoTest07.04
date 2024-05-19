package homework_bai3;

import java.util.Scanner;

public class Dev extends NhanVien {
	private double troCap;
	private int luong;
	public double getTroCap() {
		return troCap;
	}
	public void setTroCap(double troCap) {
		this.troCap = troCap;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Trợ cấp dev: " );
		setTroCap(sc.nextDouble());
		System.out.print("Lương cơ bản dev: " );
		setLuong(sc.nextInt());
	}
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.print(" có trợ cấp: "+ getTroCap() + " và lương cơ bản là: "+getLuong());
	}

}
