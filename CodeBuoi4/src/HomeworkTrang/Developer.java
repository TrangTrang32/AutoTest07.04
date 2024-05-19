package HomeworkTrang;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee dev1 = new Employee();
		dev1.setEmployeeId("NV01");
		dev1.setEmployeeName("Phạm Trang");
		System.out.println("Thông tin developer 1: \n Mã nhân viên: "+ dev1.getEmployeeId()+
				"\n Họ tên: " + dev1.getEmployeeName() + "\n Lương: " + dev1.getEmployeeSalary());
		Employee dev2 = new Employee();
		dev2.setEmployeeId("NV02");
		dev2.setEmployeeName("Nguyễn Quang");
		System.out.println("Thông tin developer 2: \n Mã nhân viên: "+ dev2.getEmployeeId()+
				"\n Họ tên: " + dev2.getEmployeeName() + "\n Lương: " + dev2.getEmployeeSalary());
/*Thông tin lương là thông tin private, khi không gọi hàm set để cập nhật, 
		giá trị về lương của nhân viên sẽ được mặc định = 0*/
	}

}
