package geometria;

public class Quadrado {
	private double lado;
	public void setLado(double lado) {
		if(lado > 0) {
			this.lado = lado;
		}
		
	}
	
	public double calculaArea() {
		double area = lado * lado;
		return area;
	}
	
	public void desenhar() {
		for(int i=0; i<lado; i++) {
			System.err.print(". ");
			
			for(int j=0; j<lado; j++) {
				if(i==0 || i+1 >= lado) {
					System.err.print(". ");
				}else {
					System.err.print("  ");
				}
			}
			System.err.println(".");
		}
	}
	
	}
	

