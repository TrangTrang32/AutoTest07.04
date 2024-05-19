package day5_TinhLuong;

public class Salary {
	private static int luongCB = 10000000;
	//Tính lương với 2 tham số truyền vào
	public static double tinhLuong(double heSo)
	{
		return luongCB * heSo;
	}
	//Tính lương với 3 tham số truyền vào
	public static double tinhLuong(double heSo, int soNamKN){
		return luongCB * heSo * soNamKN;
	}
	//Tính lương với 4 tham số truyền vào
	public static double tinhLuong(double heSo, int soNamKN, int loai){
		switch (loai) {
		case 1: {
			
			return luongCB * heSo * soNamKN + luongCB * 0.2;
		}
		case 2: {
			
			return luongCB * heSo * soNamKN +  luongCB* 0.45;
		}
		default:
			return 0; //Không phải loại 1 và loại 2
		}
	}
		
}
