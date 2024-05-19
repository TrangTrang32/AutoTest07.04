package homework_bai3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester tester = new Tester();
		//tester.nhap();
		//tester.xuat();
		System.out.println("Nhập thông tin 2 tester:");
		for(int i = 0; i < 2; i++) {
			System.out.println("Nhập thông tin tester thứ " + (i+1)+ ":");
			tester.nhap();
		}
		System.out.println("Hiển thị thông tin 2 tester:");
		for(int i = 0; i < 2; i++) {
			System.out.println("\nThông tin tester thứ " + (i+1)+ ":");
			tester.xuat();
		}
		Dev dev = new Dev();
		System.out.println("\nNhập thông tin 2 dev:");
		for(int i = 0; i < 2; i++) {
			System.out.println("Nhập thông tin dev thứ " + (i+1)+ ":");
			dev.nhap();
		}
		System.out.println("\nHiển thị thông tin 2 dev:");
		for(int i = 0; i < 2; i++) {
			System.out.println("\nThông tin dev thứ " + (i+1)+ ":");
			dev.xuat();
		}
		BA ba = new BA();
		System.out.println("\nNhập thông tin 2 BA:");
		for(int i = 0; i < 2; i++) {
			System.out.println("Nhập thông tin BA thứ " + (i+1)+ ":");
			ba.nhap();
		}
		System.out.println("\nHiển thị thông tin 2 BA:");
		for(int i = 0; i < 2; i++) {
			System.out.println("\nThông tin BA thứ " + (i+1)+ ":");
			ba.xuat();
			System.out.println();
		}

	}

}
