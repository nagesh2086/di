package solid;

public class Cuboid implements ThreeDimensionalShapeInterface {
	private double cuboidVolumme;

	public Cuboid(double cuboidVolumme) {
		this.cuboidVolumme = cuboidVolumme;
	}

	public double getCuboidVolumme() {
		return cuboidVolumme;
	}

	@Override
	public double calculate() {
		return volumme();
	}

	@Override
	public double volumme() {
		return Math.pow(this.cuboidVolumme, 3);
	}
}
