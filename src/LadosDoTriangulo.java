import java.util.Scanner;

public final class LadosDoTriangulo {

	public static void main(String[] args) {
		
 
		Scanner leitor = new Scanner (System.in);
		
		double lado1, lado2, lado3;
		
		
		
		System.out.println("Lado 1: ");
		lado1 = leitor.nextDouble();

		System.out.println("Lado 2: ");
		lado2 = leitor.nextDouble();
		
		System.out.println("Lado 3: ");
		lado3 = leitor.nextDouble();

		leitor.close();
		
		if ((lado1 < lado2 + lado3) && (lado2 <lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triangulo Equilatero");
			} else if ((lado1 == lado2) || (lado1 == lado3)) { 
				System.out.println("Triangulo Isosceles");
			} else { 
				System.out.println("Triangulo Escaleno");
			} 
		} else {
			System.out.println("Não é um triangulo");
		}
		
		
	}

	}
