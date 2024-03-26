package cursoUdemy.exe03;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double areaQ = rectangle.area();
		double perimetroQ = rectangle.perimeter();
		double diaginalQ = rectangle.diagonal();
		
		System.out.printf("AREA = %.2f%n", areaQ);
		System.out.printf("PERIMETER = %.2f%n", perimetroQ);
		System.out.printf("DIAGONAL = %.2f%n", diaginalQ);

		sc.close();
	}

}
