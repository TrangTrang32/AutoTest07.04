package day5;

public abstract class Shape {
	private String color = "red"; // có thể tạo setter để vẽ mỗi hình một màu
	public abstract void draw();
	public String getColor()
	{
		return color;
	}
}
