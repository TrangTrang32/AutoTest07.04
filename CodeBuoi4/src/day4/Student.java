package day4;

public class Student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person studentA = new Person();
		studentA.setName("Hoàng Long");
		studentA.setAge(28);
		studentA.setMobileNumber("0942303564");
		
		System.out.println("Nhập thông tin sinh viên 1:\nHọ và tên: " + studentA.getName() + "\nTuổi: " +studentA.getAge() + 
				"\nSố điện thoại: " + studentA.getMobileNumber());
		
		Person studentB = new Person();
		studentB.setName("Phạm Trang");	
		studentB.setAge(24);
		studentB.setMobileNumber("0374014504");
		
		System.out.println("\nNhập thông tin sinh viên 2:\nHọ và tên: " + studentB.getName() + "\nTuổi: " +studentB.getAge() + 
				"\nSố điện thoại: " + studentB.getMobileNumber());

	}
}
