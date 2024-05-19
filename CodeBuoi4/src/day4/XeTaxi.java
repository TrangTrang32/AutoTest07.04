package day4;

public class XeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe taxi = new Xe();
		taxi.setTenXe("Hyundai");
		taxi.setLoaiXe("xe taxi");
		taxi.setVanTocMax(150);
		System.out.println("Tên xe: "+ taxi.getTenXe() + ", Loại xe: " + taxi.getLoaiXe() + ", Vận tốc max: " + 
				taxi.getVanTocMax());

	}

}
