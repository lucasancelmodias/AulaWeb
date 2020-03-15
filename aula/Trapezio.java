package aula;

public class Trapezio extends Plana {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public Trapezio(double baseMaior, double baseMenor, double altura) {
		setBaseMaior(baseMaior);
		setBaseMenor(baseMenor);
		setAltura(altura);
	}
	@Override
	double area() {
		return ((getBaseMaior() + getBaseMenor()) * getAltura()) / 2;
	}

	@Override
	double perimetro() {
		double baseLado = (getBaseMaior() - getBaseMenor()) / 2;
		double lado = Math.sqrt(Math.pow(baseLado, 2) + Math.pow(baseLado, 2));
		return getBaseMaior() + getBaseMenor() + (lado * 2);
	}
	public double getBaseMaior() {
		return baseMaior;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
