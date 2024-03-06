package exercicio0603;
import java.util.Scanner;

public class ConsumoGasolina {
	public static void main(String[] args) {

		// Variáveis
		double valorgas, distancia, consumomed, litrosgast, custo;

		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Digite o valor do litro da gasolina :" );
		valorgas = ler.nextDouble();

		System.out.println("Digite a distância percorrida em km :" );
		distancia = ler.nextDouble();

		System.out.println("Digite o consumo médio em km :" );
		consumomed = ler.nextDouble();

		//Processamento
		litrosgast = distancia/consumomed;
		custo = valorgas*litrosgast;

		//Saída
		System.out.println("A quantidade de litros gastos foi: " + litrosgast + "E seu gasto total foi:" + custo);

		ler.close();
	}
}
