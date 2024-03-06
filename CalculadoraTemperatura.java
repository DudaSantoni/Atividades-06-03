package exercicio0603;
import java.util.Scanner;

public class CalculadoraTemperatura {
	public static void main(String[] args) {
		// Variáveis
		double celsius, fahrenheit;

		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);


		//Entrada de dados
		System.out.println("Coloque a temperatura :" );
		fahrenheit = ler.nextDouble();


		//Processamento
		celsius = ((fahrenheit - 32)*5)/9;

		//Saída
		System.out.println("A temperatura em ºC é : " + celsius);
		ler.close();



	}
}