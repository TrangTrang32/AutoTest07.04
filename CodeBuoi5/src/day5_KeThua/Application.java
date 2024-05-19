package day5_KeThua;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaoVien gv1 = new GiaoVien();
		gv1.maGV = "GV001";
		gv1.soGioDay1Tuan =  "20";
		gv1.diDay();
		gv1.diChoi();
		
		SinhVien sv1 = new SinhVien();
		sv1.maSinhVien = "SV001";
		sv1.soTinChiTichLuy = 100;
		sv1.diHoc();
		sv1.diChoi();

	}

}
