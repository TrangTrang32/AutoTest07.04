package homework_bai3;

import java.util.Scanner;

public class BA extends NhanVien {
	private int thuongDA, luong;

	public int getThuongDA() {
		return thuongDA;
	}

	public void setThuongDA(int thuongDA) {
		this.thuongDA = thuongDA;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Thưởng dự án BA: " );
		setThuongDA(sc.nextInt());
		System.out.print("Lương cơ bản BA: " );
		setLuong(sc.nextInt());
	}
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.print(" có thưởng dự án: "+ getThuongDA() + " và lương cơ bản là: "+getLuong());
	}

}
