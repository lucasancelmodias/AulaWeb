package aula;

public class Esfera extends Espacial {
	private double raio;
	public Esfera(double raio) {
		setRaio(raio);
	}
	@Override
	double volume() {
		return (4 * (Math.PI * Math.pow(getRaio(), 3)) / 3);
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

}
