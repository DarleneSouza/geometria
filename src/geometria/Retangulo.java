package geometria;

public class Retangulo {
	private double altura;
	private double base;
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}public void setBase(double base) {
		if(base > 0) {
			this.base = base;
		}
	}
		public double calcularArea() {
			double area = altura * base;
			return area;
			
		}
			
		public void desenhar() {
			for(int i=0; i<altura; i++) {
				System.err.print(". ");
				
				for(int j=0; j<base; j++) {
					if(i==0 || i+1 >= altura) {
						System.err.print(". ");
					}else {
						System.err.print("  ");
					}
				}
				System.err.println(".");
				
			}
			
		}
		
		}
	

