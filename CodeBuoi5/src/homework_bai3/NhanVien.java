package homework_bai3;

import java.util.Scanner;

public class NhanVien {
	private String maNV, hoTen;
	private String phongBan;
	private int soNgayDiLam;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public int getSoNgayDiLam() {
		return soNgayDiLam;
	}
	public void setSoNgayDiLam(int soNgayDiLam) {
		this.soNgayDiLam = soNgayDiLam;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã nhân viên: ");
		setMaNV(sc.next());
		System.out.print("Họ và tên: ");
		setHoTen(sc.next());
		System.out.println();
		System.out.print("Phòng ban: ");
		setPhongBan(sc.next());
		System.out.print("Số ngày đi làm: ");
		setSoNgayDiLam(sc.nextInt());
		
	}
	public void xuat()
	{
		System.out.println("Nhân viên "+ getHoTen() + " có mã nhân viên là: " + getMaNV() + " thuộc phòng ban" + getPhongBan()+ 
				" đi làm "+ getSoNgayDiLam() + " ngày");
	}
	
}
