package day4;

public class Motobike {
	String hang;
	String mau;
	String bien;
	String ngay;
	
	public String getInfoMotobike()
	{
		return "Hãng xe: " + hang + "\nMàu xe: " + mau + "\nBiển số xe: " + bien + "\nNgày đăng ký: " + ngay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike wave = new Motobike();
		wave.hang = "Honda";
		wave.mau = "Đen";
		wave.bien = "19K1 - 02471";
		wave.ngay = "02-01-2022";
		System.out.println("Nhập thông tin xe 1: \n" + wave.getInfoMotobike());

	}

}
