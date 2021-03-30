package solid;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public double calculate() {
		return this.area();
	}
}
