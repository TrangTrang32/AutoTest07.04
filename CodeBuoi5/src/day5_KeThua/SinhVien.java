package day5_KeThua;

public class SinhVien extends Nguoi{
	public String maSinhVien;
	public int soTinChiTichLuy;
	
	@Override
	public void diChoi()
	{
		System.out.println("Chỉ được đi chơi sau khi học và thi xong");
	}
	public void diHoc() {
		System.out.println("Sinh viên "+ maSinhVien + " học được số tín chỉ là: "+ soTinChiTichLuy);
	}

}
