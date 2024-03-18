package Bai1;

public class Rectangle implements Ishape {
	private double length, width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}

}
