package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int multiplican, multiplicad, cont = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("qual o Multiplicando?");
		multiplican = entrada.nextInt();
		System.out.print("qual o Multiplicador máximo?");
		multiplicad = entrada.nextInt();
		entrada.close();
		System.out.println(" ");
		System.out.println("Aqui está a tabuada do " + multiplican);
		System.out.println(" ");
		
		while (cont < multiplicad) {
			

			cont++;
			System.out.println( multiplican + " x " + cont + " = " + multiplican * cont);
			
			
			
		}

	}

}
