package aula;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Retangulo(12, 2));
		figuras.add(new Quadrado(16));
		figuras.add(new Triangulo(4, 3));
		figuras.add(new Losango(25, 7));
		figuras.add(new Circulo(13));	
		for (Figura f : figuras) {
			if (f instanceof Retangulo) {
				System.out.println("햞ea do Retangulo: " + ((Poligono) f).area());
				System.out.println("Diagonal do Retangulo: " +((Retangulo) f).calculaDiagonal());
				System.out.println("Perimentro do Retangulo: " +((Retangulo) f).perimetro());
			}
			if (f instanceof Quadrado) {
				System.out.println("햞ea do Quadrado: " + ((Poligono) f).area());
				System.out.println("Diagonal do Quadrado: " +((Quadrado) f).calculaDiagonal());
				System.out.println("Perimentro do Quadrado: " +((Quadrado) f).perimetro());
			}

			if (f instanceof Triangulo) {
				System.out.println("햞ea do Triangulo: " + ((Poligono) f).area());
				System.out.println("Perimentro do Triangulo: " +((Poligono) f).perimetro());
			}

			if (f instanceof Losango) {
				System.out.println("햞ea do Losango: " + ((Poligono) f).area());
				System.out.println("Perimentro do Losango: " +((Poligono) f).perimetro());
			}
			if (f instanceof Circulo) {
				System.out.println("햞ea do Circulo: " + ((Circulo) f).area());
				System.out.println("Perimetro do Circulo: " +((Circulo) f).perimetro());
			}
		}
		Trapezio trap = new Trapezio(8, 3, 5);
		System.out.println("Trapezio Area" + trap.area());
		System.out.println("Trapezio Perimetro" + trap.perimetro());
	}
}
