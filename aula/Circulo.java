package aula;

public class Circulo extends Plana {
	private double raio;
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public Circulo (double raio) {
		setRaio(raio);
	}
	@Override
	double area() {
		
		return Math.PI * Math.pow(getRaio(), 2);
	}

	@Override
	double perimetro() {
		return 2 * Math.PI * getRaio();
	}

}
