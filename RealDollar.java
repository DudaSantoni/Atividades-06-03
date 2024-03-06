package exercicio0603;
import java.util.Scanner;

public class RealDollar {
	public static void main(String[] args) {
        // Variáveis
		double real, conversao;
		 //Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
				
		 //Entrada de dados
				System.out.println("Digite o valor em real :" );
		real = ler.nextDouble();
		
		//Processamento
		conversao = real*4.94;
		//Sáida
		System.out.println("A conversão para dollar é : " + conversao);
		ler.close();
		
		}
}
