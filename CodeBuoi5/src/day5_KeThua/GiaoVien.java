package day5_KeThua;

public class GiaoVien extends Nguoi{
	public String maGV, soGioDay1Tuan;
	
	public void diDay()
	{
		System.out.println("Giáo viên "+ maGV + " đi dạy số giờ trên tuần là: "+ soGioDay1Tuan);
	}
	public void diChoi()
	{
		System.out.println("Giáo viên đi chơi sau khi dạy hết số giờ: "+soGioDay1Tuan);
	}

}
