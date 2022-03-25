package geometria;

public class Main {

	public static void main(String[] args) {

		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(8);
		
		double areaQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("Area quadrado: " + areaQuadrado);
		
		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
		
		Retangulo primeiroRetangulo = new Retangulo();
		primeiroRetangulo.setAltura(4);
		primeiroRetangulo.setBase(5);		
		
		double areaRetangulo = primeiroRetangulo.calcularArea();
		System.out.println("Area retangulo: " + areaRetangulo);
		
		System.out.println("Desenho retangulo: ");
		primeiroRetangulo.desenhar();

		
		Circulo primeiroCirculo = new Circulo();
		primeiroCirculo.setRaio(3);
		
		double areaCirculo = primeiroCirculo.calcularArea(); 
		System.out.println("Area do circulo: " + areaCirculo);
		
		Triangulo primeiroTriangulo = new Triangulo();
		primeiroTriangulo.setAltura(2);
		primeiroTriangulo.setBase(4);
		
		double areaTriangulo = primeiroTriangulo.calcularAreaTriangulo();
		System.out.println("Area do triangulo: " + areaTriangulo);
		
		
	}

}
