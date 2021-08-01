package GeometryShapes;

public class Sphere implements ThreeDimensionalShapes {

	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double surfaceArea() {
		double area = 4 * 3.14 * (radius * radius);
		return area;
	}

	@Override
	public double volume() {
		double volume = (4 / 3) * 3.14 * (radius * radius * radius);
		return volume;
	}

}
