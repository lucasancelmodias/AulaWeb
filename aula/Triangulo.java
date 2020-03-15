package aula;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	double area() {
		return super.area() / 2;
	}

	@Override
	double perimetro() {
		return (Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2))) * 3;
	}

}
