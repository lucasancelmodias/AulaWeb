package aula;

public class Piramide extends Espacial {
	private Quadrado quadrado;	
	private double altura;
	private double base;
	public Piramide(double base, double altura) {
		this.quadrado = new Quadrado(base);
		setBase(base);
		setAltura(altura);
	}
	@Override
	double volume() {
		return (quadrado.area() * getAltura() / 3);
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

}
