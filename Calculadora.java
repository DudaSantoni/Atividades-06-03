package exercicio0603;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// Variáveis
		double a, b, som, sub, mult, div;

		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Valor 1 :" );
		a = ler.nextDouble();

		System.out.println("Valor 21 :" );
		b = ler.nextDouble();

		//Processamento
		som = a + b; 
		sub = a - b;
		mult = a * b;
		div = a / b;

		//Saída
		System.out.println("Soma: " +som +", " + "Subtração: " +sub+", " +"Multiplicação: " +mult +", " + "Divisão: " +div );
		ler.close();

	}

}

