package exercicio0603;
import java.util.Scanner;

public class Triângulo {
	public static void main(String[] args) {
		// Variáveis
		double altura, base, area;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Digite a altura :" );
		altura = ler.nextDouble();

		System.out.println("Digite a base :" );
		base = ler.nextDouble();

		//Processamento
		area = (altura * base)/2;
		//Sáida
		System.out.println("A área do triângulo é : " + area);
		ler.close();

	}

}

