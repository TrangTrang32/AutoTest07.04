package day5_HinhHoc;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron ht = new HinhTron();
		ht.banKinh = 20;
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.chieuDai = 30;
		hcn.chieuRong = 20;
		ht.tinhDienTich();
		hcn.tinhDienTich();

	}

}
