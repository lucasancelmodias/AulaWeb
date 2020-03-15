package aula;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	double perimetro() {
		return getBase() * 4;
	}
}
