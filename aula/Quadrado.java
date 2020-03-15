package aula;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base) {
		super(base, base);
	}

	@Override
	public double calculaDiagonal() {
		return Math.sqrt((getBase() * getBase()) + (getAltura() * getAltura()));
	}

	@Override
	double perimetro() {
		return getBase() * 4;
	}

}
