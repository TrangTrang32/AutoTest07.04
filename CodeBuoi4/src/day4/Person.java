package day4;

public class Person {
	//khai báo các thuộc tính của đối tượng người
	private String name;
	private int age;
	private String mobileNumber;
	//getter
	public String getName()
	{
		return name;
	}
	//setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String newMobileNumber) {
		this.mobileNumber = newMobileNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
