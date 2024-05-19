package day3;

public class Example3 {
	//in ra số chẵn từ 1-100, sử dụng if trong vòng for
	public static void inSoChanCach1()
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i%2==0)
				System.out.print(i+"\t");
		}
	}	
	//in ra số chẵn từ 1-100, sử dụng điều kiện trong for
	public static void inSoChanCach2()
	{
		for(int i = 0; i <= 100; i+=2)
		{
			System.out.print(i+"\t");
		}
	}
	// in Họ và tên trong mảng chứa phần tử cho trước, sử dụng foreach
	public static void inHoVaTen()
	{
		String [] hoVaTen = {"Hai Nguyen", "Hoang Long", "Thu Trang", "Phuong Anh", "Xuan Thuc"};
		//int [] listNumber = {}
		for(String i : hoVaTen) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Các số chẵn từ 1-100 là: ");
		//inSoChanCach1();
		//inSoChanCach2();
		System.out.println("Danh sách các học viên: ");
		inHoVaTen();
	}

}
