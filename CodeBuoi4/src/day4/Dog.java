package day4;

public class Dog {
	//Nhập thông tin loại chó, kích thước, màu lông và in ra thông tin
	String breed;
	String size;
	int age;
	String color;
	public String getInfo()
	{
		return "Breed is: " + breed + " size is: " + size + " age is: "+ age + " color is: " + color;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chó Beggie
		Dog beggie = new Dog();
		beggie.breed = "Beggie";
		beggie.size = "Big";
		beggie.age = 2;
		beggie.color = "Brown";
		System.out.println(beggie.getInfo());
		
		//Chó fog
		Dog fog =new Dog();
		fog.breed = "Fog";
		fog.size = "Medium";
		fog.age = 1;
		fog.color = "yellow";
		System.out.println(fog.getInfo());
	}

}
