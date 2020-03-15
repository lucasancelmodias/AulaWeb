package aula;

public class Cilindro extends Espacial {
	private double raio;
	private double altura;
	public Cilindro(double raio, double altura) {
		setRaio(raio);
		setAltura(altura);
		
	}
	@Override
	double volume() {
		return Math.PI * Math.pow(getRaio(), 3) * getAltura();
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

}
