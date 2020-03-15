package aula;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calculaDiagonal() {
		return Math.sqrt((getBase() * getBase()) + (getAltura() * getAltura()));
	}

	@Override
	double perimetro() {
		return (getBase() * 2) + (getAltura() * 2);
	}
}
