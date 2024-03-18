package Bai1;

public class Circle implements Ishape {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * 3.14;
	}

	@Override
	public double getPerimeter() {
		return r * 2 * 3.14;
	}

}
