package aula;

public class Cubo extends Espacial {
	private double base;
	public Cubo (double base) {
		setBase(base);
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	double volume() {
		return Math.pow(base, 3);
	}

}
